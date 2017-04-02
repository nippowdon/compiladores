package br.ufmg.compiler;
// Generated from /home/hendrix/Desktop/Plan B/MiniJava.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "IntegerLiteral", "'true'", "'false'", "'boolean'", "'int'", 
		"'&&'", "'<'", "'>'", "'+'", "'-'", "'*'", "'!'", "'='", "';'", "','", 
		"'.'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'System.out.println'", 
		"'this'", "'class'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'extends'", "'return'", "'if'", "'else'", "'while'", "'length'", "'new'", 
		"Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_typeDeclaration = 2, RULE_classDeclaration = 3, 
		RULE_classExtendsDeclaration = 4, RULE_varDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_formalParameterList = 7, RULE_formalParameter = 8, RULE_formalParameterRest = 9, 
		RULE_type = 10, RULE_arrayType = 11, RULE_statement = 12, RULE_block = 13, 
		RULE_assignmentStatement = 14, RULE_arrayAssignmentStatement = 15, RULE_ifStatement = 16, 
		RULE_whileStatement = 17, RULE_printStatement = 18, RULE_expression = 19, 
		RULE_andExpression = 20, RULE_compareExpression = 21, RULE_plusExpression = 22, 
		RULE_minusExpression = 23, RULE_timesExpression = 24, RULE_arrayLookup = 25, 
		RULE_arrayLength = 26, RULE_messageSend = 27, RULE_expressionList = 28, 
		RULE_expressionRest = 29, RULE_primaryExpression = 30, RULE_arrayAllocationExpression = 31, 
		RULE_allocationExpression = 32, RULE_notExpression = 33, RULE_bracketExpression = 34;
	public static final String[] ruleNames = {
		"goal", "mainClass", "typeDeclaration", "classDeclaration", "classExtendsDeclaration", 
		"varDeclaration", "methodDeclaration", "formalParameterList", "formalParameter", 
		"formalParameterRest", "type", "arrayType", "statement", "block", "assignmentStatement", 
		"arrayAssignmentStatement", "ifStatement", "whileStatement", "printStatement", 
		"expression", "andExpression", "compareExpression", "plusExpression", 
		"minusExpression", "timesExpression", "arrayLookup", "arrayLength", "messageSend", 
		"expressionList", "expressionRest", "primaryExpression", "arrayAllocationExpression", 
		"allocationExpression", "notExpression", "bracketExpression"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); mainClass();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KeywordClass) {
				{
				{
				setState(71); typeDeclaration();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				
			}
			setState(77); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public TerminalNode CloseBracket(int i) {
			return getToken(MiniJavaParser.CloseBracket, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public TerminalNode KeywordPublic() { return getToken(MiniJavaParser.KeywordPublic, 0); }
		public List<TerminalNode> CloseBracket() { return getTokens(MiniJavaParser.CloseBracket); }
		public TerminalNode KeywordStatic() { return getToken(MiniJavaParser.KeywordStatic, 0); }
		public TerminalNode KeywordClass() { return getToken(MiniJavaParser.KeywordClass, 0); }
		public TerminalNode KeywordString() { return getToken(MiniJavaParser.KeywordString, 0); }
		public TerminalNode CloseSquareBrackets() { return getToken(MiniJavaParser.CloseSquareBrackets, 0); }
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TerminalNode OpenSquareBrackets() { return getToken(MiniJavaParser.OpenSquareBrackets, 0); }
		public TerminalNode OpenBracket(int i) {
			return getToken(MiniJavaParser.OpenBracket, i);
		}
		public TerminalNode KeywordVoid() { return getToken(MiniJavaParser.KeywordVoid, 0); }
		public List<TerminalNode> OpenBracket() { return getTokens(MiniJavaParser.OpenBracket); }
		public TerminalNode KeywordMain() { return getToken(MiniJavaParser.KeywordMain, 0); }
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(KeywordClass);
			setState(80); match(Identifier);
			setState(81); match(OpenBracket);
			setState(82); match(KeywordPublic);
			setState(83); match(KeywordStatic);
			setState(84); match(KeywordVoid);
			setState(85); match(KeywordMain);
			setState(86); match(OpenParenthesis);
			setState(87); match(KeywordString);
			setState(88); match(OpenSquareBrackets);
			setState(89); match(CloseSquareBrackets);
			setState(90); match(Identifier);
			setState(91); match(CloseParenthesis);
			setState(92); match(OpenBracket);
			setState(93); printStatement();
			setState(94); match(CloseBracket);
			setState(95); match(CloseBracket);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassExtendsDeclarationContext classExtendsDeclaration() {
			return getRuleContext(ClassExtendsDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDeclaration);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); classExtendsDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public TerminalNode CloseBracket() { return getToken(MiniJavaParser.CloseBracket, 0); }
		public TerminalNode OpenBracket() { return getToken(MiniJavaParser.OpenBracket, 0); }
		public TerminalNode KeywordClass() { return getToken(MiniJavaParser.KeywordClass, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(KeywordClass);
			setState(102); match(Identifier);
			setState(103); match(OpenBracket);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanType) | (1L << IntegerType) | (1L << Identifier))) != 0)) {
				{
				{
				setState(104); varDeclaration();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KeywordPublic) {
				{
				{
				setState(110); methodDeclaration();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(CloseBracket);
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

	public static class ClassExtendsDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode KeywordClass(int i) {
			return getToken(MiniJavaParser.KeywordClass, i);
		}
		public TerminalNode KeywordExtends() { return getToken(MiniJavaParser.KeywordExtends, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public TerminalNode CloseBracket() { return getToken(MiniJavaParser.CloseBracket, 0); }
		public TerminalNode OpenBracket() { return getToken(MiniJavaParser.OpenBracket, 0); }
		public List<TerminalNode> KeywordClass() { return getTokens(MiniJavaParser.KeywordClass); }
		public ClassExtendsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtendsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassExtendsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassExtendsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassExtendsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendsDeclarationContext classExtendsDeclaration() throws RecognitionException {
		ClassExtendsDeclarationContext _localctx = new ClassExtendsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classExtendsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(KeywordClass);
			setState(119); match(KeywordClass);
			setState(120); match(Identifier);
			setState(121); match(KeywordExtends);
			setState(122); match(Identifier);
			setState(123); match(OpenBracket);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanType) | (1L << IntegerType) | (1L << Identifier))) != 0)) {
				{
				{
				setState(124); varDeclaration();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KeywordPublic) {
				{
				{
				setState(130); methodDeclaration();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); match(CloseBracket);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(MiniJavaParser.EndLine, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); type();
			setState(139); match(Identifier);
			setState(140); match(EndLine);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode KeywordPublic() { return getToken(MiniJavaParser.KeywordPublic, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(MiniJavaParser.CloseBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(MiniJavaParser.OpenBracket, 0); }
		public TerminalNode KeywordReturn() { return getToken(MiniJavaParser.KeywordReturn, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EndLine() { return getToken(MiniJavaParser.EndLine, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(KeywordPublic);
			setState(143); type();
			setState(144); match(Identifier);
			setState(145); match(OpenParenthesis);
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanType) | (1L << IntegerType) | (1L << Identifier))) != 0)) {
				{
				setState(146); formalParameterList();
				}
			}

			setState(149); match(CloseParenthesis);
			setState(150); match(OpenBracket);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(151); varDeclaration();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << Sysout) | (1L << KeyWordIf) | (1L << KeywordWhile) | (1L << Identifier))) != 0)) {
				{
				{
				setState(157); statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); match(KeywordReturn);
			setState(164); expression();
			setState(165); match(EndLine);
			setState(166); match(CloseBracket);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterRestContext> formalParameterRest() {
			return getRuleContexts(FormalParameterRestContext.class);
		}
		public FormalParameterRestContext formalParameterRest(int i) {
			return getRuleContext(FormalParameterRestContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); formalParameter();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(169); formalParameterRest();
				}
				}
				setState(174);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); type();
			setState(176); match(Identifier);
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

	public static class FormalParameterRestContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MiniJavaParser.Comma, 0); }
		public FormalParameterRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameterRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameterRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterRestContext formalParameterRest() throws RecognitionException {
		FormalParameterRestContext _localctx = new FormalParameterRestContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameterRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(Comma);
			setState(179); formalParameter();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BooleanType() { return getToken(MiniJavaParser.BooleanType, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode IntegerType() { return getToken(MiniJavaParser.IntegerType, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); arrayType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanType) | (1L << IntegerType) | (1L << Identifier))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode CloseSquareBrackets() { return getToken(MiniJavaParser.CloseSquareBrackets, 0); }
		public TerminalNode OpenSquareBrackets() { return getToken(MiniJavaParser.OpenSquareBrackets, 0); }
		public TerminalNode IntegerType() { return getToken(MiniJavaParser.IntegerType, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(IntegerType);
			setState(186); match(OpenSquareBrackets);
			setState(187); match(CloseSquareBrackets);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ArrayAssignmentStatementContext arrayAssignmentStatement() {
			return getRuleContext(ArrayAssignmentStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); assignmentStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); arrayAssignmentStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); ifStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193); whileStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194); printStatement();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CloseBracket() { return getToken(MiniJavaParser.CloseBracket, 0); }
		public TerminalNode OpenBracket() { return getToken(MiniJavaParser.OpenBracket, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(OpenBracket);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << Sysout) | (1L << KeyWordIf) | (1L << KeywordWhile) | (1L << Identifier))) != 0)) {
				{
				{
				setState(198); statement();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204); match(CloseBracket);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(MiniJavaParser.Equals, 0); }
		public TerminalNode EndLine() { return getToken(MiniJavaParser.EndLine, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(Identifier);
			setState(207); match(Equals);
			setState(208); expression();
			setState(209); match(EndLine);
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

	public static class ArrayAssignmentStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseSquareBrackets() { return getToken(MiniJavaParser.CloseSquareBrackets, 0); }
		public TerminalNode OpenSquareBrackets() { return getToken(MiniJavaParser.OpenSquareBrackets, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Equals() { return getToken(MiniJavaParser.Equals, 0); }
		public TerminalNode EndLine() { return getToken(MiniJavaParser.EndLine, 0); }
		public ArrayAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentStatementContext arrayAssignmentStatement() throws RecognitionException {
		ArrayAssignmentStatementContext _localctx = new ArrayAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(Identifier);
			setState(212); match(OpenSquareBrackets);
			setState(213); expression();
			setState(214); match(CloseSquareBrackets);
			setState(215); match(Equals);
			setState(216); expression();
			setState(217); match(EndLine);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public TerminalNode KeywordElse() { return getToken(MiniJavaParser.KeywordElse, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KeyWordIf() { return getToken(MiniJavaParser.KeyWordIf, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(KeyWordIf);
			setState(220); match(OpenParenthesis);
			setState(221); expression();
			setState(222); match(CloseParenthesis);
			setState(223); statement();
			setState(224); match(KeywordElse);
			setState(225); statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KeywordWhile() { return getToken(MiniJavaParser.KeywordWhile, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(KeywordWhile);
			setState(228); match(OpenParenthesis);
			setState(229); expression();
			setState(230); match(CloseParenthesis);
			setState(231); statement();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Sysout() { return getToken(MiniJavaParser.Sysout, 0); }
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EndLine() { return getToken(MiniJavaParser.EndLine, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(Sysout);
			setState(234); match(OpenParenthesis);
			setState(235); expression();
			setState(236); match(CloseParenthesis);
			setState(237); match(EndLine);
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

	public static class ExpressionContext extends ParserRuleContext {
		public MessageSendContext messageSend() {
			return getRuleContext(MessageSendContext.class,0);
		}
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TimesExpressionContext timesExpression() {
			return getRuleContext(TimesExpressionContext.class,0);
		}
		public PlusExpressionContext plusExpression() {
			return getRuleContext(PlusExpressionContext.class,0);
		}
		public MinusExpressionContext minusExpression() {
			return getRuleContext(MinusExpressionContext.class,0);
		}
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); andExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); compareExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); plusExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); minusExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243); timesExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244); arrayLookup();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245); arrayLength();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246); messageSend();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(247); primaryExpression();
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

	public static class AndExpressionContext extends ParserRuleContext {
		public TerminalNode LogicalAnd() { return getToken(MiniJavaParser.LogicalAnd, 0); }
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_andExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); primaryExpression();
			setState(251); match(LogicalAnd);
			setState(252); primaryExpression();
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

	public static class CompareExpressionContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(MiniJavaParser.LessThan, 0); }
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); primaryExpression();
			setState(255); match(LessThan);
			setState(256); primaryExpression();
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

	public static class PlusExpressionContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(MiniJavaParser.Plus, 0); }
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PlusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusExpressionContext plusExpression() throws RecognitionException {
		PlusExpressionContext _localctx = new PlusExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_plusExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); primaryExpression();
			setState(259); match(Plus);
			setState(260); primaryExpression();
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

	public static class MinusExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public TerminalNode Minus() { return getToken(MiniJavaParser.Minus, 0); }
		public MinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusExpressionContext minusExpression() throws RecognitionException {
		MinusExpressionContext _localctx = new MinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_minusExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); primaryExpression();
			setState(263); match(Minus);
			setState(264); primaryExpression();
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

	public static class TimesExpressionContext extends ParserRuleContext {
		public TerminalNode Times() { return getToken(MiniJavaParser.Times, 0); }
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public TimesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTimesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTimesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTimesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesExpressionContext timesExpression() throws RecognitionException {
		TimesExpressionContext _localctx = new TimesExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_timesExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); primaryExpression();
			setState(267); match(Times);
			setState(268); primaryExpression();
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

	public static class ArrayLookupContext extends ParserRuleContext {
		public TerminalNode CloseSquareBrackets() { return getToken(MiniJavaParser.CloseSquareBrackets, 0); }
		public TerminalNode OpenSquareBrackets() { return getToken(MiniJavaParser.OpenSquareBrackets, 0); }
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLookupContext arrayLookup() throws RecognitionException {
		ArrayLookupContext _localctx = new ArrayLookupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); primaryExpression();
			setState(271); match(OpenSquareBrackets);
			setState(272); primaryExpression();
			setState(273); match(CloseSquareBrackets);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(MiniJavaParser.Dot, 0); }
		public TerminalNode KeywordLength() { return getToken(MiniJavaParser.KeywordLength, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); primaryExpression();
			setState(276); match(Dot);
			setState(277); match(KeywordLength);
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

	public static class MessageSendContext extends ParserRuleContext {
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public TerminalNode Dot() { return getToken(MiniJavaParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public MessageSendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMessageSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMessageSend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMessageSend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSendContext messageSend() throws RecognitionException {
		MessageSendContext _localctx = new MessageSendContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_messageSend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); primaryExpression();
			setState(280); match(Dot);
			setState(281); match(Identifier);
			setState(282); match(OpenParenthesis);
			setState(284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << TrueLiteral) | (1L << FalseLiteral) | (1L << ExclamationMark) | (1L << OpenParenthesis) | (1L << ThisExpression) | (1L << KeywordNew) | (1L << Identifier))) != 0)) {
				{
				setState(283); expressionList();
				}
			}

			setState(286); match(CloseParenthesis);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionRestContext expressionRest(int i) {
			return getRuleContext(ExpressionRestContext.class,i);
		}
		public List<ExpressionRestContext> expressionRest() {
			return getRuleContexts(ExpressionRestContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); expression();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(289); expressionRest();
				}
				}
				setState(294);
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

	public static class ExpressionRestContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MiniJavaParser.Comma, 0); }
		public ExpressionRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRestContext expressionRest() throws RecognitionException {
		ExpressionRestContext _localctx = new ExpressionRestContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(Comma);
			setState(296); expression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ArrayAllocationExpressionContext arrayAllocationExpression() {
			return getRuleContext(ArrayAllocationExpressionContext.class,0);
		}
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public TerminalNode TrueLiteral() { return getToken(MiniJavaParser.TrueLiteral, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MiniJavaParser.IntegerLiteral, 0); }
		public TerminalNode ThisExpression() { return getToken(MiniJavaParser.ThisExpression, 0); }
		public TerminalNode FalseLiteral() { return getToken(MiniJavaParser.FalseLiteral, 0); }
		public BracketExpressionContext bracketExpression() {
			return getRuleContext(BracketExpressionContext.class,0);
		}
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaryExpression);
		int _la;
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << TrueLiteral) | (1L << FalseLiteral) | (1L << ThisExpression) | (1L << Identifier))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); arrayAllocationExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300); allocationExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301); notExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302); bracketExpression();
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

	public static class ArrayAllocationExpressionContext extends ParserRuleContext {
		public TerminalNode CloseSquareBrackets() { return getToken(MiniJavaParser.CloseSquareBrackets, 0); }
		public TerminalNode OpenSquareBrackets() { return getToken(MiniJavaParser.OpenSquareBrackets, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IntegerType() { return getToken(MiniJavaParser.IntegerType, 0); }
		public TerminalNode KeywordNew() { return getToken(MiniJavaParser.KeywordNew, 0); }
		public ArrayAllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAllocationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayAllocationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayAllocationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAllocationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAllocationExpressionContext arrayAllocationExpression() throws RecognitionException {
		ArrayAllocationExpressionContext _localctx = new ArrayAllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayAllocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(KeywordNew);
			setState(306); match(IntegerType);
			setState(307); match(OpenSquareBrackets);
			setState(308); expression();
			setState(309); match(CloseSquareBrackets);
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode KeywordNew() { return getToken(MiniJavaParser.KeywordNew, 0); }
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAllocationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAllocationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAllocationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocationExpressionContext allocationExpression() throws RecognitionException {
		AllocationExpressionContext _localctx = new AllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_allocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(KeywordNew);
			setState(312); match(Identifier);
			setState(313); match(OpenParenthesis);
			setState(314); match(CloseParenthesis);
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

	public static class NotExpressionContext extends ParserRuleContext {
		public TerminalNode ExclamationMark() { return getToken(MiniJavaParser.ExclamationMark, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(ExclamationMark);
			setState(317); expression();
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

	public static class BracketExpressionContext extends ParserRuleContext {
		public TerminalNode OpenParenthesis() { return getToken(MiniJavaParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(MiniJavaParser.CloseParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketExpressionContext bracketExpression() throws RecognitionException {
		BracketExpressionContext _localctx = new BracketExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bracketExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(OpenParenthesis);
			setState(320); expression();
			setState(321); match(CloseParenthesis);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3+\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\5\4f\n\4\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\7\5r\n\5\f\5"+
		"\16\5u\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6"+
		"\u0083\13\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16"+
		"\b\u009e\13\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00c6\n\16\3\17\3\17\7\17\u00ca\n\17\f\17\16\17\u00cd\13\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u00fb\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u011f\n\35\3\35"+
		"\3\35\3\36\3\36\7\36\u0125\n\36\f\36\16\36\u0128\13\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \5 \u0132\n \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDF\2\4\4\2\6\7((\5\2\3\5\32\32((\u0141\2H\3\2\2\2\4"+
		"Q\3\2\2\2\6e\3\2\2\2\bg\3\2\2\2\nx\3\2\2\2\f\u008c\3\2\2\2\16\u0090\3"+
		"\2\2\2\20\u00aa\3\2\2\2\22\u00b1\3\2\2\2\24\u00b4\3\2\2\2\26\u00b9\3\2"+
		"\2\2\30\u00bb\3\2\2\2\32\u00c5\3\2\2\2\34\u00c7\3\2\2\2\36\u00d0\3\2\2"+
		"\2 \u00d5\3\2\2\2\"\u00dd\3\2\2\2$\u00e5\3\2\2\2&\u00eb\3\2\2\2(\u00fa"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u0100\3\2\2\2.\u0104\3\2\2\2\60\u0108\3\2\2\2"+
		"\62\u010c\3\2\2\2\64\u0110\3\2\2\2\66\u0115\3\2\2\28\u0119\3\2\2\2:\u0122"+
		"\3\2\2\2<\u0129\3\2\2\2>\u0131\3\2\2\2@\u0133\3\2\2\2B\u0139\3\2\2\2D"+
		"\u013e\3\2\2\2F\u0141\3\2\2\2HL\5\4\3\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2\2\3P\3\3\2\2\2QR\7\33\2"+
		"\2RS\7(\2\2ST\7\23\2\2TU\7\34\2\2UV\7\35\2\2VW\7\36\2\2WX\7\37\2\2XY\7"+
		"\25\2\2YZ\7 \2\2Z[\7\27\2\2[\\\7\30\2\2\\]\7(\2\2]^\7\26\2\2^_\7\23\2"+
		"\2_`\5&\24\2`a\7\24\2\2ab\7\24\2\2b\5\3\2\2\2cf\5\b\5\2df\5\n\6\2ec\3"+
		"\2\2\2ed\3\2\2\2f\7\3\2\2\2gh\7\33\2\2hi\7(\2\2im\7\23\2\2jl\5\f\7\2k"+
		"j\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2pr\5\16\b\2"+
		"qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\24\2"+
		"\2w\t\3\2\2\2xy\7\33\2\2yz\7\33\2\2z{\7(\2\2{|\7!\2\2|}\7(\2\2}\u0081"+
		"\7\23\2\2~\u0080\5\f\7\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0086\5\16\b\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\24\2\2\u008b\13\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7(\2"+
		"\2\u008e\u008f\7\20\2\2\u008f\r\3\2\2\2\u0090\u0091\7\34\2\2\u0091\u0092"+
		"\5\26\f\2\u0092\u0093\7(\2\2\u0093\u0095\7\25\2\2\u0094\u0096\5\20\t\2"+
		"\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\7\26\2\2\u0098\u009c\7\23\2\2\u0099\u009b\5\f\7\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a2"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\5(\25\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00a9\7\24\2\2\u00a9\17\3\2\2\2\u00aa\u00ae\5\22"+
		"\n\2\u00ab\u00ad\5\24\13\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7(\2\2\u00b3\23\3\2\2\2\u00b4\u00b5"+
		"\7\21\2\2\u00b5\u00b6\5\22\n\2\u00b6\25\3\2\2\2\u00b7\u00ba\5\30\r\2\u00b8"+
		"\u00ba\t\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\27\3\2\2"+
		"\2\u00bb\u00bc\7\7\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\7\30\2\2\u00be"+
		"\31\3\2\2\2\u00bf\u00c6\5\34\17\2\u00c0\u00c6\5\36\20\2\u00c1\u00c6\5"+
		" \21\2\u00c2\u00c6\5\"\22\2\u00c3\u00c6\5$\23\2\u00c4\u00c6\5&\24\2\u00c5"+
		"\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00cb"+
		"\7\23\2\2\u00c8\u00ca\5\32\16\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\7\24\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7(\2\2\u00d1"+
		"\u00d2\7\17\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\7\20\2\2\u00d4\37\3\2"+
		"\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8\5(\25\2\u00d8"+
		"\u00d9\7\30\2\2\u00d9\u00da\7\17\2\2\u00da\u00db\5(\25\2\u00db\u00dc\7"+
		"\20\2\2\u00dc!\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df\7\25\2\2\u00df\u00e0"+
		"\5(\25\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\7$\2\2"+
		"\u00e3\u00e4\5\32\16\2\u00e4#\3\2\2\2\u00e5\u00e6\7%\2\2\u00e6\u00e7\7"+
		"\25\2\2\u00e7\u00e8\5(\25\2\u00e8\u00e9\7\26\2\2\u00e9\u00ea\5\32\16\2"+
		"\u00ea%\3\2\2\2\u00eb\u00ec\7\31\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee"+
		"\5(\25\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\7\20\2\2\u00f0\'\3\2\2\2\u00f1"+
		"\u00fb\5*\26\2\u00f2\u00fb\5,\27\2\u00f3\u00fb\5.\30\2\u00f4\u00fb\5\60"+
		"\31\2\u00f5\u00fb\5\62\32\2\u00f6\u00fb\5\64\33\2\u00f7\u00fb\5\66\34"+
		"\2\u00f8\u00fb\58\35\2\u00f9\u00fb\5> \2\u00fa\u00f1\3\2\2\2\u00fa\u00f2"+
		"\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb)\3\2\2\2\u00fc\u00fd\5> \2\u00fd\u00fe\7\b\2\2\u00fe\u00ff"+
		"\5> \2\u00ff+\3\2\2\2\u0100\u0101\5> \2\u0101\u0102\7\t\2\2\u0102\u0103"+
		"\5> \2\u0103-\3\2\2\2\u0104\u0105\5> \2\u0105\u0106\7\13\2\2\u0106\u0107"+
		"\5> \2\u0107/\3\2\2\2\u0108\u0109\5> \2\u0109\u010a\7\f\2\2\u010a\u010b"+
		"\5> \2\u010b\61\3\2\2\2\u010c\u010d\5> \2\u010d\u010e\7\r\2\2\u010e\u010f"+
		"\5> \2\u010f\63\3\2\2\2\u0110\u0111\5> \2\u0111\u0112\7\27\2\2\u0112\u0113"+
		"\5> \2\u0113\u0114\7\30\2\2\u0114\65\3\2\2\2\u0115\u0116\5> \2\u0116\u0117"+
		"\7\22\2\2\u0117\u0118\7&\2\2\u0118\67\3\2\2\2\u0119\u011a\5> \2\u011a"+
		"\u011b\7\22\2\2\u011b\u011c\7(\2\2\u011c\u011e\7\25\2\2\u011d\u011f\5"+
		":\36\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\26\2\2\u01219\3\2\2\2\u0122\u0126\5(\25\2\u0123\u0125\5<\37\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127;\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\21\2\2\u012a"+
		"\u012b\5(\25\2\u012b=\3\2\2\2\u012c\u0132\t\3\2\2\u012d\u0132\5@!\2\u012e"+
		"\u0132\5B\"\2\u012f\u0132\5D#\2\u0130\u0132\5F$\2\u0131\u012c\3\2\2\2"+
		"\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132?\3\2\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7\7\2\2\u0135"+
		"\u0136\7\27\2\2\u0136\u0137\5(\25\2\u0137\u0138\7\30\2\2\u0138A\3\2\2"+
		"\2\u0139\u013a\7\'\2\2\u013a\u013b\7(\2\2\u013b\u013c\7\25\2\2\u013c\u013d"+
		"\7\26\2\2\u013dC\3\2\2\2\u013e\u013f\7\16\2\2\u013f\u0140\5(\25\2\u0140"+
		"E\3\2\2\2\u0141\u0142\7\25\2\2\u0142\u0143\5(\25\2\u0143\u0144\7\26\2"+
		"\2\u0144G\3\2\2\2\23Lems\u0081\u0087\u0095\u009c\u00a2\u00ae\u00b9\u00c5"+
		"\u00cb\u00fa\u011e\u0126\u0131";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}