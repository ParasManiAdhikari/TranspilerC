// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/CalculatorGA.g4 by ANTLR 4.13.1
package h4_calcGA;

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorGALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, INT=6, NL=7, WS=8, MUL=9, DIV=10, 
		ADD=11, SUB=12, ASSIGN=13, POWER=14, CLEAR=15, GREATER=16, SMALLER=17, 
		EQUALS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ID", "INT", "NL", "WS", "MUL", "DIV", 
			"ADD", "SUB", "ASSIGN", "POWER", "CLEAR", "GREATER", "SMALLER", "EQUALS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'?'", "':'", null, null, null, null, "'*'", "'/'", 
			"'+'", "'-'", "'='", "'^'", "'clear'", "'>'", "'<'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "INT", "NL", "WS", "MUL", "DIV", 
			"ADD", "SUB", "ASSIGN", "POWER", "CLEAR", "GREATER", "SMALLER", "EQUALS"
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


	public CalculatorGALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorGA.g4"; }

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
		"\u0004\u0000\u0012\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004/\b\u0004\u000b\u0004\f\u0004"+
		"0\u0001\u0005\u0004\u00054\b\u0005\u000b\u0005\f\u00055\u0001\u0006\u0003"+
		"\u00069\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007>\b\u0007"+
		"\u000b\u0007\f\u0007?\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0002\u0000\t"+
		"\t  _\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001"+
		"\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000"+
		"\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t.\u0001\u0000\u0000\u0000"+
		"\u000b3\u0001\u0000\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f=\u0001"+
		"\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000"+
		"\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019"+
		"K\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001dO\u0001"+
		"\u0000\u0000\u0000\u001fU\u0001\u0000\u0000\u0000!W\u0001\u0000\u0000"+
		"\u0000#Y\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005)\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005"+
		"?\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005:\u0000\u0000,\b\u0001"+
		"\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001\n\u0001\u0000\u0000\u000024\u0007\u0001\u0000\u000032\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\f\u0001\u0000\u0000\u000079\u0005\r\u0000\u000087"+
		"\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0005\n\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<>\u0007\u0002"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0006\u0007\u0000\u0000B\u0010\u0001\u0000\u0000\u0000CD\u0005*\u0000"+
		"\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005/\u0000\u0000F\u0014\u0001"+
		"\u0000\u0000\u0000GH\u0005+\u0000\u0000H\u0016\u0001\u0000\u0000\u0000"+
		"IJ\u0005-\u0000\u0000J\u0018\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000"+
		"L\u001a\u0001\u0000\u0000\u0000MN\u0005^\u0000\u0000N\u001c\u0001\u0000"+
		"\u0000\u0000OP\u0005c\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005e\u0000"+
		"\u0000RS\u0005a\u0000\u0000ST\u0005r\u0000\u0000T\u001e\u0001\u0000\u0000"+
		"\u0000UV\u0005>\u0000\u0000V \u0001\u0000\u0000\u0000WX\u0005<\u0000\u0000"+
		"X\"\u0001\u0000\u0000\u0000YZ\u0005=\u0000\u0000Z[\u0005=\u0000\u0000"+
		"[$\u0001\u0000\u0000\u0000\u0005\u0000058?\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}