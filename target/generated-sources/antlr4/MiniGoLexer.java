// Generated from MiniGo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, VAR=21, FUNC=22, FMT=23, INT=24, FOR=25, 
		IF=26, ELSE=27, RETURN=28, OR=29, AND=30, LE=31, GE=32, EQ=33, NE=34, 
		IDENT=35, LITERAL=36, DecimalConstant=37, OctalConstant=38, HexadecimalConstant=39, 
		WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "VAR", "FUNC", "FMT", "INT", "FOR", "IF", "ELSE", 
		"RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", "IDENT", "LITERAL", "DecimalConstant", 
		"OctalConstant", "HexadecimalConstant", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "';'", "'++'", 
		"'--'", "'.'", "'-'", "'+'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'var'", "'func'", "'fmt'", "'int'", "'for'", "'if'", "'else'", "'return'", 
		"'or'", "'and'", "'<='", "'>='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "VAR", "FUNC", "FMT", 
		"INT", "FOR", "IF", "ELSE", "RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", 
		"IDENT", "LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
		"WS"
	};
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


	public MiniGoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			VAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			FUNC_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			FMT_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			RETURN_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			LE_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			GE_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			NE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			LITERAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			DecimalConstant_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			OctalConstant_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			HexadecimalConstant_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("201402406 Rule 18");
			break;
		}
	}
	private void FUNC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("201402406 Rule 19");
			break;
		}
	}
	private void FMT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("201402406 Rule 20");
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("201402406 Rule 21");
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("201402406 Rule 22");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("201402406 Rule 23");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("201402406 Rule 24");
			break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("201402406 Rule 25");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("201402406 Rule 26");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("201402406 Rule 27");
			break;
		}
	}
	private void LE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("201402406 Rule 28");
			break;
		}
	}
	private void GE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println("201402406 Rule 29");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.println("201402406 Rule 30");
			break;
		}
	}
	private void NE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.println("201402406 Rule 31");
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.println("201402406 Rule 32-0");
			break;
		case 15:
			System.out.println("201402406 Rule 32-1");
			break;
		case 16:
			System.out.println("201402406 Rule 32-2");
			break;
		}
	}
	private void LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println("201402406 Rule 33");
			break;
		}
	}
	private void DecimalConstant_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			System.out.println("201402406 Rule 34-0");
			break;
		case 19:
			System.out.println("201402406 Rule 34-1");
			break;
		}
	}
	private void OctalConstant_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			System.out.println("201402406 Rule 35");
			break;
		}
	}
	private void HexadecimalConstant_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			System.out.println("201402406 Rule 36");
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			System.out.println("201402406 Rule 37-0");
			break;
		case 23:
			System.out.println("201402406 Rule 37-1");
			break;
		case 24:
			System.out.println("201402406 Rule 37-2");
			break;
		case 25:
			System.out.println("201402406 Rule 37-3");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\7$\u00d7\n$\f$\16$\u00da\13$\3%\3%\3%\3%\3%\5%\u00e1\n%\3"+
		"&\3&\3&\3&\7&\u00e7\n&\f&\16&\u00ea\13&\3&\5&\u00ed\n&\3\'\3\'\7\'\u00f1"+
		"\n\'\f\'\16\'\u00f4\13\'\3\'\3\'\3(\3(\3(\6(\u00fb\n(\r(\16(\u00fc\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3)\6)\u0109\n)\r)\16)\u010a\3)\3)\2\2*\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*\3\2\b\5\2C\\aac|\3\2\62;\3\2\63;\3\2\629\4\2ZZzz"+
		"\5\2\62;CHch\2\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3"+
		"\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27h\3\2\2\2\31"+
		"k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3"+
		"\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\u0083\3\2\2\2/\u008a\3\2\2\2\61"+
		"\u0090\3\2\2\2\63\u0096\3\2\2\2\65\u009c\3\2\2\2\67\u00a1\3\2\2\29\u00a8"+
		"\3\2\2\2;\u00b1\3\2\2\2=\u00b6\3\2\2\2?\u00bc\3\2\2\2A\u00c1\3\2\2\2C"+
		"\u00c6\3\2\2\2E\u00cb\3\2\2\2G\u00d0\3\2\2\2I\u00e0\3\2\2\2K\u00ec\3\2"+
		"\2\2M\u00ee\3\2\2\2O\u00f7\3\2\2\2Q\u0108\3\2\2\2ST\7?\2\2T\4\3\2\2\2"+
		"UV\7]\2\2V\6\3\2\2\2WX\7_\2\2X\b\3\2\2\2YZ\7*\2\2Z\n\3\2\2\2[\\\7+\2\2"+
		"\\\f\3\2\2\2]^\7.\2\2^\16\3\2\2\2_`\7}\2\2`\20\3\2\2\2ab\7\177\2\2b\22"+
		"\3\2\2\2cd\7=\2\2d\24\3\2\2\2ef\7-\2\2fg\7-\2\2g\26\3\2\2\2hi\7/\2\2i"+
		"j\7/\2\2j\30\3\2\2\2kl\7\60\2\2l\32\3\2\2\2mn\7/\2\2n\34\3\2\2\2op\7-"+
		"\2\2p\36\3\2\2\2qr\7#\2\2r \3\2\2\2st\7,\2\2t\"\3\2\2\2uv\7\61\2\2v$\3"+
		"\2\2\2wx\7\'\2\2x&\3\2\2\2yz\7>\2\2z(\3\2\2\2{|\7@\2\2|*\3\2\2\2}~\7x"+
		"\2\2~\177\7c\2\2\177\u0080\7t\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\26"+
		"\2\2\u0082,\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7w\2\2\u0085\u0086"+
		"\7p\2\2\u0086\u0087\7e\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\27\3\2\u0089"+
		".\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7o\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\30\4\2\u008f\60\3\2\2\2\u0090\u0091\7k\2"+
		"\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\b\31\5\2\u0095\62\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\32\6\2\u009b\64\3\2\2"+
		"\2\u009c\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\b\33\7\2\u00a0\66\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\34"+
		"\b\2\u00a78\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\b\35\t\2\u00b0:\3\2\2\2\u00b1\u00b2\7q\2\2"+
		"\u00b2\u00b3\7t\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\36\n\2\u00b5<\3"+
		"\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7f\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\b\37\13\2\u00bb>\3\2\2\2\u00bc\u00bd\7>\2\2"+
		"\u00bd\u00be\7?\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b \f\2\u00c0@\3\2"+
		"\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\b!\r\2\u00c5B\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\b\"\16\2\u00caD\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b#\17\2\u00cfF\3\2\2\2\u00d0"+
		"\u00d1\t\2\2\2\u00d1\u00d8\b$\20\2\u00d2\u00d3\t\2\2\2\u00d3\u00d7\b$"+
		"\21\2\u00d4\u00d5\t\3\2\2\u00d5\u00d7\b$\22\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9H\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e1\5K&\2\u00dc\u00e1"+
		"\5M\'\2\u00dd\u00de\5O(\2\u00de\u00df\b%\23\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1J\3\2\2\2"+
		"\u00e2\u00e3\7\62\2\2\u00e3\u00ed\b&\24\2\u00e4\u00e8\t\4\2\2\u00e5\u00e7"+
		"\t\3\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\b&"+
		"\25\2\u00ec\u00e2\3\2\2\2\u00ec\u00e4\3\2\2\2\u00edL\3\2\2\2\u00ee\u00f2"+
		"\7\62\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\b\'\26\2\u00f6N\3\2\2\2\u00f7\u00f8\7\62\2\2\u00f8"+
		"\u00fa\t\6\2\2\u00f9\u00fb\t\7\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\b(\27\2\u00ffP\3\2\2\2\u0100\u0101\7\"\2\2\u0101\u0109\b)\30\2"+
		"\u0102\u0103\7\13\2\2\u0103\u0109\b)\31\2\u0104\u0105\7\17\2\2\u0105\u0109"+
		"\b)\32\2\u0106\u0107\7\f\2\2\u0107\u0109\b)\33\2\u0108\u0100\3\2\2\2\u0108"+
		"\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b)\34\2\u010dR\3\2\2\2\f\2\u00d6\u00d8\u00e0\u00e8\u00ec\u00f2"+
		"\u00fc\u0108\u010a\35\3\26\2\3\27\3\3\30\4\3\31\5\3\32\6\3\33\7\3\34\b"+
		"\3\35\t\3\36\n\3\37\13\3 \f\3!\r\3\"\16\3#\17\3$\20\3$\21\3$\22\3%\23"+
		"\3&\24\3&\25\3\'\26\3(\27\3)\30\3)\31\3)\32\3)\33\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}