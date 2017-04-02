// Generated from /home/hendrix/Desktop/L2017_1.g4 by ANTLR 4.1
package br.ufmg.compiler;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link L2017_1Parser}.
 */
@SuppressWarnings("deprecation")
public interface L2017_1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#modo}.
	 * @param ctx the parse tree
	 */
	void enterModo(@NotNull L2017_1Parser.ModoContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#modo}.
	 * @param ctx the parse tree
	 */
	void exitModo(@NotNull L2017_1Parser.ModoContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#function_ref_par}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ref_par(@NotNull L2017_1Parser.Function_ref_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#function_ref_par}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ref_par(@NotNull L2017_1Parser.Function_ref_parContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(@NotNull L2017_1Parser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(@NotNull L2017_1Parser.Stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(@NotNull L2017_1Parser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(@NotNull L2017_1Parser.RelopContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull L2017_1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull L2017_1Parser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#ident_list}.
	 * @param ctx the parse tree
	 */
	void enterIdent_list(@NotNull L2017_1Parser.Ident_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#ident_list}.
	 * @param ctx the parse tree
	 */
	void exitIdent_list(@NotNull L2017_1Parser.Ident_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#scale_factor}.
	 * @param ctx the parse tree
	 */
	void enterScale_factor(@NotNull L2017_1Parser.Scale_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#scale_factor}.
	 * @param ctx the parse tree
	 */
	void exitScale_factor(@NotNull L2017_1Parser.Scale_factorContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull L2017_1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull L2017_1Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros(@NotNull L2017_1Parser.Lista_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros(@NotNull L2017_1Parser.Lista_parametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull L2017_1Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull L2017_1Parser.CondContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(@NotNull L2017_1Parser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(@NotNull L2017_1Parser.Read_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull L2017_1Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull L2017_1Parser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(@NotNull L2017_1Parser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(@NotNull L2017_1Parser.AddopContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#unsigned_integer}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_integer(@NotNull L2017_1Parser.Unsigned_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#unsigned_integer}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_integer(@NotNull L2017_1Parser.Unsigned_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#real_constant}.
	 * @param ctx the parse tree
	 */
	void enterReal_constant(@NotNull L2017_1Parser.Real_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#real_constant}.
	 * @param ctx the parse tree
	 */
	void exitReal_constant(@NotNull L2017_1Parser.Real_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#factor_a}.
	 * @param ctx the parse tree
	 */
	void enterFactor_a(@NotNull L2017_1Parser.Factor_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#factor_a}.
	 * @param ctx the parse tree
	 */
	void exitFactor_a(@NotNull L2017_1Parser.Factor_aContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#simple_variable_or_proc}.
	 * @param ctx the parse tree
	 */
	void enterSimple_variable_or_proc(@NotNull L2017_1Parser.Simple_variable_or_procContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#simple_variable_or_proc}.
	 * @param ctx the parse tree
	 */
	void exitSimple_variable_or_proc(@NotNull L2017_1Parser.Simple_variable_or_procContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(@NotNull L2017_1Parser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(@NotNull L2017_1Parser.Simple_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull L2017_1Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull L2017_1Parser.DeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#unsigned_real}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_real(@NotNull L2017_1Parser.Unsigned_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#unsigned_real}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_real(@NotNull L2017_1Parser.Unsigned_realContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull L2017_1Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull L2017_1Parser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(@NotNull L2017_1Parser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(@NotNull L2017_1Parser.Decl_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull L2017_1Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull L2017_1Parser.ParametroContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull L2017_1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull L2017_1Parser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#dcl_proc}.
	 * @param ctx the parse tree
	 */
	void enterDcl_proc(@NotNull L2017_1Parser.Dcl_procContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#dcl_proc}.
	 * @param ctx the parse tree
	 */
	void exitDcl_proc(@NotNull L2017_1Parser.Dcl_procContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#id_return}.
	 * @param ctx the parse tree
	 */
	void enterId_return(@NotNull L2017_1Parser.Id_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#id_return}.
	 * @param ctx the parse tree
	 */
	void exitId_return(@NotNull L2017_1Parser.Id_returnContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(@NotNull L2017_1Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(@NotNull L2017_1Parser.Compound_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull L2017_1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull L2017_1Parser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull L2017_1Parser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull L2017_1Parser.GoalContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_stmt(@NotNull L2017_1Parser.Repeat_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_stmt(@NotNull L2017_1Parser.Repeat_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#espec_parametros}.
	 * @param ctx the parse tree
	 */
	void enterEspec_parametros(@NotNull L2017_1Parser.Espec_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#espec_parametros}.
	 * @param ctx the parse tree
	 */
	void exitEspec_parametros(@NotNull L2017_1Parser.Espec_parametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull L2017_1Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull L2017_1Parser.SignContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#boolean_constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_constant(@NotNull L2017_1Parser.Boolean_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#boolean_constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_constant(@NotNull L2017_1Parser.Boolean_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(@NotNull L2017_1Parser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(@NotNull L2017_1Parser.Assign_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(@NotNull L2017_1Parser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(@NotNull L2017_1Parser.Write_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#tipo_retornado}.
	 * @param ctx the parse tree
	 */
	void enterTipo_retornado(@NotNull L2017_1Parser.Tipo_retornadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#tipo_retornado}.
	 * @param ctx the parse tree
	 */
	void exitTipo_retornado(@NotNull L2017_1Parser.Tipo_retornadoContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger_constant(@NotNull L2017_1Parser.Integer_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger_constant(@NotNull L2017_1Parser.Integer_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull L2017_1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull L2017_1Parser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull L2017_1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull L2017_1Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull L2017_1Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull L2017_1Parser.If_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#dcl_var}.
	 * @param ctx the parse tree
	 */
	void enterDcl_var(@NotNull L2017_1Parser.Dcl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#dcl_var}.
	 * @param ctx the parse tree
	 */
	void exitDcl_var(@NotNull L2017_1Parser.Dcl_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull L2017_1Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull L2017_1Parser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull L2017_1Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull L2017_1Parser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(@NotNull L2017_1Parser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(@NotNull L2017_1Parser.MulopContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#char_constant}.
	 * @param ctx the parse tree
	 */
	void enterChar_constant(@NotNull L2017_1Parser.Char_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#char_constant}.
	 * @param ctx the parse tree
	 */
	void exitChar_constant(@NotNull L2017_1Parser.Char_constantContext ctx);

	/**
	 * Enter a parse tree produced by {@link L2017_1Parser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(@NotNull L2017_1Parser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link L2017_1Parser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(@NotNull L2017_1Parser.Expr_listContext ctx);
}