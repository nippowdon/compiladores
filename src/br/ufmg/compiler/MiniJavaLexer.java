package br.ufmg.compiler;
// Generated from /home/hendrix/Desktop/Plan B/MiniJava.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, TrueLiteral=2, FalseLiteral=3, BooleanType=4, IntegerType=5, 
		LogicalAnd=6, LessThan=7, MoreThan=8, Plus=9, Minus=10, Times=11, ExclamationMark=12, 
		Equals=13, EndLine=14, Comma=15, Dot=16, OpenBracket=17, CloseBracket=18, 
		OpenParenthesis=19, CloseParenthesis=20, OpenSquareBrackets=21, CloseSquareBrackets=22, 
		Sysout=23, ThisExpression=24, KeywordClass=25, KeywordPublic=26, KeywordStatic=27, 
		KeywordVoid=28, KeywordMain=29, KeywordString=30, KeywordExtends=31, KeywordReturn=32, 
		KeyWordIf=33, KeywordElse=34, KeywordWhile=35, KeywordLength=36, KeywordNew=37, 
		Identifier=38, WS=39, COMMENT=40, LINE_COMMENT=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IntegerLiteral", "'true'", "'false'", "'boolean'", "'int'", "'&&'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'!'", "'='", "';'", "','", "'.'", "'{'", 
		"'}'", "'('", "')'", "'['", "']'", "'System.out.println'", "'this'", "'class'", 
		"'public'", "'static'", "'void'", "'main'", "'String'", "'extends'", "'return'", 
		"'if'", "'else'", "'while'", "'length'", "'new'", "Identifier", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"IntegerLiteral", "TrueLiteral", "FalseLiteral", "BooleanType", "IntegerType", 
		"LogicalAnd", "LessThan", "MoreThan", "Plus", "Minus", "Times", "ExclamationMark", 
		"Equals", "EndLine", "Comma", "Dot", "OpenBracket", "CloseBracket", "OpenParenthesis", 
		"CloseParenthesis", "OpenSquareBrackets", "CloseSquareBrackets", "Sysout", 
		"ThisExpression", "KeywordClass", "KeywordPublic", "KeywordStatic", "KeywordVoid", 
		"KeywordMain", "KeywordString", "KeywordExtends", "KeywordReturn", "KeyWordIf", 
		"KeywordElse", "KeywordWhile", "KeywordLength", "KeywordNew", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40: WS_action((RuleContext)_localctx, actionIndex); break;

		case 41: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 42: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38: return JavaLetter_sempred((RuleContext)_localctx, predIndex);

		case 39: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));

		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));

		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u0134\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2[\n\2\r\2\16\2\\\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3\'\3\'\7\'\u0100\n\'\f\'\16\'\u0103\13\'\3(\3(\3(\3(\3"+
		"(\3(\5(\u010b\n(\3)\3)\3)\3)\3)\3)\5)\u0113\n)\3*\6*\u0116\n*\r*\16*\u0117"+
		"\3*\3*\3+\3+\3+\3+\7+\u0120\n+\f+\16+\u0123\13+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\7,\u012e\n,\f,\16,\u0131\13,\3,\3,\3\u0121-\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1"+
		"M(\1O\2\1Q\2\1S)\2U*\3W+\4\3\2\t\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\u013a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\3Z\3\2\2\2\5^\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13q\3\2\2"+
		"\2\ru\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25~\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3"+
		"\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0092"+
		"\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u0098\3\2\2\2\61\u00ab\3\2\2\2"+
		"\63\u00b0\3\2\2\2\65\u00b6\3\2\2\2\67\u00bd\3\2\2\29\u00c4\3\2\2\2;\u00c9"+
		"\3\2\2\2=\u00ce\3\2\2\2?\u00d5\3\2\2\2A\u00dd\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u00e7\3\2\2\2G\u00ec\3\2\2\2I\u00f2\3\2\2\2K\u00f9\3\2\2\2M\u00fd\3\2"+
		"\2\2O\u010a\3\2\2\2Q\u0112\3\2\2\2S\u0115\3\2\2\2U\u011b\3\2\2\2W\u0129"+
		"\3\2\2\2Y[\4\62;\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\4\3\2\2"+
		"\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ab\7g\2\2b\6\3\2\2\2cd\7h\2\2de\7c\2\2ef"+
		"\7n\2\2fg\7u\2\2gh\7g\2\2h\b\3\2\2\2ij\7d\2\2jk\7q\2\2kl\7q\2\2lm\7n\2"+
		"\2mn\7g\2\2no\7c\2\2op\7p\2\2p\n\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\f"+
		"\3\2\2\2uv\7(\2\2vw\7(\2\2w\16\3\2\2\2xy\7>\2\2y\20\3\2\2\2z{\7@\2\2{"+
		"\22\3\2\2\2|}\7-\2\2}\24\3\2\2\2~\177\7/\2\2\177\26\3\2\2\2\u0080\u0081"+
		"\7,\2\2\u0081\30\3\2\2\2\u0082\u0083\7#\2\2\u0083\32\3\2\2\2\u0084\u0085"+
		"\7?\2\2\u0085\34\3\2\2\2\u0086\u0087\7=\2\2\u0087\36\3\2\2\2\u0088\u0089"+
		"\7.\2\2\u0089 \3\2\2\2\u008a\u008b\7\60\2\2\u008b\"\3\2\2\2\u008c\u008d"+
		"\7}\2\2\u008d$\3\2\2\2\u008e\u008f\7\177\2\2\u008f&\3\2\2\2\u0090\u0091"+
		"\7*\2\2\u0091(\3\2\2\2\u0092\u0093\7+\2\2\u0093*\3\2\2\2\u0094\u0095\7"+
		"]\2\2\u0095,\3\2\2\2\u0096\u0097\7_\2\2\u0097.\3\2\2\2\u0098\u0099\7U"+
		"\2\2\u0099\u009a\7{\2\2\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7o\2\2\u009e\u009f\7\60\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7r\2"+
		"\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7p\2\2\u00aa\60\3\2\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7u\2\2\u00af"+
		"\62\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7u\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7r\2\2\u00b7"+
		"\u00b8\7w\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7k\2\2"+
		"\u00bb\u00bc\7e\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7"+
		"v\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7e\2\2\u00c38\3\2\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7f\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd<\3\2\2\2\u00ce\u00cf"+
		"\7U\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7p\2\2\u00d3\u00d4\7i\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7z\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7p\2\2"+
		"\u00da\u00db\7f\2\2\u00db\u00dc\7u\2\2\u00dc@\3\2\2\2\u00dd\u00de\7t\2"+
		"\2\u00de\u00df\7g\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\u00e3\7p\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7h\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7u\2\2\u00ea\u00eb\7g\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7y\2\2\u00ed\u00ee"+
		"\7j\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"H\3\2\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7i\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7j\2\2\u00f8J\3\2\2\2\u00f9"+
		"\u00fa\7p\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7y\2\2\u00fcL\3\2\2\2\u00fd"+
		"\u0101\5O(\2\u00fe\u0100\5Q)\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102N\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0104\u010b\t\2\2\2\u0105\u0106\n\3\2\2\u0106\u010b\6(\2\2\u0107"+
		"\u0108\t\4\2\2\u0108\u0109\t\5\2\2\u0109\u010b\6(\3\2\u010a\u0104\3\2"+
		"\2\2\u010a\u0105\3\2\2\2\u010a\u0107\3\2\2\2\u010bP\3\2\2\2\u010c\u0113"+
		"\t\6\2\2\u010d\u010e\n\3\2\2\u010e\u0113\6)\4\2\u010f\u0110\t\4\2\2\u0110"+
		"\u0111\t\5\2\2\u0111\u0113\6)\5\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2"+
		"\2\2\u0112\u010f\3\2\2\2\u0113R\3\2\2\2\u0114\u0116\t\7\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\b*\2\2\u011aT\3\2\2\2\u011b\u011c\7\61\2\2"+
		"\u011c\u011d\7,\2\2\u011d\u0121\3\2\2\2\u011e\u0120\13\2\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7,\2\2\u0125\u0126\7\61"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b+\3\2\u0128V\3\2\2\2\u0129\u012a"+
		"\7\61\2\2\u012a\u012b\7\61\2\2\u012b\u012f\3\2\2\2\u012c\u012e\n\b\2\2"+
		"\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\b,\4\2\u0133"+
		"X\3\2\2\2\n\2\\\u0101\u010a\u0112\u0117\u0121\u012f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}