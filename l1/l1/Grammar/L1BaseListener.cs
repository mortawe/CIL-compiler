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
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IL1Listener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class L1BaseListener : IL1Listener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProgram([NotNull] L1Parser.ProgramContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProgram([NotNull] L1Parser.ProgramContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.function"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunction([NotNull] L1Parser.FunctionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.function"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunction([NotNull] L1Parser.FunctionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.type"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterType([NotNull] L1Parser.TypeContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.type"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitType([NotNull] L1Parser.TypeContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.var_list"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVar_list([NotNull] L1Parser.Var_listContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.var_list"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVar_list([NotNull] L1Parser.Var_listContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.function_body"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunction_body([NotNull] L1Parser.Function_bodyContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.function_body"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunction_body([NotNull] L1Parser.Function_bodyContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.fact_params"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFact_params([NotNull] L1Parser.Fact_paramsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.fact_params"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFact_params([NotNull] L1Parser.Fact_paramsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_return"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_return([NotNull] L1Parser.Op_returnContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_return"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_return([NotNull] L1Parser.Op_returnContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_definition"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_definition([NotNull] L1Parser.Op_definitionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_definition"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_definition([NotNull] L1Parser.Op_definitionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_assign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_assign([NotNull] L1Parser.Op_assignContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_assign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_assign([NotNull] L1Parser.Op_assignContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_func_call"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_func_call([NotNull] L1Parser.Op_func_callContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_func_call"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_func_call([NotNull] L1Parser.Op_func_callContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_if"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_if([NotNull] L1Parser.Op_ifContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_if"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_if([NotNull] L1Parser.Op_ifContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_while_pre"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_while_pre([NotNull] L1Parser.Op_while_preContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_while_pre"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_while_pre([NotNull] L1Parser.Op_while_preContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_while_post"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_while_post([NotNull] L1Parser.Op_while_postContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_while_post"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_while_post([NotNull] L1Parser.Op_while_postContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.op_assert"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOp_assert([NotNull] L1Parser.Op_assertContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.op_assert"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOp_assert([NotNull] L1Parser.Op_assertContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.stmt"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStmt([NotNull] L1Parser.StmtContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.stmt"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStmt([NotNull] L1Parser.StmtContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpr([NotNull] L1Parser.ExprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpr([NotNull] L1Parser.ExprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.and_expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAnd_expr([NotNull] L1Parser.And_exprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.and_expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAnd_expr([NotNull] L1Parser.And_exprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.comp"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterComp([NotNull] L1Parser.CompContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.comp"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitComp([NotNull] L1Parser.CompContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.arith_expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArith_expr([NotNull] L1Parser.Arith_exprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.arith_expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArith_expr([NotNull] L1Parser.Arith_exprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.term"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterTerm([NotNull] L1Parser.TermContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.term"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitTerm([NotNull] L1Parser.TermContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.factor"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFactor([NotNull] L1Parser.FactorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.factor"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFactor([NotNull] L1Parser.FactorContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.power"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPower([NotNull] L1Parser.PowerContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.power"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPower([NotNull] L1Parser.PowerContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.atom_expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAtom_expr([NotNull] L1Parser.Atom_exprContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.atom_expr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAtom_expr([NotNull] L1Parser.Atom_exprContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="L1Parser.array_elem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArray_elem([NotNull] L1Parser.Array_elemContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="L1Parser.array_elem"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArray_elem([NotNull] L1Parser.Array_elemContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
