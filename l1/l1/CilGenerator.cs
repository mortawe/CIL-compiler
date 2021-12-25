using System;
using System.Collections.Generic;
using System.IO;
using System.Reflection;
using System.Reflection.Emit;
using Antlr4.Runtime.Tree;
using l1.ObjectDefs;

namespace l1
{
    public class CilGenerator : L1BaseListener
    {
        public CilGenerator(IParseTree tree, string filename)
        {
            _fileName = filename;
            _tree = tree;
            _programName = Path.GetFileNameWithoutExtension(_fileName);
            _assemblyName = new AssemblyName {Name = _programName};
            _assemblyBuilder = AppDomain.CurrentDomain.DefineDynamicAssembly(_assemblyName, AssemblyBuilderAccess.Save);
            _moduleBuilder = _assemblyBuilder.DefineDynamicModule(_programName, _programName + ".exe", false);
            _typeBuilder = _moduleBuilder.DefineType("L1");
            _functions = new Dictionary<string, MethodDef>();
        }

        public void Generate()
        {
            DefineFunctions();
            ParseTreeWalker.Default.Walk(this, _tree);
            _typeBuilder.CreateType(); // finish type
            _assemblyBuilder.SetEntryPoint(_entryPoint);
            _assemblyBuilder.Save(_programName + ".exe");
        }

        private void DefineIO()
        {
            var writeStringLineMethod = typeof(Console).GetMethod("WriteLine", BindingFlags.Public | BindingFlags.Static, null,
                new Type[] { typeof(string) }, null);
            var writeIntLineMethod = typeof(Console).GetMethod("WriteLine", BindingFlags.Public | BindingFlags.Static, null,
                new Type[] { typeof(int)}, null);
            var outStringLineBuilder = _typeBuilder.DefineMethod("PrintString", MethodAttributes.Public, CallingConventions.Standard,
                _typeBuilder, new Type[] { typeof(string) });
            var il = outStringLineBuilder.GetILGenerator();
            il.Emit(OpCodes.Ldarg_1);
            il.Emit(OpCodes.Call, writeStringLineMethod);
            il.Emit(OpCodes.Ldarg_0);
            il.Emit(OpCodes.Ret);
            _functions.Add("PrintString", new MethodDef("PrintString",
                new Dictionary<string, ArgObjectDef>() 
                {
                    { "this", new ArgObjectDef(_typeBuilder, 0, "this") }, 
                    { "x", new ArgObjectDef(typeof(string), 1, "x") }
                }, outStringLineBuilder, new Label()));

            var outIntLineBuilder = _typeBuilder.DefineMethod("PrintInt", MethodAttributes.Public, CallingConventions.Standard,
                _typeBuilder, new Type[] { typeof(int) });
            il = outIntLineBuilder.GetILGenerator();
            il.Emit(OpCodes.Ldarg_1);
            il.Emit(OpCodes.Call, writeIntLineMethod);
            il.Emit(OpCodes.Ldarg_0);
            il.Emit(OpCodes.Ret);
            _functions.Add("PrintInt", new MethodDef("PrintInt",
                new Dictionary<string, ArgObjectDef>() 
                {
                    { "this", new ArgObjectDef(_typeBuilder, 0, "this") }, 
                    { "x", new ArgObjectDef(typeof(int), 1, "x") }
                }, outIntLineBuilder, new Label()));

        }
        private void DefineFunctions()
        {
            DefineIO();
            var programCtx = (L1Parser.ProgramContext) _tree;
            foreach (var function in programCtx.function())
            {
                var args = new Dictionary<string, ArgObjectDef>();
                Type[] inputTypes;
                args.Add("this", new ArgObjectDef(_typeBuilder, 0, "this"));
                if (function.var_list().ChildCount > 0)
                {
                    inputTypes = new Type[function.var_list().type().Length];
                    for (var i = 0; i < function.var_list().type().Length; i++)
                    {
                        inputTypes[i] = GetType(function.var_list().type(i));
                        var argName = function.var_list().IDENT(i).GetText();
                        args.Add(argName, new ArgObjectDef(inputTypes[i], i + 1, argName));
                    }
                }
                else
                {
                    inputTypes = Type.EmptyTypes;
                }

                MethodBuilder methodBuilder;

                if (function.IDENT().GetText() == "Main")
                {
                    methodBuilder = _typeBuilder.DefineMethod(function.IDENT().GetText(),
                        MethodAttributes.Static | MethodAttributes.Public,
                        typeof(void), new[] {typeof(string[])});
                    _entryPoint = methodBuilder;
                }
                else
                {
                    methodBuilder = _typeBuilder.DefineMethod(function.IDENT().GetText(),
                        MethodAttributes.Public,
                        GetType(function.type()), inputTypes);
                }

                _functions.Add(function.IDENT().GetText(),
                    new MethodDef(function.IDENT().GetText(), args, methodBuilder, methodBuilder.GetILGenerator().DefineLabel()));
            }
        }

