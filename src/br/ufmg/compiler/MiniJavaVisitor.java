package br.ufmg.compiler;
// Generated from /home/hendrix/Desktop/Plan B/MiniJava.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("deprecation")
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#bracketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(@NotNull MiniJavaParser.BracketExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpression(@NotNull MiniJavaParser.AllocationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(@NotNull MiniJavaParser.ArrayLengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull MiniJavaParser.ArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull MiniJavaParser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRest(@NotNull MiniJavaParser.ExpressionRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull MiniJavaParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(@NotNull MiniJavaParser.CompareExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#timesExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesExpression(@NotNull MiniJavaParser.TimesExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MiniJavaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull MiniJavaParser.PrimaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MiniJavaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull MiniJavaParser.TypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull MiniJavaParser.AndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#messageSend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSend(@NotNull MiniJavaParser.MessageSendContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrayLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookup(@NotNull MiniJavaParser.ArrayLookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#formalParameterRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterRest(@NotNull MiniJavaParser.FormalParameterRestContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#plusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(@NotNull MiniJavaParser.PlusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull MiniJavaParser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#minusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(@NotNull MiniJavaParser.MinusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(@NotNull MiniJavaParser.NotExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentStatement(@NotNull MiniJavaParser.ArrayAssignmentStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull MiniJavaParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocationExpression(@NotNull MiniJavaParser.ArrayAllocationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull MiniJavaParser.GoalContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(@NotNull MiniJavaParser.AssignmentStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull MiniJavaParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MiniJavaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull MiniJavaParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classExtendsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtendsDeclaration(@NotNull MiniJavaParser.ClassExtendsDeclarationContext ctx);
}