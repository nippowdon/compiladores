// Generated from /home/hendrix/Desktop/L2017_1.g4 by ANTLR 4.1
package br.ufmg.compiler;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link L2017_1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("deprecation")
public interface L2017_1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#modo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModo(@NotNull L2017_1Parser.ModoContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#function_ref_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ref_par(@NotNull L2017_1Parser.Function_ref_parContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(@NotNull L2017_1Parser.Stmt_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(@NotNull L2017_1Parser.RelopContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull L2017_1Parser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#ident_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_list(@NotNull L2017_1Parser.Ident_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#scale_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_factor(@NotNull L2017_1Parser.Scale_factorContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull L2017_1Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#lista_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros(@NotNull L2017_1Parser.Lista_parametrosContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(@NotNull L2017_1Parser.CondContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(@NotNull L2017_1Parser.Read_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(@NotNull L2017_1Parser.CorpoContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(@NotNull L2017_1Parser.AddopContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#unsigned_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_integer(@NotNull L2017_1Parser.Unsigned_integerContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#real_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_constant(@NotNull L2017_1Parser.Real_constantContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#factor_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_a(@NotNull L2017_1Parser.Factor_aContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#simple_variable_or_proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_variable_or_proc(@NotNull L2017_1Parser.Simple_variable_or_procContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(@NotNull L2017_1Parser.Simple_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(@NotNull L2017_1Parser.DeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#unsigned_real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_real(@NotNull L2017_1Parser.Unsigned_realContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull L2017_1Parser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(@NotNull L2017_1Parser.Decl_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(@NotNull L2017_1Parser.ParametroContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull L2017_1Parser.StmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#dcl_proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_proc(@NotNull L2017_1Parser.Dcl_procContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#id_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_return(@NotNull L2017_1Parser.Id_returnContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(@NotNull L2017_1Parser.Compound_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull L2017_1Parser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull L2017_1Parser.GoalContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#repeat_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_stmt(@NotNull L2017_1Parser.Repeat_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#espec_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspec_parametros(@NotNull L2017_1Parser.Espec_parametrosContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull L2017_1Parser.SignContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#boolean_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_constant(@NotNull L2017_1Parser.Boolean_constantContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(@NotNull L2017_1Parser.Assign_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(@NotNull L2017_1Parser.Write_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#tipo_retornado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_retornado(@NotNull L2017_1Parser.Tipo_retornadoContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#integer_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_constant(@NotNull L2017_1Parser.Integer_constantContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull L2017_1Parser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull L2017_1Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(@NotNull L2017_1Parser.If_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#dcl_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_var(@NotNull L2017_1Parser.Dcl_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull L2017_1Parser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull L2017_1Parser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(@NotNull L2017_1Parser.MulopContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#char_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_constant(@NotNull L2017_1Parser.Char_constantContext ctx);

	/**
	 * Visit a parse tree produced by {@link L2017_1Parser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(@NotNull L2017_1Parser.Expr_listContext ctx);
}