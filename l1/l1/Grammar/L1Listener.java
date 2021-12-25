// Generated from L1.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link L1Parser}.
 */
public interface L1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link L1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(L1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(L1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(L1Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(L1Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(L1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(L1Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(L1Parser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(L1Parser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(L1Parser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(L1Parser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#fact_params}.
	 * @param ctx the parse tree
	 */
	void enterFact_params(L1Parser.Fact_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#fact_params}.
	 * @param ctx the parse tree
	 */
	void exitFact_params(L1Parser.Fact_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_return}.
	 * @param ctx the parse tree
	 */
	void enterOp_return(L1Parser.Op_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_return}.
	 * @param ctx the parse tree
	 */
	void exitOp_return(L1Parser.Op_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_definition}.
	 * @param ctx the parse tree
	 */
	void enterOp_definition(L1Parser.Op_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_definition}.
	 * @param ctx the parse tree
	 */
	void exitOp_definition(L1Parser.Op_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_assign}.
	 * @param ctx the parse tree
	 */
	void enterOp_assign(L1Parser.Op_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_assign}.
	 * @param ctx the parse tree
	 */
	void exitOp_assign(L1Parser.Op_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_func_call}.
	 * @param ctx the parse tree
	 */
	void enterOp_func_call(L1Parser.Op_func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_func_call}.
	 * @param ctx the parse tree
	 */
	void exitOp_func_call(L1Parser.Op_func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_if}.
	 * @param ctx the parse tree
	 */
	void enterOp_if(L1Parser.Op_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_if}.
	 * @param ctx the parse tree
	 */
	void exitOp_if(L1Parser.Op_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_while_pre}.
	 * @param ctx the parse tree
	 */
	void enterOp_while_pre(L1Parser.Op_while_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_while_pre}.
	 * @param ctx the parse tree
	 */
	void exitOp_while_pre(L1Parser.Op_while_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_while_post}.
	 * @param ctx the parse tree
	 */
	void enterOp_while_post(L1Parser.Op_while_postContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_while_post}.
	 * @param ctx the parse tree
	 */
	void exitOp_while_post(L1Parser.Op_while_postContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#op_assert}.
	 * @param ctx the parse tree
	 */
	void enterOp_assert(L1Parser.Op_assertContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#op_assert}.
	 * @param ctx the parse tree
	 */
	void exitOp_assert(L1Parser.Op_assertContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(L1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(L1Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(L1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(L1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(L1Parser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(L1Parser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(L1Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(L1Parser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(L1Parser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(L1Parser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(L1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(L1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(L1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(L1Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(L1Parser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(L1Parser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(L1Parser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(L1Parser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link L1Parser#array_elem}.
	 * @param ctx the parse tree
	 */
	void enterArray_elem(L1Parser.Array_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link L1Parser#array_elem}.
	 * @param ctx the parse tree
	 */
	void exitArray_elem(L1Parser.Array_elemContext ctx);
}