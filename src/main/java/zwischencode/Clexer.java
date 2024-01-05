package zwischencode;// Generated from C:/Users/Nitesh/IdeaProjects/syntaxgesteuertezwischencodeerzeugung/.idea/src/main/antlr4/Clexer.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Clexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_FLOAT=1, K_INT=2, K_VOID=3, POW=4, MUL=5, DIV=6, ADD=7, SUB=8, EQUALS=9, 
		UNEQUALS=10, SMALLER=11, BIGGER=12, ID=13, INT=14, WS=15, SL_COMMENT=16, 
		FORMAT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"K_FLOAT", "K_INT", "K_VOID", "POW", "MUL", "DIV", "ADD", "SUB", "EQUALS", 
			"UNEQUALS", "SMALLER", "BIGGER", "ID", "LETTER", "INT", "WS", "SL_COMMENT", 
			"FORMAT", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'float'", "'int'", "'void'", "'^'", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "K_FLOAT", "K_INT", "K_VOID", "POW", "MUL", "DIV", "ADD", "SUB", 
			"EQUALS", "UNEQUALS", "SMALLER", "BIGGER", "ID", "INT", "WS", "SL_COMMENT", 
			"FORMAT"
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


	public Clexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Clexer.g4"; }

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
		"\u0004\u0000\u0011}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\fN\b\f\n\f\f\fQ\t\f\u0001\r\u0001\r\u0001\u000e\u0004\u000eV"+
		"\b\u000e\u000b\u000e\f\u000eW\u0001\u000f\u0004\u000f[\b\u000f\u000b\u000f"+
		"\f\u000f\\\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010e\b\u0010\n\u0010\f\u0010h\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011q\b\u0011\n\u0011\f\u0011t\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012|\b\u0012"+
		"\u0002fr\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u0000\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0000\u0001"+
		"\u0000\u0003\u0001\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u0082"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u00051\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t"+
		"8\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r<\u0001\u0000"+
		"\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000\u0000"+
		"\u0013C\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017H"+
		"\u0001\u0000\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bR\u0001\u0000"+
		"\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000"+
		"!`\u0001\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000"+
		"\u0000\'(\u0005f\u0000\u0000()\u0005l\u0000\u0000)*\u0005o\u0000\u0000"+
		"*+\u0005a\u0000\u0000+,\u0005t\u0000\u0000,\u0002\u0001\u0000\u0000\u0000"+
		"-.\u0005i\u0000\u0000./\u0005n\u0000\u0000/0\u0005t\u0000\u00000\u0004"+
		"\u0001\u0000\u0000\u000012\u0005v\u0000\u000023\u0005o\u0000\u000034\u0005"+
		"i\u0000\u000045\u0005d\u0000\u00005\u0006\u0001\u0000\u0000\u000067\u0005"+
		"^\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005*\u0000\u00009\n\u0001"+
		"\u0000\u0000\u0000:;\u0005/\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005"+
		"+\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?\u0010"+
		"\u0001\u0000\u0000\u0000@A\u0005=\u0000\u0000AB\u0005=\u0000\u0000B\u0012"+
		"\u0001\u0000\u0000\u0000CD\u0005!\u0000\u0000DE\u0005=\u0000\u0000E\u0014"+
		"\u0001\u0000\u0000\u0000FG\u0005<\u0000\u0000G\u0016\u0001\u0000\u0000"+
		"\u0000HI\u0005>\u0000\u0000I\u0018\u0001\u0000\u0000\u0000JO\u0003\u001b"+
		"\r\u0000KN\u0003\u001b\r\u0000LN\u0007\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u001a\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RS\u0007\u0001\u0000\u0000S\u001c\u0001"+
		"\u0000\u0000\u0000TV\u0007\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\u001e\u0001\u0000\u0000\u0000Y[\u0007\u0002\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\u000f\u0000"+
		"\u0000_ \u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000ab\u0005/\u0000\u0000"+
		"bf\u0001\u0000\u0000\u0000ce\t\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\n\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kl\u0006\u0010\u0000\u0000l\"\u0001\u0000"+
		"\u0000\u0000mr\u0005\"\u0000\u0000nq\u0003%\u0012\u0000oq\t\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000v$\u0001"+
		"\u0000\u0000\u0000wx\u0005\\\u0000\u0000x|\u0005\"\u0000\u0000yz\u0005"+
		"\\\u0000\u0000z|\u0005\\\u0000\u0000{w\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|&\u0001\u0000\u0000\u0000\t\u0000MOW\\fpr{\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}