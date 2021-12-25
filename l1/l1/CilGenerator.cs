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
            FileName_ = filename;
            Tree_ = tree;
            ProgramName_ = Path.GetFileNameWithoutExtension(FileName_);
            AssemblyName_ = new AssemblyName {Name = ProgramName_};
            AssemblyBuilder_ = AppDomain.CurrentDomain.DefineDynamicAssembly(AssemblyName_, AssemblyBuilderAccess.Save);
            ModuleBuilder_ = AssemblyBuilder_.DefineDynamicModule(ProgramName_, ProgramName_ + ".exe", false);
            TypeBuilder_ = ModuleBuilder_.DefineType("L1");
            Functions_ = new Dictionary<string, MethodDef>();
        }

        public void Generate()
        {
            DefineFunctions();
            ParseTreeWalker.Default.Walk(this, Tree_);
            Console.Write(EntryPoint_);
            TypeBuilder_.CreateType(); // finish type
            AssemblyBuilder_.SetEntryPoint(EntryPoint_);
            AssemblyBuilder_.Save(ProgramName_ + ".exe");
        }

        private void DefineFunctions()
        {
            var programCtx = (L1Parser.ProgramContext) Tree_;
            foreach (var function in programCtx.function())
            {
                var args = new Dictionary<string, ArgObjectDef>();
                Type[] inputTypes;
                args.Add("this", new ArgObjectDef(TypeBuilder_, 0, "this"));
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
                    methodBuilder = TypeBuilder_.DefineMethod(function.IDENT().GetText(),
                        MethodAttributes.Static | MethodAttributes.Public,
                        typeof(void), new[] {typeof(string[])});
                    EntryPoint_ = methodBuilder;
                }
                else
                {
                    methodBuilder = TypeBuilder_.DefineMethod(function.IDENT().GetText(),
                        MethodAttributes.Public,
                        GetType(function.type()), inputTypes);
                }

                Functions_.Add(function.IDENT().GetText(),
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
                    var arrC = new string[] { };
                    return arrC.GetType();
            }
            return null;
        }

        #region Listeners

        public  void EmitOp_assert(L1Parser.Op_assertContext ctx)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            var cond = EmitExpr(ctx.expr());
            var exitL = il.DefineLabel();
            var throwL = il.DefineLabel();
            cond.Load();
            il.Emit(OpCodes.Brtrue, exitL);
            // il.Emit(OpCodes.Brfalse, throwL);
            // il.MarkLabel(throwL);
            il.ThrowException(typeof(OverflowException));
            // il.Emit(OpCodes.Throw);
            // il.Emit(OpCodes.Throw);
            il.MarkLabel(exitL);
        }

        public override void EnterFunction(L1Parser.FunctionContext context)
        {
            var functionName = context.IDENT().GetText();
            CurrentFun_ = Functions_[functionName];
            LocalObjectDef.InitGenerator(CurrentFun_.MethodBuilder.GetILGenerator());
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            il.Emit(OpCodes.Ldarg, 0);
            for (var i = 1; i < context.var_list().type().Length + 1; i++)
            {
                il.Emit(OpCodes.Ldarg, i);
                var type = context.var_list().type(i - 1);
                var id = context.var_list().IDENT(i - 1);
                LocalObjectDef.AllocateLocal(GetType(type), CurrentFun_.Name + id.GetText());
            }

            EmitFunction_body(context.function_body());
        }

        public override void ExitFunction(L1Parser.FunctionContext context)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            if (context.type() == null || GetType(context.type()) == typeof(void))
            {
                // il.Emit(OpCodes.Br, CurrentFun_.RetLabel);
            }
            il.MarkLabel(CurrentFun_.RetLabel);
            if (context.type() != null)
            {
                il.Emit(OpCodes.Pop);

                LocalObjectDef.GetLocalObjectDef(CurrentFun_.Name + "ret").Load();
            // LocalObjectDef.AllocateLocal(CurrentFun_.MethodBuilder.ReturnType).Load();

            }
            else 
                il.Emit(OpCodes.Pop);
            il.Emit(OpCodes.Ret);
            CurrentFun_ = null;
            // base.ExitFunction(context);
        }


        private void EmitOp_definition(L1Parser.Op_definitionContext ctx)
        {
            var expr = ctx.expr();
            var id = ctx.IDENT().GetText();
            if (expr != null)
            {
                var returnObjDef = EmitExpr(expr);
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, CurrentFun_.Name + id);
            }
            else
            {
                ObjectDef returnObjDef = new ValueObjectDef(GetType(ctx.type()));
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, CurrentFun_.Name + id);
            }
        }

        public  void EmitOp_assign(L1Parser.Op_assignContext ctx)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            var returnObjDef = EmitExpr(ctx.expr());
            if (ctx.IDENT() != null)
            {
                var id = ctx.IDENT().GetText();
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, CurrentFun_.Name + id);
                return;
            }

            var arr = LocalObjectDef.GetLocalObjectDef(CurrentFun_.Name +
                                                       ctx.array_elem().IDENT().GetText());
            var arId = EmitExpr(ctx.array_elem().expr(0));
            arr.Load();
            arId.Load();
            returnObjDef.Load();
            il.Emit(OpCodes.Stelem_I4);
        }

        public  void EmitOp_return(L1Parser.Op_returnContext ctx)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();

            var expr = ctx.expr();
            if (expr != null)
            {
                var returnObjDef = EmitExpr(expr);
                returnObjDef.Load();
                LocalObjectDef.AllocateFromObjectDef(returnObjDef, CurrentFun_.Name + "ret");
            }
            il.Emit(OpCodes.Br, CurrentFun_.RetLabel);
            // il.Emit(OpCodes.Ret);
        }

        public  void EmitOp_while_pre(L1Parser.Op_while_preContext ctx)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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
            Console.Write("Hello");
            foreach (var stmt in context.stmt()) EmitStmt(stmt);
        }

        public  void EmitStmt(L1Parser.StmtContext context)
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
        }

        public  void EmitOp_if(L1Parser.Op_ifContext ctx)
        {
            var exitLs = new List<Label>();

            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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

            var callF = Functions_[ctx.IDENT().GetText()];
            var il = CurrentFun_.MethodBuilder.GetILGenerator();

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
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            var prevFactor = EmitAtom(p.atom_expr());
            for (var i = 0; i < p.factor().Length; i++)
            {
                var factor = EmitFactor(p.factor(i));
                prevFactor.Load();
                factor.Load();
                var method = typeof(Math).GetMethod("Pow", BindingFlags.Public | BindingFlags.Static, null,
                    new[] {typeof(float), typeof(float)}, null);
                il.Emit(OpCodes.Call, method);
                prevFactor = LocalObjectDef.AllocateLocal(typeof(int));
            }

            return prevFactor;
        }

        private ObjectDef EmitFactor(L1Parser.FactorContext f)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            if (f.factor() != null)
            {
                var returnObjDef = EmitFactor(f.factor());
                returnObjDef.Load();
                il.Emit(OpCodes.Neg);
                return LocalObjectDef.AllocateFromObjectDef(returnObjDef);
            }

            return EmitPower(f.power());
        }

        private ObjectDef EmitTerm(L1Parser.TermContext t)
        {
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
            ObjectDef prevFactor = null;
            for (var i = 0; i < t.factor().Length; i++)
            {
                var factor = EmitFactor(t.factor(i));
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
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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
                            il.Emit(OpCodes.Neg);
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
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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
            var il = CurrentFun_.MethodBuilder.GetILGenerator();
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

            if (ctx.IDENT() != null) return LocalObjectDef.GetLocalObjectDef(CurrentFun_.Name + ctx.IDENT().GetText());
            if (ctx.array_elem() != null)
            {
                var arr = LocalObjectDef.GetLocalObjectDef(CurrentFun_.Name + ctx.array_elem().IDENT().GetText());
                var id = EmitExpr(ctx.array_elem().expr(0));
                arr.Load();
                id.Load();
                il.Emit(OpCodes.Ldelem_I4);
                return LocalObjectDef.AllocateLocal(arr.ElemType);
            }

            if (ctx.NEW() != null) return EmitNewArray(ctx);
            if (ctx.op_func_call() != null) return EmitFuncCall(ctx.op_func_call());
            return null;
        }

        private ObjectDef EmitNewArray(L1Parser.Atom_exprContext atom)
        {
            Console.WriteLine(GetType(atom.type()));
            var dim = EmitExpr(atom.expr());
            dim.Load();
            if (GetType(atom.type()) == typeof(char) || GetType(atom.type()) == typeof(string))
            {
                if (atom.type().ARRAY().Length == 1)
                {
                    var r = new string[] { };
                    return new ValueObjectDef(r.GetType(), typeof(string));
                }

                return new ValueObjectDef(typeof(string));
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

        private readonly IParseTree Tree_;

        private readonly string FileName_;
        private readonly string ProgramName_;
        private readonly AssemblyName AssemblyName_;
        private readonly AssemblyBuilder AssemblyBuilder_;
        private readonly ModuleBuilder ModuleBuilder_;

        private MethodDef CurrentFun_;

        private readonly TypeBuilder TypeBuilder_;
        private readonly Dictionary<string, MethodDef> Functions_; // name : def

        private Dictionary<string, ArgObjectDef> CurrentArgs_;

        private MethodBuilder EntryPoint_;

        #endregion
    }
}