        private Type GetType(L1Parser.TypeContext type)
        {
            Type result = null;
            if (type == null) return typeof(void);
            var typeName = type.BASE_TYPE().GetText();
            switch (typeName)
            {
                case "int":
                    result = typeof(int);
                    if (type.ARRAY().Length == 0) return result;
                    var arrI = new int[] { };
                    return arrI.GetType();
                case "bool":
                    result = typeof(bool);
                    if (type.ARRAY().Length == 0) return result;
                    var arrB = new bool[] { };
                    return arrB.GetType();
                case "char":
                    result = typeof(char);
                    if (type.ARRAY().Length == 0) return result;
                    if (type.ARRAY().Length == 1) return typeof(string);
                    return typeof(string[]);
            }
            return null;
        }

        #region Listeners

        public  void EmitOp_assert(L1Parser.Op_assertContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            var cond = EmitExpr(ctx.expr());
            var exitL = il.DefineLabel();
            var throwL = il.DefineLabel();
            cond.Load();
            il.Emit(OpCodes.Brtrue, exitL);
            il.ThrowException(typeof(OverflowException));
            il.MarkLabel(exitL);
        }

        public override void EnterFunction(L1Parser.FunctionContext context)
        {
            var functionName = context.IDENT().GetText();
            _currentFun = _functions[functionName];
            LocalObjectDef.InitGenerator(_currentFun.MethodBuilder.GetILGenerator());
            var il = _currentFun.MethodBuilder.GetILGenerator();
            il.Emit(OpCodes.Ldarg, 0);
            for (var i = 1; i < context.var_list().type().Length + 1; i++)
            {
                il.Emit(OpCodes.Ldarg, i);
                var type = context.var_list().type(i - 1);
                var id = context.var_list().IDENT(i - 1);
                LocalObjectDef.AllocateLocal(GetType(type), _currentFun.Name + id.GetText());
            }

            EmitFunction_body(context.function_body());
        }

        public override void ExitFunction(L1Parser.FunctionContext context)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            il.MarkLabel(_currentFun.RetLabel);
            if (context.type() != null)
            {
                il.Emit(OpCodes.Pop);
                LocalObjectDef.GetLocalObjectDef(_currentFun.Name + "ret").Load();
            }
            else 
                il.Emit(OpCodes.Pop);
            il.Emit(OpCodes.Ret);
            _currentFun = null;
        }


