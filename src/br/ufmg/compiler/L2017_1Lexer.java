// Generated from /home/hendrix/Desktop/L2017_1.g4 by ANTLR 4.1
package br.ufmg.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L2017_1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__43=1, T__42=2, T__41=3, T__40=4, T__39=5, T__38=6, T__37=7, T__36=8, 
		T__35=9, T__34=10, T__33=11, T__32=12, T__31=13, T__30=14, T__29=15, T__28=16, 
		T__27=17, T__26=18, T__25=19, T__24=20, T__23=21, T__22=22, T__21=23, 
		T__20=24, T__19=25, T__18=26, T__17=27, T__16=28, T__15=29, T__14=30, 
		T__13=31, T__12=32, T__11=33, T__10=34, T__9=35, T__8=36, T__7=37, T__6=38, 
		T__5=39, T__4=40, T__3=41, T__2=42, T__1=43, T__0=44, WS=45, COMMENT=46, 
		LINE_COMMENT=47, Digit=48, Identifier=49, UNICODE_CHAR=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'read'", "'−'", "'E'", "','", "'MOD'", "'-'", "'or'", "'*'", "'('", "':'", 
		"'if'", "'program'", "'<'", "'false'", "'!='", "'<='", "'until'", "'write'", 
		"'''", "'else'", "'boolean'", "'true'", "'char'", "'AND'", "')'", "'.'", 
		"'procedure'", "'+'", "'value'", "'='", "'reference'", "';'", "'repeat'", 
		"'div'", "'>'", "':='", "'integer'", "'begin'", "'then'", "'/'", "'>='", 
		"'end'", "'NOT'", "'real'", "WS", "COMMENT", "LINE_COMMENT", "Digit", 
		"Identifier", "UNICODE_CHAR"
	};
	public static final String[] ruleNames = {
		"T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", 
		"T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", 
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "WS", "COMMENT", "LINE_COMMENT", "Digit", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "UNICODE_CHAR"
	};


	public L2017_1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L2017_1.g4"; }

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
		case 44: WS_action((RuleContext)_localctx, actionIndex); break;

		case 45: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 46: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		case 49: return JavaLetter_sempred((RuleContext)_localctx, predIndex);

		case 50: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\64\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3.\6.\u0122\n.\r.\16.\u0123\3.\3.\3/\3/\3/\3/\7/\u012c\n/\f/\16/\u012f"+
		"\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u013a\n\60\f\60\16\60\u013d"+
		"\13\60\3\60\3\60\3\61\3\61\3\62\3\62\7\62\u0145\n\62\f\62\16\62\u0148"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0150\n\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\5\64\u0158\n\64\3\65\3\65\3\u012d\66\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'"+
		"\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\2]\60\3_\61\4a\62\1c\63\1e\2\1g\2\1i"+
		"\64\1\3\2\t\5\2\13\f\16\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\u0160\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5p\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2"+
		"\13v\3\2\2\2\rz\3\2\2\2\17|\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25"+
		"\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0088\3\2\2\2\33\u0090\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0098\3\2\2\2!\u009b\3\2\2\2#\u009e\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00aa\3\2\2\2)\u00ac\3\2\2\2+\u00b1\3\2\2\2-\u00b9\3\2\2\2/\u00be\3"+
		"\2\2\2\61\u00c3\3\2\2\2\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2"+
		"\2\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00dd\3\2\2\2?\u00df\3\2\2\2A\u00e9"+
		"\3\2\2\2C\u00eb\3\2\2\2E\u00f2\3\2\2\2G\u00f6\3\2\2\2I\u00f8\3\2\2\2K"+
		"\u00fb\3\2\2\2M\u0103\3\2\2\2O\u0109\3\2\2\2Q\u010e\3\2\2\2S\u0110\3\2"+
		"\2\2U\u0113\3\2\2\2W\u0117\3\2\2\2Y\u011b\3\2\2\2[\u0121\3\2\2\2]\u0127"+
		"\3\2\2\2_\u0135\3\2\2\2a\u0140\3\2\2\2c\u0142\3\2\2\2e\u014f\3\2\2\2g"+
		"\u0157\3\2\2\2i\u0159\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7c\2\2no\7f\2\2o\4\3"+
		"\2\2\2pq\7\u2214\2\2q\6\3\2\2\2rs\7G\2\2s\b\3\2\2\2tu\7.\2\2u\n\3\2\2"+
		"\2vw\7O\2\2wx\7Q\2\2xy\7F\2\2y\f\3\2\2\2z{\7/\2\2{\16\3\2\2\2|}\7q\2\2"+
		"}~\7t\2\2~\20\3\2\2\2\177\u0080\7,\2\2\u0080\22\3\2\2\2\u0081\u0082\7"+
		"*\2\2\u0082\24\3\2\2\2\u0083\u0084\7<\2\2\u0084\26\3\2\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7h\2\2\u0087\30\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7q\2\2\u008b\u008c\7i\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7o\2\2\u008f\32\3\2\2\2\u0090\u0091\7>\2\2\u0091"+
		"\34\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\36\3\2\2\2\u0098\u0099\7#\2\2\u0099"+
		"\u009a\7?\2\2\u009a \3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7n\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9&\3\2\2\2\u00aa\u00ab\7)\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0*\3\2\2\2\u00b1"+
		"\u00b2\7d\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7n\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2\2\u00b8,\3\2\2"+
		"\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd.\3\2\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7t\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c5"+
		"\7P\2\2\u00c5\u00c6\7F\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8\64"+
		"\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\u00d1\7f\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d48\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7"+
		"x\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7w\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc<\3\2\2\2\u00dd\u00de\7?\2\2\u00de>\3\2\2\2\u00df\u00e0\7"+
		"t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7e\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7=\2\2\u00eaB\3\2\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7f\2\2\u00f3"+
		"\u00f4\7k\2\2\u00f4\u00f5\7x\2\2\u00f5F\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7"+
		"H\3\2\2\2\u00f8\u00f9\7<\2\2\u00f9\u00fa\7?\2\2\u00faJ\3\2\2\2\u00fb\u00fc"+
		"\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7i\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102L\3\2\2\2\u0103"+
		"\u0104\7d\2\2\u0104\u0105\7g\2\2\u0105\u0106\7i\2\2\u0106\u0107\7k\2\2"+
		"\u0107\u0108\7p\2\2\u0108N\3\2\2\2\u0109\u010a\7v\2\2\u010a\u010b\7j\2"+
		"\2\u010b\u010c\7g\2\2\u010c\u010d\7p\2\2\u010dP\3\2\2\2\u010e\u010f\7"+
		"\61\2\2\u010fR\3\2\2\2\u0110\u0111\7@\2\2\u0111\u0112\7?\2\2\u0112T\3"+
		"\2\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116\7f\2\2\u0116"+
		"V\3\2\2\2\u0117\u0118\7P\2\2\u0118\u0119\7Q\2\2\u0119\u011a\7V\2\2\u011a"+
		"X\3\2\2\2\u011b\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7n\2\2\u011fZ\3\2\2\2\u0120\u0122\t\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\b.\2\2\u0126\\\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129"+
		"\7,\2\2\u0129\u012d\3\2\2\2\u012a\u012c\13\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7,\2\2\u0131\u0132\7\61\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\b/\3\2\u0134^\3\2\2\2\u0135\u0136\7\61\2\2"+
		"\u0136\u0137\7\61\2\2\u0137\u013b\3\2\2\2\u0138\u013a\n\3\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b\60\4\2\u013f`\3\2\2\2"+
		"\u0140\u0141\4\62;\2\u0141b\3\2\2\2\u0142\u0146\5e\63\2\u0143\u0145\5"+
		"g\64\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147d\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u0150\t\4\2\2"+
		"\u014a\u014b\n\5\2\2\u014b\u0150\6\63\2\2\u014c\u014d\t\6\2\2\u014d\u014e"+
		"\t\7\2\2\u014e\u0150\6\63\3\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2"+
		"\u014f\u014c\3\2\2\2\u0150f\3\2\2\2\u0151\u0158\t\b\2\2\u0152\u0153\n"+
		"\5\2\2\u0153\u0158\6\64\4\2\u0154\u0155\t\6\2\2\u0155\u0156\t\7\2\2\u0156"+
		"\u0158\6\64\5\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0154\3"+
		"\2\2\2\u0158h\3\2\2\2\u0159\u015a\4\2\0\2\u015aj\3\2\2\2\t\2\u0123\u012d"+
		"\u013b\u0146\u014f\u0157";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}