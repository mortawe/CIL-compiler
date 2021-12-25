// Generated from L1.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L1Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "BASE_TYPE", "NUMBER", "CHAR", "STRING", "BOOLEAN", 
			"COMPARE", "ARITH", "MULT", "OR", "TEXT", "DIGITS", "LOWERCASE", "UPPERCASE", 
			"TAB", "COMMENT", "NEW", "ARRAY", "IDENT", "WHITESPACE"
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


	public L1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ab\n\26\3\27\6\27\u00ae\n\27"+
		"\r\27\16\27\u00af\3\30\3\30\3\30\3\30\3\30\5\30\u00b7\n\30\3\30\3\30\3"+
		"\31\3\31\3\31\5\31\u00be\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00cb\n\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00d3"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u00da\n\36\3\37\3\37\3\37\3\37\6\37"+
		"\u00e0\n\37\r\37\16\37\u00e1\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$"+
		"\7$\u00f1\n$\f$\16$\u00f4\13$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\5"+
		"\'\u0102\n\'\3\'\3\'\3\'\3\'\7\'\u0108\n\'\f\'\16\'\u010b\13\'\3(\3(\3"+
		"(\5(\u0110\n(\3(\3(\6(\u0114\n(\r(\16(\u0115\3(\3(\2\2)\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2"+
		"E\2G\2I K!M\"O#\3\2\n\4\2HHVV\4\2--//\4\2,,\61\61\3\2\62;\3\2c|\3\2C\\"+
		"\4\2\f\f\16\17\4\2\13\13\"\"\2\u012d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2"+
		"\2\2\2O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2\2\13`\3\2\2"+
		"\2\rb\3\2\2\2\17d\3\2\2\2\21k\3\2\2\2\23n\3\2\2\2\25q\3\2\2\2\27v\3\2"+
		"\2\2\31}\3\2\2\2\33\u0082\3\2\2\2\35\u0088\3\2\2\2\37\u008b\3\2\2\2!\u0092"+
		"\3\2\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2\'\u009b\3\2\2\2)\u009d\3\2\2\2"+
		"+\u00aa\3\2\2\2-\u00ad\3\2\2\2/\u00b1\3\2\2\2\61\u00ba\3\2\2\2\63\u00c1"+
		"\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00d2\3\2\2\2;\u00d9\3\2\2"+
		"\2=\u00df\3\2\2\2?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9"+
		"\3\2\2\2G\u00eb\3\2\2\2I\u00f5\3\2\2\2K\u00f9\3\2\2\2M\u0101\3\2\2\2O"+
		"\u0113\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7h\2\2TU\7k\2\2UV\7p\2\2VW\7g\2\2W"+
		"\4\3\2\2\2XY\7*\2\2Y\6\3\2\2\2Z[\7+\2\2[\b\3\2\2\2\\]\7g\2\2]^\7p\2\2"+
		"^_\7f\2\2_\n\3\2\2\2`a\7.\2\2a\f\3\2\2\2bc\7=\2\2c\16\3\2\2\2de\7t\2\2"+
		"ef\7g\2\2fg\7v\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2j\20\3\2\2\2kl\7<\2\2lm\7"+
		"?\2\2m\22\3\2\2\2no\7k\2\2op\7h\2\2p\24\3\2\2\2qr\7v\2\2rs\7j\2\2st\7"+
		"g\2\2tu\7p\2\2u\26\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z{\7k\2"+
		"\2{|\7h\2\2|\30\3\2\2\2}~\7g\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081"+
		"\7g\2\2\u0081\32\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\34\3\2\2\2\u0088\u0089"+
		"\7f\2\2\u0089\u008a\7q\2\2\u008a\36\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7v\2\2\u0091 \3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7f\2\2\u0095\"\3\2\2\2\u0096\u0097\7/\2\2\u0097$\3\2\2\2\u0098"+
		"\u0099\7,\2\2\u0099\u009a\7,\2\2\u009a&\3\2\2\2\u009b\u009c\7]\2\2\u009c"+
		"(\3\2\2\2\u009d\u009e\7_\2\2\u009e*\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00ab\7v\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00ab\7t\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\u00a9\7q\2\2\u00a9\u00ab\7n\2\2\u00aa\u009f\3\2\2\2\u00aa\u00a2"+
		"\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab,\3\2\2\2\u00ac\u00ae\5? \2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		".\3\2\2\2\u00b1\u00b6\7)\2\2\u00b2\u00b7\5A!\2\u00b3\u00b7\5C\"\2\u00b4"+
		"\u00b7\5? \2\u00b5\u00b7\7\"\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\7)\2\2\u00b9\60\3\2\2\2\u00ba\u00bd\7$\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00be\5=\37\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\7$\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\t\2\2\2\u00c2\64"+
		"\3\2\2\2\u00c3\u00cb\4>@\2\u00c4\u00c5\7@\2\2\u00c5\u00cb\7?\2\2\u00c6"+
		"\u00c7\7>\2\2\u00c7\u00cb\7?\2\2\u00c8\u00c9\7>\2\2\u00c9\u00cb\7@\2\2"+
		"\u00ca\u00c3\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd8\3\2\2\2\u00ce\u00cf"+
		"\7o\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d3\7f\2\2\u00d1\u00d3\t\4\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7z\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00da\7t\2\2\u00d7\u00d8\7q\2\2\u00d8\u00da\7t\2\2"+
		"\u00d9\u00d4\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da<\3\2\2\2\u00db\u00e0\5"+
		"A!\2\u00dc\u00e0\5C\"\2\u00dd\u00e0\5? \2\u00de\u00e0\7\"\2\2\u00df\u00db"+
		"\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2>\3\2\2\2"+
		"\u00e3\u00e4\t\5\2\2\u00e4@\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6B\3\2\2\2"+
		"\u00e7\u00e8\t\7\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7\13\2\2\u00eaF\3\2\2"+
		"\2\u00eb\u00ec\7,\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7,\2\2\u00ee\u00f2"+
		"\3\2\2\2\u00ef\u00f1\n\b\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3H\3\2\2\2\u00f4\u00f2\3\2\2\2"+
		"\u00f5\u00f6\7p\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7y\2\2\u00f8J\3\2\2"+
		"\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd"+
		"\7c\2\2\u00fd\u00fe\7{\2\2\u00feL\3\2\2\2\u00ff\u0102\5C\"\2\u0100\u0102"+
		"\5A!\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0109\3\2\2\2\u0103"+
		"\u0108\5C\"\2\u0104\u0108\5A!\2\u0105\u0108\5? \2\u0106\u0108\7a\2\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"N\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0114\t\t\2\2\u010d\u0114\5G$\2\u010e"+
		"\u0110\7\17\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0114\7\f\2\2\u0112\u0114\4\16\17\2\u0113\u010c\3\2\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\b(\2\2\u0118P\3\2\2\2\23\2\u00aa\u00af\u00b6\u00bd\u00ca\u00d2"+
		"\u00d9\u00df\u00e1\u00f2\u0101\u0107\u0109\u010f\u0113\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}