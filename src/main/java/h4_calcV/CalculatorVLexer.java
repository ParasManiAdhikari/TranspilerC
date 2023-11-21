// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/CalculatorV.g4 by ANTLR 4.13.1
package h4_calcV;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorVLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, NL=9, WS=10, 
		MUL=11, DIV=12, ADD=13, SUB=14, ASSIGN=15, POWER=16, CLEAR=17, GREATER=18, 
		SMALLER=19, EQUALS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ID", "INT", "NL", "WS", 
			"MUL", "DIV", "ADD", "SUB", "ASSIGN", "POWER", "CLEAR", "GREATER", "SMALLER", 
			"EQUALS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'('", "')'", "'else'", "'?'", "':'", null, null, null, 
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'^'", "'clear'", "'>'", "'<'", 
			"'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "INT", "NL", "WS", "MUL", 
			"DIV", "ADD", "SUB", "ASSIGN", "POWER", "CLEAR", "GREATER", "SMALLER", 
			"EQUALS"
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


	public CalculatorVLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorV.g4"; }

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
		"\u0004\u0000\u0014h\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0004\u0006;\b\u0006\u000b\u0006\f\u0006"+
		"<\u0001\u0007\u0004\u0007@\b\u0007\u000b\u0007\f\u0007A\u0001\b\u0003"+
		"\bE\b\b\u0001\b\u0001\b\u0001\t\u0004\tJ\b\t\u000b\t\f\tK\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0003"+
		"\u0002\u0000AZaz\u0001\u000009\u0002\u0000\t\t  k\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000"+
		"\u0000\u0005.\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t"+
		"5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r:\u0001\u0000"+
		"\u0000\u0000\u000f?\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000\u0000"+
		"\u0013I\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017Q"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bU\u0001\u0000"+
		"\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001fY\u0001\u0000\u0000\u0000"+
		"![\u0001\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000%c\u0001\u0000\u0000"+
		"\u0000\'e\u0001\u0000\u0000\u0000)*\u0005i\u0000\u0000*+\u0005f\u0000"+
		"\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005(\u0000\u0000-\u0004\u0001"+
		"\u0000\u0000\u0000./\u0005)\u0000\u0000/\u0006\u0001\u0000\u0000\u0000"+
		"01\u0005e\u0000\u000012\u0005l\u0000\u000023\u0005s\u0000\u000034\u0005"+
		"e\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005?\u0000\u00006\n\u0001"+
		"\u0000\u0000\u000078\u0005:\u0000\u00008\f\u0001\u0000\u0000\u00009;\u0007"+
		"\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u000e\u0001\u0000"+
		"\u0000\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B\u0010\u0001\u0000\u0000\u0000CE\u0005\r\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\n\u0000"+
		"\u0000G\u0012\u0001\u0000\u0000\u0000HJ\u0007\u0002\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0006\t\u0000\u0000"+
		"N\u0014\u0001\u0000\u0000\u0000OP\u0005*\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QR\u0005/\u0000\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005"+
		"+\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000V\u001c"+
		"\u0001\u0000\u0000\u0000WX\u0005=\u0000\u0000X\u001e\u0001\u0000\u0000"+
		"\u0000YZ\u0005^\u0000\u0000Z \u0001\u0000\u0000\u0000[\\\u0005c\u0000"+
		"\u0000\\]\u0005l\u0000\u0000]^\u0005e\u0000\u0000^_\u0005a\u0000\u0000"+
		"_`\u0005r\u0000\u0000`\"\u0001\u0000\u0000\u0000ab\u0005>\u0000\u0000"+
		"b$\u0001\u0000\u0000\u0000cd\u0005<\u0000\u0000d&\u0001\u0000\u0000\u0000"+
		"ef\u0005=\u0000\u0000fg\u0005=\u0000\u0000g(\u0001\u0000\u0000\u0000\u0005"+
		"\u0000<ADK\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}