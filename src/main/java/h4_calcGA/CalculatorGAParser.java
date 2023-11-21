// Generated from C:/Users/paras/IdeaProjects/fsu-praktikum/src/main/grammars/syntaxgesteuerte/CalculatorGA.g4 by ANTLR 4.13.1
package h4_calcGA;

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorGAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, INT=6, NL=7, WS=8, MUL=9, DIV=10, 
		ADD=11, SUB=12, ASSIGN=13, POWER=14, CLEAR=15, GREATER=16, SMALLER=17, 
		EQUALS=18;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr"
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

	@Override
	public String getGrammarFileName() { return "CalculatorGA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /** "memory" for our calculator; variable/value pairs go here */
	    Map<String, Integer> memory = new HashMap<String, Integer>();
	    int eval(int left, int op, int right) {
	        switch ( op ) {
	            case MUL : return left * right;
	            case DIV : return left / right;
	            case ADD : return left + right;
	            case SUB : return left - right;
	            case EQUALS : return left == right ? 1 : 0;
	            case SMALLER : return left < right ? 1 : 0;
	            case GREATER : return left > right ? 1 : 0;
	        }
	        return 0;
	    }

	public CalculatorGAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGAListener ) ((CalculatorGAListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGAListener ) ((CalculatorGAListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGAVisitor ) return ((CalculatorGAVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32994L) != 0) );
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
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(CalculatorGAParser.NL, 0); }
		public TerminalNode ID() { return getToken(CalculatorGAParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CalculatorGAParser.ASSIGN, 0); }
		public TerminalNode CLEAR() { return getToken(CalculatorGAParser.CLEAR, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGAListener ) ((CalculatorGAListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGAListener ) ((CalculatorGAListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGAVisitor ) return ((CalculatorGAVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				((StatContext)_localctx).expr = expr(0);
				setState(12);
				match(NL);
				System.out.println(((StatContext)_localctx).expr.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				((StatContext)_localctx).ID = match(ID);
				setState(16);
				match(ASSIGN);
				setState(17);
				((StatContext)_localctx).expr = expr(0);
				setState(18);
				match(NL);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(CLEAR);
				memory.clear();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public int v;
		public ExprContext a;
		public ExprContext expr;
		public Token INT;
		public Token ID;
		public Token op;
		public ExprContext b;
		public ExprContext c;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(CalculatorGAParser.INT, 0); }
		public TerminalNode ID() { return getToken(CalculatorGAParser.ID, 0); }
		public TerminalNode POWER() { return getToken(CalculatorGAParser.POWER, 0); }
		public TerminalNode MUL() { return getToken(CalculatorGAParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalculatorGAParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(CalculatorGAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorGAParser.SUB, 0); }
		public TerminalNode EQUALS() { return getToken(CalculatorGAParser.EQUALS, 0); }
		public TerminalNode SMALLER() { return getToken(CalculatorGAParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(CalculatorGAParser.GREATER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGAListener ) ((CalculatorGAListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorGAListener ) ((CalculatorGAListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGAVisitor ) return ((CalculatorGAVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(27);
				match(T__0);
				setState(28);
				((ExprContext)_localctx).expr = expr(0);
				setState(29);
				match(T__1);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).expr.v;
				}
				break;
			case INT:
				{
				setState(32);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).v =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0);
				}
				break;
			case ID:
				{
				setState(34);
				((ExprContext)_localctx).ID = match(ID);

				      String id = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
				      ((ExprContext)_localctx).v =  memory.containsKey(id) ? memory.get(id) : 0;
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(38);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(39);
						((ExprContext)_localctx).op = match(POWER);
						setState(40);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(7);
						((ExprContext)_localctx).v =  (int) Math.pow(((ExprContext)_localctx).a.v, ((ExprContext)_localctx).b.v);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(7);
						((ExprContext)_localctx).v =  eval(((ExprContext)_localctx).a.v, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.v);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(49);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).v =  eval(((ExprContext)_localctx).a.v, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.v);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).v =  eval(((ExprContext)_localctx).a.v, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.v);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59);
						match(T__2);
						setState(60);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(0);
						setState(61);
						match(T__3);
						setState(62);
						((ExprContext)_localctx).c = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).a.v==1 ? ((ExprContext)_localctx).b.v : ((ExprContext)_localctx).c.v;
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012G\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001\u0002\u0000\u0001"+
		"\u0004\u0003\u0000\u0002\u0004\u0000\u0003\u0001\u0000\t\n\u0001\u0000"+
		"\u000b\f\u0001\u0000\u0010\u0012N\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0002\u0018\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006"+
		"\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\t\u0001"+
		"\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000"+
		"\u0000\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000"+
		"\f\r\u0005\u0007\u0000\u0000\r\u000e\u0006\u0001\uffff\uffff\u0000\u000e"+
		"\u0019\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010"+
		"\u0011\u0005\r\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013"+
		"\u0005\u0007\u0000\u0000\u0013\u0014\u0006\u0001\uffff\uffff\u0000\u0014"+
		"\u0019\u0001\u0000\u0000\u0000\u0015\u0019\u0005\u0007\u0000\u0000\u0016"+
		"\u0017\u0005\u000f\u0000\u0000\u0017\u0019\u0006\u0001\uffff\uffff\u0000"+
		"\u0018\u000b\u0001\u0000\u0000\u0000\u0018\u000f\u0001\u0000\u0000\u0000"+
		"\u0018\u0015\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0006\u0002\uffff\uffff"+
		"\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0003\u0004\u0002"+
		"\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f\u0006\u0002\uffff"+
		"\uffff\u0000\u001f%\u0001\u0000\u0000\u0000 !\u0005\u0006\u0000\u0000"+
		"!%\u0006\u0002\uffff\uffff\u0000\"#\u0005\u0005\u0000\u0000#%\u0006\u0002"+
		"\uffff\uffff\u0000$\u001a\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000%C\u0001\u0000\u0000\u0000&\'\n\u0007"+
		"\u0000\u0000\'(\u0005\u000e\u0000\u0000()\u0003\u0004\u0002\u0007)*\u0006"+
		"\u0002\uffff\uffff\u0000*B\u0001\u0000\u0000\u0000+,\n\u0006\u0000\u0000"+
		",-\u0007\u0000\u0000\u0000-.\u0003\u0004\u0002\u0007./\u0006\u0002\uffff"+
		"\uffff\u0000/B\u0001\u0000\u0000\u000001\n\u0005\u0000\u000012\u0007\u0001"+
		"\u0000\u000023\u0003\u0004\u0002\u000634\u0006\u0002\uffff\uffff\u0000"+
		"4B\u0001\u0000\u0000\u000056\n\u0004\u0000\u000067\u0007\u0002\u0000\u0000"+
		"78\u0003\u0004\u0002\u000589\u0006\u0002\uffff\uffff\u00009B\u0001\u0000"+
		"\u0000\u0000:;\n\u0003\u0000\u0000;<\u0005\u0003\u0000\u0000<=\u0003\u0004"+
		"\u0002\u0000=>\u0005\u0004\u0000\u0000>?\u0003\u0004\u0002\u0004?@\u0006"+
		"\u0002\uffff\uffff\u0000@B\u0001\u0000\u0000\u0000A&\u0001\u0000\u0000"+
		"\u0000A+\u0001\u0000\u0000\u0000A0\u0001\u0000\u0000\u0000A5\u0001\u0000"+
		"\u0000\u0000A:\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000\u0005\t\u0018$AC";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}