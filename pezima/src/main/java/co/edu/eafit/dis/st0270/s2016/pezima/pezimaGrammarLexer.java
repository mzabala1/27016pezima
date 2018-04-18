// Generated from pezimaGrammar.g4 by ANTLR 4.5.3

	       package co.edu.eafit.dis.st0270.s2016.pezimaGrammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pezimaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUM=13, NAME=14, KEYWORDS=15, OPERATORS=16, 
		SEPARATORS=17, WS=18, ERRORCHARACTER=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "NUM", "NAME", "KEYWORDS", "OPERATORS", "SEPARATORS", 
		"WS", "ERRORCHARACTER"
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


	public pezimaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pezimaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\7\16^\n\16\f\16\16\16a\13\16\3\16\5\16d\n"+
		"\16\3\17\6\17g\n\17\r\17\16\17h\3\17\7\17l\n\17\f\17\16\17o\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0092\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u009b\n\23\3\23\3\23\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\7"+
		"\4\2C\\c|\6\2\62;C\\aac|\4\2,-??\6\2*+==]]__\5\2\13\f\16\17\"\"\u00aa"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2"+
		"\2\13\64\3\2\2\2\r8\3\2\2\2\17?\3\2\2\2\21E\3\2\2\2\23K\3\2\2\2\25S\3"+
		"\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33c\3\2\2\2\35f\3\2\2\2\37\u0091\3\2\2"+
		"\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u009a\3\2\2\2\'\u009e\3\2\2\2)*\7]\2"+
		"\2*\4\3\2\2\2+,\7_\2\2,\6\3\2\2\2-.\7=\2\2.\b\3\2\2\2/\60\7f\2\2\60\61"+
		"\7g\2\2\61\62\7e\2\2\62\63\7n\2\2\63\n\3\2\2\2\64\65\7w\2\2\65\66\7u\2"+
		"\2\66\67\7g\2\2\67\f\3\2\2\289\7k\2\29:\7h\2\2:;\7|\2\2;<\7g\2\2<=\7t"+
		"\2\2=>\7q\2\2>\16\3\2\2\2?@\7k\2\2@A\7h\2\2AB\7p\2\2BC\7g\2\2CD\7i\2\2"+
		"D\20\3\2\2\2EF\7k\2\2FG\7h\2\2GH\7r\2\2HI\7q\2\2IJ\7u\2\2J\22\3\2\2\2"+
		"KL\7k\2\2LM\7h\2\2MN\7p\2\2NO\7|\2\2OP\7g\2\2PQ\7t\2\2QR\7q\2\2R\24\3"+
		"\2\2\2ST\7-\2\2T\26\3\2\2\2UV\7,\2\2V\30\3\2\2\2WX\7p\2\2XY\7g\2\2YZ\7"+
		"i\2\2Z\32\3\2\2\2[_\4\63;\2\\^\4\62;\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`d\3\2\2\2a_\3\2\2\2bd\7\62\2\2c[\3\2\2\2cb\3\2\2\2d\34\3\2"+
		"\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2im\3\2\2\2jl\t\3"+
		"\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\36\3\2\2\2om\3\2\2\2pq\7"+
		"f\2\2qr\7g\2\2rs\7e\2\2s\u0092\7n\2\2tu\7w\2\2uv\7u\2\2v\u0092\7g\2\2"+
		"wx\7k\2\2xy\7h\2\2yz\7p\2\2z{\7g\2\2{\u0092\7i\2\2|}\7k\2\2}~\7h\2\2~"+
		"\177\7r\2\2\177\u0080\7q\2\2\u0080\u0092\7u\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7h\2\2\u0083\u0084\7|\2\2\u0084\u0085\7g\2\2\u0085\u0086\7t\2\2"+
		"\u0086\u0092\7q\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7|\2\2\u008b\u008c\7g\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u0092\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7g\2\2\u0090\u0092\7i\2\2"+
		"\u0091p\3\2\2\2\u0091t\3\2\2\2\u0091w\3\2\2\2\u0091|\3\2\2\2\u0091\u0081"+
		"\3\2\2\2\u0091\u0087\3\2\2\2\u0091\u008e\3\2\2\2\u0092 \3\2\2\2\u0093"+
		"\u0094\t\4\2\2\u0094\"\3\2\2\2\u0095\u0096\t\5\2\2\u0096$\3\2\2\2\u0097"+
		"\u009b\t\6\2\2\u0098\u0099\7\f\2\2\u0099\u009b\7\16\2\2\u009a\u0097\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\23\2\2\u009d"+
		"&\3\2\2\2\u009e\u009f\13\2\2\2\u009f(\3\2\2\2\t\2_chm\u0091\u009a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}