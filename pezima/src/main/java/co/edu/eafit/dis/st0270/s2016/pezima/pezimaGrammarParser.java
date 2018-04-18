// Generated from pezimaGrammar.g4 by ANTLR 4.5.3

		package co.edu.eafit.dis.st0270.s2016.pezimaGrammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pezimaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUM=13, NAME=14, KEYWORDS=15, OPERATORS=16, 
		SEPARATORS=17, WS=18, ERRORCHARACTER=19;
	public static final int
		RULE_prog = 0, RULE_stats = 1, RULE_lststs = 2, RULE_stat = 3, RULE_expr = 4, 
		RULE_term = 5, RULE_factor = 6;
	public static final String[] ruleNames = {
		"prog", "stats", "lststs", "stat", "expr", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "';'", "'decl'", "'use'", "'ifzero'", "'ifneg'", "'ifpos'", 
		"'ifnzero'", "'+'", "'*'", "'neg'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUM", "NAME", "KEYWORDS", "OPERATORS", "SEPARATORS", "WS", "ERRORCHARACTER"
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

	@Override
	public String getGrammarFileName() { return "pezimaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pezimaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			stats();
			setState(16);
			match(T__1);
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

	public static class StatsContext extends ParserRuleContext {
		public LststsContext lststs() {
			return getRuleContext(LststsContext.class,0);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(18);
				lststs();
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

	public static class LststsContext extends ParserRuleContext {
		public Token op;
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<LststsContext> lststs() {
			return getRuleContexts(LststsContext.class);
		}
		public LststsContext lststs(int i) {
			return getRuleContext(LststsContext.class,i);
		}
		public LststsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lststs; }
	}

	public final LststsContext lststs() throws RecognitionException {
		LststsContext _localctx = new LststsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lststs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			stat();
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					((LststsContext)_localctx).op = match(T__2);
					setState(23);
					lststs();
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NuevoBloqueContext extends StatContext {
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public NuevoBloqueContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class IfBlockContext extends StatContext {
		public Token op;
		public TerminalNode NAME() { return getToken(pezimaGrammarParser.NAME, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public IfBlockContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class DeclNameContext extends StatContext {
		public TerminalNode NAME() { return getToken(pezimaGrammarParser.NAME, 0); }
		public DeclNameContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class UseNameExprContext extends StatContext {
		public TerminalNode NAME() { return getToken(pezimaGrammarParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UseNameExprContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		int _la;
		try {
			setState(41);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NuevoBloqueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
				stats();
				setState(31);
				match(T__1);
				}
				break;
			case T__3:
				_localctx = new DeclNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__3);
				setState(34);
				match(NAME);
				}
				break;
			case T__4:
				_localctx = new UseNameExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(T__4);
				setState(36);
				match(NAME);
				setState(37);
				expr();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				((IfBlockContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					((IfBlockContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(39);
				match(NAME);
				setState(40);
				stat();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			term();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(44);
				match(T__9);
				setState(45);
				term();
				}
				}
				setState(50);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			factor();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(52);
				match(T__10);
				setState(53);
				factor();
				}
				}
				setState(58);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(pezimaGrammarParser.NUM, 0); }
		public NegNumContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class NumeroContext extends FactorContext {
		public Token op;
		public TerminalNode NUM() { return getToken(pezimaGrammarParser.NUM, 0); }
		public NumeroContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class NombreContext extends FactorContext {
		public TerminalNode NAME() { return getToken(pezimaGrammarParser.NAME, 0); }
		public NombreContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new NegNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(59);
					match(T__11);
					}
				}

				setState(62);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new NombreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(NAME);
				}
				break;
			case 3:
				_localctx = new NumeroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				((NumeroContext)_localctx).op = match(NUM);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13"+
		"\6\3\7\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\5\b?\n\b\3\b\3\b\3\b\5\bD\n"+
		"\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\b\13H\2\20\3\2\2\2\4\25\3\2\2\2\6"+
		"\27\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\65\3\2\2\2\16C\3\2\2\2\20\21\7\3\2"+
		"\2\21\22\5\4\3\2\22\23\7\4\2\2\23\3\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2"+
		"\2\25\26\3\2\2\2\26\5\3\2\2\2\27\34\5\b\5\2\30\31\7\5\2\2\31\33\5\6\4"+
		"\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2"+
		"\2\36\34\3\2\2\2\37 \7\3\2\2 !\5\4\3\2!\"\7\4\2\2\",\3\2\2\2#$\7\6\2\2"+
		"$,\7\20\2\2%&\7\7\2\2&\'\7\20\2\2\',\5\n\6\2()\t\2\2\2)*\7\20\2\2*,\5"+
		"\b\5\2+\37\3\2\2\2+#\3\2\2\2+%\3\2\2\2+(\3\2\2\2,\t\3\2\2\2-\62\5\f\7"+
		"\2./\7\f\2\2/\61\5\f\7\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\13\3\2\2\2\64\62\3\2\2\2\65:\5\16\b\2\66\67\7\r\2\2\679\5"+
		"\16\b\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<:\3\2\2\2"+
		"=?\7\16\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@D\7\17\2\2AD\7\20\2\2BD\7\17"+
		"\2\2C>\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\17\3\2\2\2\t\25\34+\62:>C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}