        private void EmitOp_definition(L1Parser.Op_definitionContext ctx)
        {
            var expr = ctx.expr();
            var id = ctx.IDENT().GetText();
            if (expr != null)
            {
                var returnObjDef = EmitExpr(expr);
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, _currentFun.Name + id);
            }
            else
            {
                ObjectDef returnObjDef = new ValueObjectDef(GetType(ctx.type()));
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, _currentFun.Name + id);
            }
        }

        private  void EmitOp_assign(L1Parser.Op_assignContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            var returnObjDef = EmitExpr(ctx.expr());
            if (ctx.IDENT() != null)
            {
                var id = ctx.IDENT().GetText();
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, _currentFun.Name + id);
                return;
            }

            var arr = LocalObjectDef.GetLocalObjectDef(_currentFun.Name +
                                                       ctx.array_elem().IDENT().GetText());
            var arId = EmitExpr(ctx.array_elem().expr(0));
            arr.Load();
            arId.Load();
            returnObjDef.Load();
            if (arr.ElemType.IsArray)
            {
                il.Emit(OpCodes.Stelem_Ref);
            }
            else
            {
                il.Emit(OpCodes.Stelem, arr.ElemType);
            }

        }

        private  void EmitOp_return(L1Parser.Op_returnContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();

            var expr = ctx.expr();
            if (expr != null)
            {
                var returnObjDef = EmitExpr(expr);
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, _currentFun.Name + "ret");
            }
            il.Emit(OpCodes.Br, _currentFun.RetLabel);
            // il.Emit(OpCodes.Ret);
        }

        private  void EmitOp_while_pre(L1Parser.Op_while_preContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            var checkL = il.DefineLabel();
            var exitL = il.DefineLabel();
            il.MarkLabel(checkL);
            var expr = EmitExpr(ctx.expr());
            expr.Load();
            il.Emit(OpCodes.Brfalse, exitL);
            EmitFunction_body(ctx.function_body());
            il.Emit(OpCodes.Br, checkL);
            il.MarkLabel(exitL);
        }

        private void EmitFunction_body(L1Parser.Function_bodyContext context)
        {
            foreach (var stmt in context.stmt()) EmitStmt(stmt);
        }

        private  void EmitStmt(L1Parser.StmtContext context)
        {
            if (context.op_definition() != null)
                EmitOp_definition(context.op_definition());
            if (context.op_assign() != null)
                EmitOp_assign(context.op_assign());
            if (context.op_if() != null)
                EmitOp_if(context.op_if());
            if (context.op_return() != null)
                EmitOp_return(context.op_return());
            if (context.op_while_pre() != null)
                EmitOp_while_pre(context.op_while_pre());
            if (context.op_assert() != null)
                EmitOp_assert(context.op_assert());
            if (context.op_for() != null)
                EmitOp_for(context.op_for());
            if (context.op_while_post() != null) 
                EmitOp_while_post(context.op_while_post());
            if (context.op_func_call() != null)
                EmitFuncCall(context.op_func_call());

        }

        private void EmitOp_while_post(L1Parser.Op_while_postContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            var emitL = il.DefineLabel();
            var exitL = il.DefineLabel();
            il.MarkLabel(emitL);
            EmitFunction_body(ctx.function_body());
            var expr = EmitExpr(ctx.expr());
            expr.Load();
            il.Emit(OpCodes.Brfalse, exitL);
            il.Emit(OpCodes.Br, emitL);
            il.MarkLabel(exitL);
        }
        private void EmitOp_for(L1Parser.Op_forContext ctx)
        {
            string iterName = "";

            var il = _currentFun.MethodBuilder.GetILGenerator();
            if (ctx.op_definition() != null)
            {
                iterName = ctx.op_definition().IDENT().GetText();
                EmitOp_definition(ctx.op_definition());
            }

            if (ctx.op_assign() != null)
            {
                iterName = ctx.op_assign().IDENT().GetText();
                EmitOp_assign(ctx.op_assign());
            }
            var to = EmitExpr(ctx.expr(0));
            ObjectDef step;
            if (ctx.expr().Length > 1)
            {
                step = EmitExpr(ctx.expr(1));
            }
            else
            {
                step = new ValueObjectDef(typeof(int), 1);
            }
            Label checkL = il.DefineLabel();
            Label exitL = il.DefineLabel();
            var iter = LocalObjectDef.GetLocalObjectDef(_currentFun.Name + iterName);
            ObjectDef iterVar;
            string iterVarName = _currentFun.Name + iterName;
            if (iter.Type == typeof(char))
            {
                iter.Load();
                iterVar = LocalObjectDef.AllocateLocal(typeof(int), _currentFun.Name + iterName + "int");
                iterVarName = _currentFun.Name + iterName + "int";
            }
            else
            {
                iterVar = iter;
            }
            il.MarkLabel(checkL);
            iterVar.Load();
            to.Load();
            il.Emit(OpCodes.Clt);
            il.Emit(OpCodes.Brfalse, exitL);
            EmitFunction_body((ctx.function_body()));
            iterVar.Load();
            step.Load();
            il.Emit(OpCodes.Add);
            iterVar = LocalObjectDef.AllocateLocal(typeof(int), iterVarName);
            if (iterVarName != _currentFun.Name + iterName)
            {
                iterVar.Load();
                iter = LocalObjectDef.AllocateLocal(typeof(char),_currentFun.Name + iterName);
            }
            il.Emit(OpCodes.Br, checkL);
            il.MarkLabel(exitL);
        }
        public  void EmitOp_if(L1Parser.Op_ifContext ctx)
        {
            var exitLs = new List<Label>();

            var il = _currentFun.MethodBuilder.GetILGenerator();
            for (var i = 0; i < ctx.expr().Length; i++)
            {
                var cond = EmitExpr(ctx.expr(i));
                cond.Load();
                var exitL = il.DefineLabel();
                var elseL = il.DefineLabel();
                il.Emit(OpCodes.Brfalse, elseL);
                EmitFunction_body(ctx.function_body(i));
                il.Emit(OpCodes.Br, exitL);
                il.MarkLabel(elseL);
                exitLs.Add(exitL);
            }

            if (ctx.function_body().Length > ctx.expr().Length)
                EmitFunction_body(ctx.function_body(ctx.function_body().Length - 1));

            foreach (var exitL in exitLs) il.MarkLabel(exitL);
        }

        #endregion

        #region Emit

        private ObjectDef EmitFuncCall(L1Parser.Op_func_callContext ctx)
        {
            var args = new List<ObjectDef>();

            for (var i = 0; i < ctx.fact_params().expr().Length; i++)
            {
                var expr = EmitExpr(ctx.fact_params().expr(i));
                args.Add(expr);
            }

            var callF = _functions[ctx.IDENT().GetText()];
            var il = _currentFun.MethodBuilder.GetILGenerator();

            var mb = callF.MethodBuilder;
            il.Emit(OpCodes.Ldarg_0);
            foreach (var a in args) a.Load();

            il.Emit(OpCodes.Call, mb);

            foreach (var a in args) a.Remove();
            if (callF.MethodBuilder.ReturnType.IsArray)
                return LocalObjectDef.AllocateLocal(callF.MethodBuilder.ReturnType,
                    "", callF.MethodBuilder.ReturnType.GetElementType());
            return LocalObjectDef.AllocateLocal(callF.MethodBuilder.ReturnType);
        }

        private ObjectDef EmitPower(L1Parser.PowerContext p)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            var prevFactor = EmitAtom(p.atom_expr());
            for (var i = 0; i < p.power().Length; i++)
            {
                var factor = EmitPower(p.power(i));
                prevFactor.Load();
                factor.Load();
                var method = typeof(Math).GetMethod("Pow", BindingFlags.Public | BindingFlags.Static, null,
                    new[] {typeof(float), typeof(float)}, null);
                il.Emit(OpCodes.Call, method);
                prevFactor = LocalObjectDef.AllocateLocal(typeof(int));
            }

            return prevFactor;
        }
        private ObjectDef EmitTerm(L1Parser.TermContext t)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            ObjectDef prevFactor = null;
            for (var i = 0; i < t.power().Length; i++)
            {
                var factor = EmitPower(t.power(i));
                var op = t.MULT(i - 1);

                if (prevFactor != null)
                {
                    prevFactor.Load();
                    factor.Load();
                    switch (op.GetText())
                    {
                        case "*":
                        {
                            il.Emit(OpCodes.Mul);
                            break;
                        }
                        case "/":
                        {
                            il.Emit(OpCodes.Div);
                            break;
                        }
                        case "mod":
                        {
                            il.Emit(OpCodes.Div_Un);
                            break;
                        }
                    }

                    factor.Remove();
                    prevFactor.Remove();
                    prevFactor = LocalObjectDef.AllocateFromObjectDef(factor);
                }
                else
                {
                    prevFactor = factor;
                }
            }


            return prevFactor;
        }

        private ObjectDef EmitArith(L1Parser.Arith_exprContext arith)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            ObjectDef prevTerm = null;
            for (var m = 0; m < arith.term().Length; m++)
            {
                var t = arith.term(m);
                var prevFactor = EmitTerm(t);
                if (prevTerm != null)
                {
                    prevTerm.Load();
                    prevFactor.Load();
                    switch (arith.ARITH(m - 1).GetText())
                    {
                        case "+":
                            il.Emit(OpCodes.Add);
                            break;
                        case "-":
                            il.Emit(OpCodes.Sub);
                            break;
                    }

                    prevTerm.Remove();
                    prevFactor.Remove();
                    prevTerm = LocalObjectDef.AllocateFromObjectDef(prevFactor);
                }
                else
                {
                    prevTerm = prevFactor;
                }
            }

            return prevTerm;
        }

        private ObjectDef EmitComp(L1Parser.CompContext comp)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            ObjectDef prevArith = null;
            for (var j = 0; j < comp.arith_expr().Length; j++)
            {
                var arith = comp.arith_expr(j);
                var prevTerm = EmitArith(arith);


                if (prevArith != null)
                {
                    prevArith.Load();
                    prevTerm.Load();
                    switch (comp.COMPARE(j - 1).GetText())
                    {
                        case ">":
                            il.Emit(OpCodes.Cgt);
                            break;
                        case "<":
                            il.Emit(OpCodes.Clt);
                            break;
                        case "=":
                            il.Emit(OpCodes.Ceq);
                            break;
                        case "<>":
                            il.Emit(OpCodes.Ceq);
                            il.Emit(OpCodes.Ldc_I4_0);
                            il.Emit(OpCodes.Ceq);
                            break;
                        case ">=":
                            il.Emit(OpCodes.Clt);
                            il.Emit(OpCodes.Ldc_I4_0);
                            il.Emit(OpCodes.Ceq);
                            break;
                        case "<=":
                            il.Emit(OpCodes.Cgt);
                            il.Emit(OpCodes.Ldc_I4_0);
                            il.Emit(OpCodes.Ceq);
                            break;
                    }

                    prevArith.Remove();
                    prevTerm.Remove();
                    prevArith = LocalObjectDef.AllocateFromObjectDef(prevTerm);
                }
                else
                {
                    prevArith = prevTerm;
                }
            }

            return prevArith;
        }

        private ObjectDef EmitAnd(L1Parser.And_exprContext and)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            ObjectDef prevComp = null;
            for (var l = 0; l < and.comp().Length; l++)
            {
                var comp = and.comp(l);
                var prevArith = EmitComp(comp);

                if (prevComp != null)
                {
                    prevComp.Load();
                    prevArith.Load();
                    il.Emit(OpCodes.And);
                    prevComp.Remove();
                    prevArith.Remove();
                    prevComp = LocalObjectDef.AllocateFromObjectDef(prevArith);
                }
                else
                {
                    prevComp = prevArith;
                }
            }

            return prevComp;
        }

        private ObjectDef EmitExpr(L1Parser.ExprContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            ObjectDef prevAnd = null;
            for (var k = 0; k < ctx.and_expr().Length; k++)
            {
                var and = ctx.and_expr(k);
                var prevComp = EmitAnd(and);
                if (prevAnd != null)
                {
                    prevAnd.Load();
                    prevComp.Load();
                    switch (ctx.OR(k - 1).GetText())
                    {
                        case "xor":
                            il.Emit(OpCodes.Xor);
                            break;
                        case "or":
                            il.Emit(OpCodes.Or);
                            break;
                    }

                    prevAnd.Remove();
                    prevComp.Remove();
                    prevAnd = LocalObjectDef.AllocateFromObjectDef(prevAnd);
                }
                else
                {
                    prevAnd = prevComp;
                }
            }

            return prevAnd;
        }

        private ObjectDef EmitAtom(L1Parser.Atom_exprContext ctx)
        {
            var il = _currentFun.MethodBuilder.GetILGenerator();
            if (ctx.STRING() != null)
                return new ValueObjectDef(typeof(string), ctx.STRING().GetText().Substring(1,
                    ctx.STRING().GetText().Length - 2));

            if (ctx.CHAR() != null) return new ValueObjectDef(typeof(char), ctx.CHAR().GetText()[1]);

            if (ctx.NUMBER() != null) return new ValueObjectDef(typeof(int), int.Parse(ctx.NUMBER().GetText()));
            if (ctx.BOOLEAN() != null)
            {
                if (ctx.BOOLEAN().GetText() == "F") return new ValueObjectDef(typeof(bool), false);
                return new ValueObjectDef(typeof(bool), true);
            }

            if (ctx.IDENT() != null) return LocalObjectDef.GetLocalObjectDef(_currentFun.Name + ctx.IDENT().GetText());
            if (ctx.array_elem() != null)
            {
                var arr = LocalObjectDef.GetLocalObjectDef(_currentFun.Name + ctx.array_elem().IDENT().GetText());
                var id = EmitExpr(ctx.array_elem().expr(0));
                arr.Load();
                id.Load();
                il.Emit(OpCodes.Ldelem, arr.ElemType);
                return LocalObjectDef.AllocateLocal(arr.ElemType);
            }

            if (ctx.NEW() != null) return EmitNewArray(ctx);
            if (ctx.op_func_call() != null) return EmitFuncCall(ctx.op_func_call());
            return null;
        }

        private ObjectDef EmitNewArray(L1Parser.Atom_exprContext atom)
        {
            var dim = EmitExpr(atom.expr());
            dim.Load();
            if (GetType(atom.type()) == typeof(string[]) || GetType(atom.type()) == typeof(string) )
            {
                if (atom.type().ARRAY().Length > 1)
                {
                    return new ValueObjectDef(typeof(string[]) ,typeof(string));
                }
                return new ValueObjectDef(typeof(string), typeof(char));
            }

            if (GetType(atom.type()) == typeof(int))
            {
                var r = new int[] { };
                return new ValueObjectDef(r.GetType(), typeof(int));
            }

            var b = new bool[] { };
            return new ValueObjectDef(b.GetType(), typeof(bool));
        }

        #endregion

        #region Fields

        private readonly IParseTree _tree;

        private readonly string _fileName;
        private readonly string _programName;
        private readonly AssemblyName _assemblyName;
        private readonly AssemblyBuilder _assemblyBuilder;
        private readonly ModuleBuilder _moduleBuilder;

        private MethodDef _currentFun;

        private readonly TypeBuilder _typeBuilder;
        private readonly Dictionary<string, MethodDef> _functions; // name : def

        private MethodBuilder _entryPoint;

        #endregion
    }
}