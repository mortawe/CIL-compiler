// Generated from L1.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, BASE_TYPE=21, NUMBER=22, CHAR=23, STRING=24, 
		BOOLEAN=25, COMPARE=26, ARITH=27, MULT=28, OR=29, NEW=30, ARRAY=31, IDENT=32, 
		WHITESPACE=33;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_type = 2, RULE_var_list = 3, 
		RULE_function_body = 4, RULE_fact_params = 5, RULE_op_return = 6, RULE_op_definition = 7, 
		RULE_op_assign = 8, RULE_op_func_call = 9, RULE_op_if = 10, RULE_op_while_pre = 11, 
		RULE_op_while_post = 12, RULE_op_assert = 13, RULE_stmt = 14, RULE_expr = 15, 
		RULE_and_expr = 16, RULE_comp = 17, RULE_arith_expr = 18, RULE_term = 19, 
		RULE_factor = 20, RULE_power = 21, RULE_atom_expr = 22, RULE_array_elem = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "type", "var_list", "function_body", "fact_params", 
			"op_return", "op_definition", "op_assign", "op_func_call", "op_if", "op_while_pre", 
			"op_while_post", "op_assert", "stmt", "expr", "and_expr", "comp", "arith_expr", 
			"term", "factor", "power", "atom_expr", "array_elem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'define'", "'('", "')'", "'end'", "','", "';'", "'return'", "':='", 
			"'if'", "'then'", "'elseif'", "'else'", "'while'", "'do'", "'assert'", 
			"'and'", "'-'", "'**'", "'['", "']'", null, null, null, null, null, null, 
			null, null, null, "'new'", "'array'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BASE_TYPE", "NUMBER", 
			"CHAR", "STRING", "BOOLEAN", "COMPARE", "ARITH", "MULT", "OR", "NEW", 
			"ARRAY", "IDENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "L1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public L1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				function();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASE_TYPE) {
				{
				setState(54);
				type();
				}
			}

			setState(57);
			match(IDENT);
			setState(58);
			match(T__1);
			setState(59);
			var_list();
			setState(60);
			match(T__2);
			setState(61);
			function_body();
			setState(62);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BASE_TYPE() { return getToken(L1Parser.BASE_TYPE, 0); }
		public List<TerminalNode> ARRAY() { return getTokens(L1Parser.ARRAY); }
		public TerminalNode ARRAY(int i) {
			return getToken(L1Parser.ARRAY, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(BASE_TYPE);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARRAY) {
				{
				{
				setState(65);
				match(ARRAY);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(L1Parser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(L1Parser.IDENT, i);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterVar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitVar_list(this);
		}
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_list);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BASE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				type();
				setState(73);
				match(IDENT);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(74);
					match(T__4);
					setState(75);
					type();
					setState(76);
					match(IDENT);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << BASE_TYPE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(85);
				stmt();
				setState(86);
				match(T__5);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fact_paramsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Fact_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterFact_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitFact_params(this);
		}
	}

	public final Fact_paramsContext fact_params() throws RecognitionException {
		Fact_paramsContext _localctx = new Fact_paramsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fact_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case NUMBER:
			case CHAR:
			case STRING:
			case BOOLEAN:
			case NEW:
			case IDENT:
				{
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(93);
						expr();
						setState(94);
						match(T__4);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(101);
				expr();
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_returnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_return(this);
		}
	}

	public final Op_returnContext op_return() throws RecognitionException {
		Op_returnContext _localctx = new Op_returnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_op_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(106);
				expr();
				}
				break;
			case 2:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_definition(this);
		}
	}

	public final Op_definitionContext op_definition() throws RecognitionException {
		Op_definitionContext _localctx = new Op_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			type();
			setState(111);
			match(IDENT);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(112);
				match(T__7);
				setState(113);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_assignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public Op_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_assign(this);
		}
	}

	public final Op_assignContext op_assign() throws RecognitionException {
		Op_assignContext _localctx = new Op_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(116);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(117);
				array_elem();
				}
				break;
			}
			setState(120);
			match(T__7);
			setState(121);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_func_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public Fact_paramsContext fact_params() {
			return getRuleContext(Fact_paramsContext.class,0);
		}
		public Op_func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_func_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_func_call(this);
		}
	}

	public final Op_func_callContext op_func_call() throws RecognitionException {
		Op_func_callContext _localctx = new Op_func_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENT);
			setState(124);
			match(T__1);
			setState(125);
			fact_params();
			setState(126);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_ifContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Function_bodyContext> function_body() {
			return getRuleContexts(Function_bodyContext.class);
		}
		public Function_bodyContext function_body(int i) {
			return getRuleContext(Function_bodyContext.class,i);
		}
		public Op_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_if(this);
		}
	}

	public final Op_ifContext op_if() throws RecognitionException {
		Op_ifContext _localctx = new Op_ifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__8);
			setState(129);
			expr();
			setState(130);
			match(T__9);
			setState(131);
			function_body();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(132);
				match(T__10);
				setState(133);
				expr();
				setState(134);
				match(T__9);
				setState(135);
				function_body();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(142);
				match(T__11);
				setState(143);
				function_body();
				}
			}

			setState(146);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_while_preContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Op_while_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_while_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_while_pre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_while_pre(this);
		}
	}

	public final Op_while_preContext op_while_pre() throws RecognitionException {
		Op_while_preContext _localctx = new Op_while_preContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_while_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__12);
			setState(149);
			expr();
			setState(150);
			match(T__13);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << BASE_TYPE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(151);
				stmt();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_while_postContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Op_while_postContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_while_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_while_post(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_while_post(this);
		}
	}

	public final Op_while_postContext op_while_post() throws RecognitionException {
		Op_while_postContext _localctx = new Op_while_postContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_while_post);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__13);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					stmt();
					setState(161);
					match(T__5);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(168);
			match(T__12);
			setState(169);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_assertContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op_assertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_assert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterOp_assert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitOp_assert(this);
		}
	}

	public final Op_assertContext op_assert() throws RecognitionException {
		Op_assertContext _localctx = new Op_assertContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_assert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Op_definitionContext op_definition() {
			return getRuleContext(Op_definitionContext.class,0);
		}
		public Op_assignContext op_assign() {
			return getRuleContext(Op_assignContext.class,0);
		}
		public Op_func_callContext op_func_call() {
			return getRuleContext(Op_func_callContext.class,0);
		}
		public Op_ifContext op_if() {
			return getRuleContext(Op_ifContext.class,0);
		}
		public Op_while_preContext op_while_pre() {
			return getRuleContext(Op_while_preContext.class,0);
		}
		public Op_while_postContext op_while_post() {
			return getRuleContext(Op_while_postContext.class,0);
		}
		public Op_assertContext op_assert() {
			return getRuleContext(Op_assertContext.class,0);
		}
		public Op_returnContext op_return() {
			return getRuleContext(Op_returnContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				op_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				op_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				op_func_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				op_if();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				op_while_pre();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				op_while_post();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				op_assert();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				op_return();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(L1Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(L1Parser.OR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			and_expr();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(185);
				match(OR);
				setState(186);
				and_expr();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitAnd_expr(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			comp();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(193);
				match(T__15);
				setState(194);
				comp();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public List<TerminalNode> COMPARE() { return getTokens(L1Parser.COMPARE); }
		public TerminalNode COMPARE(int i) {
			return getToken(L1Parser.COMPARE, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			arith_expr();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARE) {
				{
				{
				setState(201);
				match(COMPARE);
				setState(202);
				arith_expr();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ARITH() { return getTokens(L1Parser.ARITH); }
		public TerminalNode ARITH(int i) {
			return getToken(L1Parser.ARITH, i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitArith_expr(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			term();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARITH) {
				{
				{
				setState(209);
				match(ARITH);
				setState(210);
				term();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(L1Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(L1Parser.MULT, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			factor();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(217);
				match(MULT);
				setState(218);
				factor();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case CHAR:
			case STRING:
			case BOOLEAN:
			case NEW:
			case IDENT:
				{
				setState(224);
				power();
				}
				break;
			case T__16:
				{
				setState(225);
				match(T__16);
				setState(226);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_power);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			atom_expr();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(T__17);
					setState(231);
					factor();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public TerminalNode NEW() { return getToken(L1Parser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(L1Parser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(L1Parser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(L1Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(L1Parser.STRING, 0); }
		public Op_func_callContext op_func_call() {
			return getRuleContext(Op_func_callContext.class,0);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitAtom_expr(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(237);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(238);
				array_elem();
				}
				break;
			case 3:
				{
				setState(239);
				match(NEW);
				setState(240);
				type();
				setState(241);
				match(T__18);
				setState(242);
				expr();
				setState(243);
				match(T__19);
				}
				break;
			case 4:
				{
				setState(245);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(246);
				match(NUMBER);
				}
				break;
			case 6:
				{
				setState(247);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				setState(248);
				match(CHAR);
				}
				break;
			case 8:
				{
				setState(249);
				match(STRING);
				}
				break;
			case 9:
				{
				setState(250);
				op_func_call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elemContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).enterArray_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof L1Listener ) ((L1Listener)listener).exitArray_elem(this);
		}
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			match(IDENT);
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				match(T__18);
				setState(255);
				expr();
				setState(256);
				match(T__19);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0109\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n"+
		"\5\f\5\16\5T\13\5\5\5V\n\5\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7"+
		"\3\7\7\7c\n\7\f\7\16\7f\13\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\5\bo\n\b\3\t"+
		"\3\t\3\t\3\t\5\tu\n\t\3\n\3\n\5\ny\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f"+
		"\13\f\3\f\3\f\5\f\u0093\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009b\n\r\f\r"+
		"\16\r\u009e\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a6\n\16\f\16\16\16"+
		"\u00a9\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\21\7\21\u00be\n\21\f\21\16\21"+
		"\u00c1\13\21\3\22\3\22\3\22\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22\3\23"+
		"\3\23\3\23\7\23\u00ce\n\23\f\23\16\23\u00d1\13\23\3\24\3\24\3\24\7\24"+
		"\u00d6\n\24\f\24\16\24\u00d9\13\24\3\25\3\25\3\25\7\25\u00de\n\25\f\25"+
		"\16\25\u00e1\13\25\3\26\3\26\3\26\5\26\u00e6\n\26\3\27\3\27\3\27\7\27"+
		"\u00eb\n\27\f\27\16\27\u00ee\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fe\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\6\31\u0105\n\31\r\31\16\31\u0106\3\31\2\2\32\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\2\2\2\u0116\2\63\3\2\2\2\4\67\3\2\2\2\6"+
		"B\3\2\2\2\bU\3\2\2\2\n\\\3\2\2\2\fi\3\2\2\2\16k\3\2\2\2\20p\3\2\2\2\22"+
		"x\3\2\2\2\24}\3\2\2\2\26\u0082\3\2\2\2\30\u0096\3\2\2\2\32\u00a1\3\2\2"+
		"\2\34\u00ad\3\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00c2\3\2\2\2$\u00ca"+
		"\3\2\2\2&\u00d2\3\2\2\2(\u00da\3\2\2\2*\u00e5\3\2\2\2,\u00e7\3\2\2\2."+
		"\u00fd\3\2\2\2\60\u00ff\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\679\7\3\2\28:\5\6\4\298"+
		"\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\"\2\2<=\7\4\2\2=>\5\b\5\2>?\7\5\2\2?"+
		"@\5\n\6\2@A\7\6\2\2A\5\3\2\2\2BF\7\27\2\2CE\7!\2\2DC\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IV\3\2\2\2JK\5\6\4\2KR\7\"\2"+
		"\2LM\7\7\2\2MN\5\6\4\2NO\7\"\2\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UI\3\2\2\2UJ\3\2\2\2V\t\3\2\2\2WX\5\36"+
		"\20\2XY\7\b\2\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13"+
		"\3\2\2\2^\\\3\2\2\2_`\5 \21\2`a\7\7\2\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gj\5 \21\2hj\3\2\2\2id\3\2\2\2"+
		"ih\3\2\2\2j\r\3\2\2\2kn\7\t\2\2lo\5 \21\2mo\3\2\2\2nl\3\2\2\2nm\3\2\2"+
		"\2o\17\3\2\2\2pq\5\6\4\2qt\7\"\2\2rs\7\n\2\2su\5 \21\2tr\3\2\2\2tu\3\2"+
		"\2\2u\21\3\2\2\2vy\7\"\2\2wy\5\60\31\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2z"+
		"{\7\n\2\2{|\5 \21\2|\23\3\2\2\2}~\7\"\2\2~\177\7\4\2\2\177\u0080\5\f\7"+
		"\2\u0080\u0081\7\5\2\2\u0081\25\3\2\2\2\u0082\u0083\7\13\2\2\u0083\u0084"+
		"\5 \21\2\u0084\u0085\7\f\2\2\u0085\u008d\5\n\6\2\u0086\u0087\7\r\2\2\u0087"+
		"\u0088\5 \21\2\u0088\u0089\7\f\2\2\u0089\u008a\5\n\6\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\16"+
		"\2\2\u0091\u0093\5\n\6\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\6\2\2\u0095\27\3\2\2\2\u0096\u0097\7\17\2"+
		"\2\u0097\u0098\5 \21\2\u0098\u009c\7\20\2\2\u0099\u009b\5\36\20\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\6\2\2\u00a0"+
		"\31\3\2\2\2\u00a1\u00a7\7\20\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\7\b"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac\5 \21\2\u00ac\33\3\2\2\2\u00ad\u00ae"+
		"\7\21\2\2\u00ae\u00af\5 \21\2\u00af\35\3\2\2\2\u00b0\u00b9\5\20\t\2\u00b1"+
		"\u00b9\5\22\n\2\u00b2\u00b9\5\24\13\2\u00b3\u00b9\5\26\f\2\u00b4\u00b9"+
		"\5\30\r\2\u00b5\u00b9\5\32\16\2\u00b6\u00b9\5\34\17\2\u00b7\u00b9\5\16"+
		"\b\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8"+
		"\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bf\5\"\22\2\u00bb\u00bc"+
		"\7\37\2\2\u00bc\u00be\5\"\22\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00bf\3"+
		"\2\2\2\u00c2\u00c7\5$\23\2\u00c3\u00c4\7\22\2\2\u00c4\u00c6\5$\23\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8#\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cf\5&\24\2\u00cb\u00cc"+
		"\7\34\2\2\u00cc\u00ce\5&\24\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d2\u00d7\5(\25\2\u00d3\u00d4\7\35\2\2\u00d4\u00d6\5(\25\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\'\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00df\5*\26\2\u00db\u00dc"+
		"\7\36\2\2\u00dc\u00de\5*\26\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0)\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e2\u00e6\5,\27\2\u00e3\u00e4\7\23\2\2\u00e4\u00e6\5*\26\2\u00e5"+
		"\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6+\3\2\2\2\u00e7\u00ec\5.\30\2"+
		"\u00e8\u00e9\7\24\2\2\u00e9\u00eb\5*\26\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed-\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00fe\7\"\2\2\u00f0\u00fe\5\60\31\2\u00f1\u00f2\7"+
		" \2\2\u00f2\u00f3\5\6\4\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\5 \21\2\u00f5"+
		"\u00f6\7\26\2\2\u00f6\u00fe\3\2\2\2\u00f7\u00fe\7\"\2\2\u00f8\u00fe\7"+
		"\30\2\2\u00f9\u00fe\7\33\2\2\u00fa\u00fe\7\31\2\2\u00fb\u00fe\7\32\2\2"+
		"\u00fc\u00fe\5\24\13\2\u00fd\u00ef\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd\u00f1"+
		"\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe/\3\2\2\2"+
		"\u00ff\u0104\7\"\2\2\u0100\u0101\7\25\2\2\u0101\u0102\5 \21\2\u0102\u0103"+
		"\7\26\2\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\61\3\2\2\2\33\659FRU\\"+
		"dintx\u008d\u0092\u009c\u00a7\u00b8\u00bf\u00c7\u00cf\u00d7\u00df\u00e5"+
		"\u00ec\u00fd\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}