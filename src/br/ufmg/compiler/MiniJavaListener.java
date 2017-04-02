package br.ufmg.compiler;
// Generated from /home/hendrix/Desktop/Plan B/MiniJava.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
@SuppressWarnings("deprecation")
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(@NotNull MiniJavaParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#bracketExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(@NotNull MiniJavaParser.BracketExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpression(@NotNull MiniJavaParser.AllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpression(@NotNull MiniJavaParser.AllocationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(@NotNull MiniJavaParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(@NotNull MiniJavaParser.ArrayLengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull MiniJavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull MiniJavaParser.ArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull MiniJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull MiniJavaParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionRest}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRest(@NotNull MiniJavaParser.ExpressionRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionRest}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRest(@NotNull MiniJavaParser.ExpressionRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull MiniJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull MiniJavaParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(@NotNull MiniJavaParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(@NotNull MiniJavaParser.CompareExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#timesExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpression(@NotNull MiniJavaParser.TimesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#timesExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpression(@NotNull MiniJavaParser.TimesExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniJavaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull MiniJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull MiniJavaParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull MiniJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull MiniJavaParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull MiniJavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull MiniJavaParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#messageSend}.
	 * @param ctx the parse tree
	 */
	void enterMessageSend(@NotNull MiniJavaParser.MessageSendContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#messageSend}.
	 * @param ctx the parse tree
	 */
	void exitMessageSend(@NotNull MiniJavaParser.MessageSendContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookup(@NotNull MiniJavaParser.ArrayLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookup(@NotNull MiniJavaParser.ArrayLookupContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameterRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterRest(@NotNull MiniJavaParser.FormalParameterRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameterRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterRest(@NotNull MiniJavaParser.FormalParameterRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#plusExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(@NotNull MiniJavaParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#plusExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(@NotNull MiniJavaParser.PlusExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull MiniJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull MiniJavaParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#minusExpression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull MiniJavaParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#minusExpression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull MiniJavaParser.MinusExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull MiniJavaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull MiniJavaParser.NotExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentStatement(@NotNull MiniJavaParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentStatement(@NotNull MiniJavaParser.ArrayAssignmentStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull MiniJavaParser.PrintStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpression(@NotNull MiniJavaParser.ArrayAllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpression(@NotNull MiniJavaParser.ArrayAllocationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull MiniJavaParser.GoalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull MiniJavaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull MiniJavaParser.AssignmentStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull MiniJavaParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull MiniJavaParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classExtendsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsDeclaration(@NotNull MiniJavaParser.ClassExtendsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classExtendsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsDeclaration(@NotNull MiniJavaParser.ClassExtendsDeclarationContext ctx);
}