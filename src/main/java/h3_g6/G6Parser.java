// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxerkenner/G6.g4 by ANTLR 4.13.1
package h3_g6;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class G6Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, NL=9, WS=10;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_term = 3, RULE_fact = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "term", "fact"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "INT", "NL", "WS"
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
	public String getGrammarFileName() { return "G6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public G6Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G6Visitor ) return ((G6Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		return prog(0);
	}

	private ProgContext prog(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgContext _localctx = new ProgContext(_ctx, _parentState);
		ProgContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_prog, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(11);
			stat();
			}
			_ctx.stop = _input.LT(-1);
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prog);
					setState(13);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(14);
					stat();
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(G6Parser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G6Visitor ) return ((G6Visitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(NL);
				}
				break;
			case T__4:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				expr(0);
				setState(22);
				match(NL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G6Visitor ) return ((G6Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(29);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(30);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(31);
					term(0);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G6Visitor ) return ((G6Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(42);
					fact();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(G6Parser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G6Listener ) ((G6Listener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G6Visitor ) return ((G6Visitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fact);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(INT);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__4);
				setState(50);
				expr(0);
				setState(51);
				match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return prog_sempred((ProgContext)_localctx, predIndex);
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prog_sempred(ProgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002!\b\u0002\n\u0002\f\u0002"+
		"$\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004"+
		"\u0001\u0004\u0000\u0003\u0000\u0004\u0006\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u00047\u0000"+
		"\n\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001a"+
		"\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b5\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b\f\u0003\u0002"+
		"\u0001\u0000\f\u0011\u0001\u0000\u0000\u0000\r\u000e\n\u0001\u0000\u0000"+
		"\u000e\u0010\u0003\u0002\u0001\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010"+
		"\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0001\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0014\u0019\u0005\t\u0000\u0000\u0015\u0016"+
		"\u0003\u0004\u0002\u0000\u0016\u0017\u0005\t\u0000\u0000\u0017\u0019\u0001"+
		"\u0000\u0000\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0018\u0015\u0001"+
		"\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0006"+
		"\u0002\uffff\uffff\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c\"\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\n\u0001\u0000\u0000\u001e\u001f\u0007\u0000"+
		"\u0000\u0000\u001f!\u0003\u0006\u0003\u0000 \u001d\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#\u0005\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0006"+
		"\u0003\uffff\uffff\u0000&\'\u0003\b\u0004\u0000\'-\u0001\u0000\u0000\u0000"+
		"()\n\u0001\u0000\u0000)*\u0007\u0001\u0000\u0000*,\u0003\b\u0004\u0000"+
		"+(\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000006\u0005\b\u0000\u000012\u0005\u0005\u0000\u000023\u0003"+
		"\u0004\u0002\u000034\u0005\u0006\u0000\u000046\u0001\u0000\u0000\u0000"+
		"50\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000"+
		"\u0000\u0005\u0011\u0018\"-5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}