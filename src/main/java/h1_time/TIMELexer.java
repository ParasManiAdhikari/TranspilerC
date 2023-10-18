// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/lexikalische_filter/TIMELexer.g4 by ANTLR 4.13.1
package h1_time;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TIMELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIME=1, Hour=2, Minute=3, Sekunden=4, OTHER=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIME", "Hour", "Minute", "Sekunden", "Colon", "DIGIT", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIME", "Hour", "Minute", "Sekunden", "OTHER"
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


	public TIMELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TIMELexer.g4"; }

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
		"\u0004\u0000\u00051\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0016\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001c\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"(\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000\r\u0005\u0001\u0000"+
		"\u0006\u0001\u000001\u0001\u000022\u0001\u000003\u0001\u000000\u0001\u0000"+
		"15\u0001\u0000092\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000"+
		"\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000"+
		"\u0000\u0007\'\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b"+
		"+\u0001\u0000\u0000\u0000\r-\u0001\u0000\u0000\u0000\u000f\u0010\u0003"+
		"\u0003\u0001\u0000\u0010\u0011\u0003\t\u0004\u0000\u0011\u0015\u0003\u0005"+
		"\u0002\u0000\u0012\u0013\u0003\t\u0004\u0000\u0013\u0014\u0003\u0007\u0003"+
		"\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0012\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0002\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u001c\u0003\u000b\u0005"+
		"\u0000\u0019\u001a\u0007\u0001\u0000\u0000\u001a\u001c\u0007\u0002\u0000"+
		"\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0007\u0003\u0000"+
		"\u0000\u001e\"\u0003\u000b\u0005\u0000\u001f \u0007\u0004\u0000\u0000"+
		" \"\u0003\u000b\u0005\u0000!\u001d\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0007\u0003\u0000"+
		"\u0000$(\u0003\u000b\u0005\u0000%&\u0007\u0004\u0000\u0000&(\u0003\u000b"+
		"\u0005\u0000\'#\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(\b"+
		"\u0001\u0000\u0000\u0000)*\u0005:\u0000\u0000*\n\u0001\u0000\u0000\u0000"+
		"+,\u0007\u0005\u0000\u0000,\f\u0001\u0000\u0000\u0000-.\t\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0006\u0000\u00000\u000e\u0001"+
		"\u0000\u0000\u0000\u0005\u0000\u0015\u001b!\'\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}