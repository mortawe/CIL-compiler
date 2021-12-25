//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from L1.g4 by ANTLR 4.9

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="L1Parser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9")]
[System.CLSCompliant(false)]
public interface IL1Listener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgram([NotNull] L1Parser.ProgramContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgram([NotNull] L1Parser.ProgramContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.function"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunction([NotNull] L1Parser.FunctionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.function"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunction([NotNull] L1Parser.FunctionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterType([NotNull] L1Parser.TypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitType([NotNull] L1Parser.TypeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.var_list"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVar_list([NotNull] L1Parser.Var_listContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.var_list"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVar_list([NotNull] L1Parser.Var_listContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.function_body"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunction_body([NotNull] L1Parser.Function_bodyContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.function_body"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunction_body([NotNull] L1Parser.Function_bodyContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.fact_params"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFact_params([NotNull] L1Parser.Fact_paramsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.fact_params"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFact_params([NotNull] L1Parser.Fact_paramsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_return"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_return([NotNull] L1Parser.Op_returnContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_return"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_return([NotNull] L1Parser.Op_returnContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_definition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_definition([NotNull] L1Parser.Op_definitionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_definition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_definition([NotNull] L1Parser.Op_definitionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_assign([NotNull] L1Parser.Op_assignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_assign([NotNull] L1Parser.Op_assignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_func_call"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_func_call([NotNull] L1Parser.Op_func_callContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_func_call"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_func_call([NotNull] L1Parser.Op_func_callContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_if"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_if([NotNull] L1Parser.Op_ifContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_if"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_if([NotNull] L1Parser.Op_ifContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_for"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_for([NotNull] L1Parser.Op_forContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_for"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_for([NotNull] L1Parser.Op_forContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_while_pre"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_while_pre([NotNull] L1Parser.Op_while_preContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_while_pre"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_while_pre([NotNull] L1Parser.Op_while_preContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_while_post"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_while_post([NotNull] L1Parser.Op_while_postContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_while_post"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_while_post([NotNull] L1Parser.Op_while_postContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_assert"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOp_assert([NotNull] L1Parser.Op_assertContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_assert"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOp_assert([NotNull] L1Parser.Op_assertContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmt([NotNull] L1Parser.StmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmt([NotNull] L1Parser.StmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpr([NotNull] L1Parser.ExprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpr([NotNull] L1Parser.ExprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.and_expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAnd_expr([NotNull] L1Parser.And_exprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.and_expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAnd_expr([NotNull] L1Parser.And_exprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.comp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterComp([NotNull] L1Parser.CompContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.comp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitComp([NotNull] L1Parser.CompContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.arith_expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArith_expr([NotNull] L1Parser.Arith_exprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.arith_expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArith_expr([NotNull] L1Parser.Arith_exprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTerm([NotNull] L1Parser.TermContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTerm([NotNull] L1Parser.TermContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFactor([NotNull] L1Parser.FactorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFactor([NotNull] L1Parser.FactorContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.power"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPower([NotNull] L1Parser.PowerContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.power"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPower([NotNull] L1Parser.PowerContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.atom_expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAtom_expr([NotNull] L1Parser.Atom_exprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.atom_expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAtom_expr([NotNull] L1Parser.Atom_exprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.array_elem"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArray_elem([NotNull] L1Parser.Array_elemContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.array_elem"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArray_elem([NotNull] L1Parser.Array_elemContext context);
}
