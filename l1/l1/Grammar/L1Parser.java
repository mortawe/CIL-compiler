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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, NUMBER=31, 
		STRING=32, BOOLEAN=33, COMPARE=34, ARITH=35, MULT=36, OR=37, IDENT=38, 
		WHITESPACE=39;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_type = 2, RULE_var_list = 3, 
		RULE_function_body = 4, RULE_fact_params = 5, RULE_op_definition = 6, 
		RULE_op_assign = 7, RULE_op_func_call = 8, RULE_op_if = 9, RULE_op_while_pre = 10, 
		RULE_op_while_post = 11, RULE_op_assert = 12, RULE_stmt = 13, RULE_expr = 14, 
		RULE_and_expr = 15, RULE_comp = 16, RULE_arith_expr = 17, RULE_term = 18, 
		RULE_factor = 19, RULE_power = 20, RULE_atom_expr = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "type", "var_list", "function_body", "fact_params", 
			"op_definition", "op_assign", "op_func_call", "op_if", "op_while_pre", 
			"op_while_post", "op_assert", "stmt", "expr", "and_expr", "comp", "arith_expr", 
			"term", "factor", "power", "atom_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'define'", "'('", "')'", "'end'", "'void'", "'int'", "'char'", 
			"'bool'", "'string'", "'int array'", "'char array'", "'bool array'", 
			"','", "'return'", "'\n'", "':='", "'if'", "'then'", "'elseif'", "'else'", 
			"'while'", "'do'", "'assert'", "'and'", "'-'", "'**'", "'['", "']'", 
			"'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NUMBER", "STRING", "BOOLEAN", 
			"COMPARE", "ARITH", "MULT", "OR", "IDENT", "WHITESPACE"
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				function();
				setState(45);
				match(T__0);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
			type();
			setState(53);
			match(IDENT);
			setState(54);
			match(T__2);
			setState(55);
			var_list();
			setState(56);
			match(T__3);
			setState(57);
			function_body();
			setState(58);
			match(T__4);
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
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				type();
				setState(64);
				match(IDENT);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(65);
					match(T__13);
					setState(66);
					type();
					setState(67);
					match(IDENT);
					}
					}
					setState(73);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << IDENT))) != 0)) {
				{
				{
				setState(76);
				stmt();
				setState(77);
				match(T__0);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__14);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__29:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case IDENT:
				{
				setState(85);
				expr();
				}
				break;
			case T__0:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			match(T__0);
			setState(90);
			match(T__15);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__29:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case IDENT:
				{
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						expr();
						setState(93);
						match(T__13);
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(100);
				expr();
				}
				break;
			case T__3:
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
		enterRule(_localctx, 12, RULE_op_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type();
			setState(105);
			match(IDENT);
			setState(106);
			match(T__16);
			setState(107);
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

	public static class Op_assignContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 14, RULE_op_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IDENT);
			setState(110);
			match(T__16);
			setState(111);
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
		enterRule(_localctx, 16, RULE_op_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENT);
			setState(114);
			match(T__2);
			setState(115);
			fact_params();
			setState(116);
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

	public static class Op_ifContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
		enterRule(_localctx, 18, RULE_op_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__17);
			setState(119);
			expr();
			setState(120);
			match(T__18);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << IDENT))) != 0)) {
				{
				{
				setState(121);
				stmt();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(127);
				match(T__19);
				setState(128);
				expr();
				setState(129);
				match(T__18);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << IDENT))) != 0)) {
					{
					{
					setState(130);
					stmt();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(141);
				match(T__20);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << IDENT))) != 0)) {
					{
					{
					setState(142);
					stmt();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(T__4);
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
		enterRule(_localctx, 20, RULE_op_while_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__21);
			setState(153);
			expr();
			setState(154);
			match(T__22);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << IDENT))) != 0)) {
				{
				{
				setState(155);
				stmt();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(T__4);
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
		enterRule(_localctx, 22, RULE_op_while_post);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__22);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					stmt();
					setState(165);
					match(T__0);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(172);
			match(T__21);
			setState(173);
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
		enterRule(_localctx, 24, RULE_op_assert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__23);
			setState(176);
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
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				op_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				op_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				op_func_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				op_if();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				op_while_pre();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				op_while_post();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				op_assert();
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
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			and_expr();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(188);
				match(OR);
				setState(189);
				and_expr();
				}
				}
				setState(194);
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
		enterRule(_localctx, 30, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			comp();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(196);
				match(T__24);
				setState(197);
				comp();
				}
				}
				setState(202);
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
		enterRule(_localctx, 32, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			arith_expr();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARE) {
				{
				{
				setState(204);
				match(COMPARE);
				setState(205);
				arith_expr();
				}
				}
				setState(210);
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
		enterRule(_localctx, 34, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			term();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARITH) {
				{
				{
				setState(212);
				match(ARITH);
				setState(213);
				term();
				}
				}
				setState(218);
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
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			factor();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(220);
				match(MULT);
				setState(221);
				factor();
				}
				}
				setState(226);
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
		enterRule(_localctx, 38, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case IDENT:
				{
				setState(227);
				power();
				}
				break;
			case T__25:
				{
				setState(228);
				match(T__25);
				setState(229);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
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
		enterRule(_localctx, 40, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			atom_expr();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(233);
				match(T__26);
				setState(234);
				factor();
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

	public static class Atom_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(L1Parser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(L1Parser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(L1Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(L1Parser.BOOLEAN, 0); }
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
		enterRule(_localctx, 42, RULE_atom_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(237);
				match(IDENT);
				setState(238);
				match(T__27);
				setState(239);
				expr();
				setState(240);
				match(T__28);
				}
				break;
			case 2:
				{
				setState(242);
				match(IDENT);
				setState(243);
				match(T__27);
				setState(244);
				expr();
				setState(245);
				match(T__28);
				}
				break;
			case 3:
				{
				setState(247);
				match(T__29);
				setState(248);
				type();
				setState(249);
				match(T__27);
				setState(250);
				expr();
				setState(251);
				match(T__28);
				}
				break;
			case 4:
				{
				setState(253);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(254);
				match(NUMBER);
				}
				break;
			case 6:
				{
				setState(255);
				match(STRING);
				}
				break;
			case 7:
				{
				setState(256);
				match(BOOLEAN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\5\5M\n\5\3\6\3\6\3\6\7\6R\n"+
		"\6\f\6\16\6U\13\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7b\n"+
		"\7\f\7\16\7e\13\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13"+
		"\13\3\13\3\13\3\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\7\13\u008b"+
		"\n\13\f\13\16\13\u008e\13\13\3\13\3\13\7\13\u0092\n\13\f\13\16\13\u0095"+
		"\13\13\5\13\u0097\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u009f\n\f\f\f\16"+
		"\f\u00a2\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00bc\n\17\3\20\3\20\3\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20\3\21"+
		"\3\21\3\21\7\21\u00c9\n\21\f\21\16\21\u00cc\13\21\3\22\3\22\3\22\7\22"+
		"\u00d1\n\22\f\22\16\22\u00d4\13\22\3\23\3\23\3\23\7\23\u00d9\n\23\f\23"+
		"\16\23\u00dc\13\23\3\24\3\24\3\24\7\24\u00e1\n\24\f\24\16\24\u00e4\13"+
		"\24\3\25\3\25\3\25\5\25\u00e9\n\25\3\26\3\26\3\26\5\26\u00ee\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0104\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\b\17\2\u0110\2\61\3\2\2\2\4\65\3"+
		"\2\2\2\6>\3\2\2\2\bL\3\2\2\2\nS\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20o\3\2"+
		"\2\2\22s\3\2\2\2\24x\3\2\2\2\26\u009a\3\2\2\2\30\u00a5\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00bb\3\2\2\2\36\u00bd\3\2\2\2 \u00c5\3\2\2\2\"\u00cd\3\2"+
		"\2\2$\u00d5\3\2\2\2&\u00dd\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,\u0103"+
		"\3\2\2\2./\5\4\3\2/\60\7\3\2\2\60\62\3\2\2\2\61.\3\2\2\2\62\63\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\66\7\4\2\2\66\67\5\6\4\2"+
		"\678\7(\2\289\7\5\2\29:\5\b\5\2:;\7\6\2\2;<\5\n\6\2<=\7\7\2\2=\5\3\2\2"+
		"\2>?\t\2\2\2?\7\3\2\2\2@M\3\2\2\2AB\5\6\4\2BI\7(\2\2CD\7\20\2\2DE\5\6"+
		"\4\2EF\7(\2\2FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2L@\3\2\2\2LA\3\2\2\2M\t\3\2\2\2NO\5\34\17\2OP\7\3\2\2PR"+
		"\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2V"+
		"Y\7\21\2\2WZ\5\36\20\2XZ\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7\3"+
		"\2\2\\]\7\22\2\2]\13\3\2\2\2^_\5\36\20\2_`\7\20\2\2`b\3\2\2\2a^\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fi\5\36\20\2gi\3\2"+
		"\2\2hc\3\2\2\2hg\3\2\2\2i\r\3\2\2\2jk\5\6\4\2kl\7(\2\2lm\7\23\2\2mn\5"+
		"\36\20\2n\17\3\2\2\2op\7(\2\2pq\7\23\2\2qr\5\36\20\2r\21\3\2\2\2st\7("+
		"\2\2tu\7\5\2\2uv\5\f\7\2vw\7\6\2\2w\23\3\2\2\2xy\7\24\2\2yz\5\36\20\2"+
		"z~\7\25\2\2{}\5\34\17\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u008c\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\26\2\2\u0082\u0083\5"+
		"\36\20\2\u0083\u0087\7\25\2\2\u0084\u0086\5\34\17\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0081\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0093\7\27\2\2\u0090\u0092\5\34\17\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\7\7\2\2\u0099\25\3\2\2\2\u009a\u009b\7\30\2"+
		"\2\u009b\u009c\5\36\20\2\u009c\u00a0\7\31\2\2\u009d\u009f\5\34\17\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\7\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00ab\7\31\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\3"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\5\36\20\2\u00b0\31\3\2\2\2\u00b1"+
		"\u00b2\7\32\2\2\u00b2\u00b3\5\36\20\2\u00b3\33\3\2\2\2\u00b4\u00bc\5\16"+
		"\b\2\u00b5\u00bc\5\20\t\2\u00b6\u00bc\5\22\n\2\u00b7\u00bc\5\24\13\2\u00b8"+
		"\u00bc\5\26\f\2\u00b9\u00bc\5\30\r\2\u00ba\u00bc\5\32\16\2\u00bb\u00b4"+
		"\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\35\3\2\2"+
		"\2\u00bd\u00c2\5 \21\2\u00be\u00bf\7\'\2\2\u00bf\u00c1\5 \21\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\37\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\5\"\22\2\u00c6\u00c7\7\33"+
		"\2\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb!\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cd\u00d2\5$\23\2\u00ce\u00cf\7$\2\2\u00cf\u00d1\5$\23\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"#\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5&\24\2\u00d6\u00d7\7%\2\2\u00d7"+
		"\u00d9\5&\24\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db%\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e2"+
		"\5(\25\2\u00de\u00df\7&\2\2\u00df\u00e1\5(\25\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\'\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e9\5*\26\2\u00e6\u00e7\7\34\2\2\u00e7\u00e9"+
		"\5(\25\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9)\3\2\2\2\u00ea"+
		"\u00ed\5,\27\2\u00eb\u00ec\7\35\2\2\u00ec\u00ee\5(\25\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee+\3\2\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f1"+
		"\7\36\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\37\2\2\u00f3\u0104\3\2\2"+
		"\2\u00f4\u00f5\7(\2\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\5\36\20\2\u00f7"+
		"\u00f8\7\37\2\2\u00f8\u0104\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\5\6"+
		"\4\2\u00fb\u00fc\7\36\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\37\2\2\u00fe"+
		"\u0104\3\2\2\2\u00ff\u0104\7(\2\2\u0100\u0104\7!\2\2\u0101\u0104\7\"\2"+
		"\2\u0102\u0104\7#\2\2\u0103\u00ef\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f9"+
		"\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104-\3\2\2\2\31\63ILSYch~\u0087\u008c\u0093\u0096\u00a0"+
		"\u00ab\u00bb\u00c2\u00ca\u00d2\u00da\u00e2\u00e8\u00ed\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}