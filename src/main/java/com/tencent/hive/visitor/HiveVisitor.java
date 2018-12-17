package com.tencent.hive.visitor;

import com.tencent.hive.out.HplsqlBaseVisitor;
import com.tencent.hive.out.HplsqlParser;
import com.tencent.hive.out.HplsqlVisitor;
import com.tencent.spark.out.SqlBaseBaseVisitor;
import com.tencent.spark.out.SqlBaseParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class HiveVisitor extends HplsqlBaseVisitor<String> {

    @Override
    public String visitProgram(HplsqlParser.ProgramContext ctx) {
        String aa = ctx.getText();
        System.out.println(aa);
        return super.visitProgram(ctx);
    }


    @Override
    public String visitStmt(HplsqlParser.StmtContext ctx) {
        String aa = ctx.getText();
        System.out.println(aa);
        return super.visitStmt(ctx);
    }


    @Override
    public String visitBlock(HplsqlParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public String visitBegin_end_block(HplsqlParser.Begin_end_blockContext ctx) {
        return super.visitBegin_end_block(ctx);
    }

    @Override
    public String visitSingle_block_stmt(HplsqlParser.Single_block_stmtContext ctx) {
        return super.visitSingle_block_stmt(ctx);
    }

    @Override
    public String visitBlock_end(HplsqlParser.Block_endContext ctx) {
        return super.visitBlock_end(ctx);
    }

    @Override
    public String visitProc_block(HplsqlParser.Proc_blockContext ctx) {
        return super.visitProc_block(ctx);
    }

    @Override
    public String visitSemicolon_stmt(HplsqlParser.Semicolon_stmtContext ctx) {
        return super.visitSemicolon_stmt(ctx);
    }

    @Override
    public String visitException_block(HplsqlParser.Exception_blockContext ctx) {
        return super.visitException_block(ctx);
    }

    @Override
    public String visitException_block_item(HplsqlParser.Exception_block_itemContext ctx) {
        return super.visitException_block_item(ctx);
    }

    @Override
    public String visitNull_stmt(HplsqlParser.Null_stmtContext ctx) {
        return super.visitNull_stmt(ctx);
    }

    @Override
    public String visitExpr_stmt(HplsqlParser.Expr_stmtContext ctx) {
        return super.visitExpr_stmt(ctx);
    }

    @Override
    public String visitAssignment_stmt(HplsqlParser.Assignment_stmtContext ctx) {
        return super.visitAssignment_stmt(ctx);
    }

    @Override
    public String visitAssignment_stmt_item(HplsqlParser.Assignment_stmt_itemContext ctx) {
        return super.visitAssignment_stmt_item(ctx);
    }

    @Override
    public String visitAssignment_stmt_single_item(HplsqlParser.Assignment_stmt_single_itemContext ctx) {
        return super.visitAssignment_stmt_single_item(ctx);
    }

    @Override
    public String visitAssignment_stmt_multiple_item(HplsqlParser.Assignment_stmt_multiple_itemContext ctx) {
        return super.visitAssignment_stmt_multiple_item(ctx);
    }

    @Override
    public String visitAssignment_stmt_select_item(HplsqlParser.Assignment_stmt_select_itemContext ctx) {
        return super.visitAssignment_stmt_select_item(ctx);
    }

    @Override
    public String visitAllocate_cursor_stmt(HplsqlParser.Allocate_cursor_stmtContext ctx) {
        return super.visitAllocate_cursor_stmt(ctx);
    }

    @Override
    public String visitAssociate_locator_stmt(HplsqlParser.Associate_locator_stmtContext ctx) {
        return super.visitAssociate_locator_stmt(ctx);
    }

    @Override
    public String visitBegin_transaction_stmt(HplsqlParser.Begin_transaction_stmtContext ctx) {
        return super.visitBegin_transaction_stmt(ctx);
    }

    @Override
    public String visitBreak_stmt(HplsqlParser.Break_stmtContext ctx) {
        return super.visitBreak_stmt(ctx);
    }

    @Override
    public String visitCall_stmt(HplsqlParser.Call_stmtContext ctx) {
        return super.visitCall_stmt(ctx);
    }

    @Override
    public String visitDeclare_stmt(HplsqlParser.Declare_stmtContext ctx) {
        return super.visitDeclare_stmt(ctx);
    }

    @Override
    public String visitDeclare_block(HplsqlParser.Declare_blockContext ctx) {
        return super.visitDeclare_block(ctx);
    }

    @Override
    public String visitDeclare_block_inplace(HplsqlParser.Declare_block_inplaceContext ctx) {
        return super.visitDeclare_block_inplace(ctx);
    }

    @Override
    public String visitDeclare_stmt_item(HplsqlParser.Declare_stmt_itemContext ctx) {
        return super.visitDeclare_stmt_item(ctx);
    }

    @Override
    public String visitDeclare_var_item(HplsqlParser.Declare_var_itemContext ctx) {
        return super.visitDeclare_var_item(ctx);
    }

    @Override
    public String visitDeclare_condition_item(HplsqlParser.Declare_condition_itemContext ctx) {
        return super.visitDeclare_condition_item(ctx);
    }

    @Override
    public String visitDeclare_cursor_item(HplsqlParser.Declare_cursor_itemContext ctx) {
        return super.visitDeclare_cursor_item(ctx);
    }

    @Override
    public String visitCursor_with_return(HplsqlParser.Cursor_with_returnContext ctx) {
        return super.visitCursor_with_return(ctx);
    }

    @Override
    public String visitCursor_without_return(HplsqlParser.Cursor_without_returnContext ctx) {
        return super.visitCursor_without_return(ctx);
    }

    @Override
    public String visitDeclare_handler_item(HplsqlParser.Declare_handler_itemContext ctx) {
        return super.visitDeclare_handler_item(ctx);
    }

    @Override
    public String visitDeclare_temporary_table_item(HplsqlParser.Declare_temporary_table_itemContext ctx) {
        return super.visitDeclare_temporary_table_item(ctx);
    }

    @Override
    public String visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        return super.visitCreate_table_stmt(ctx);
    }

    @Override
    public String visitCreate_local_temp_table_stmt(HplsqlParser.Create_local_temp_table_stmtContext ctx) {
        return super.visitCreate_local_temp_table_stmt(ctx);
    }

    @Override
    public String visitCreate_table_definition(HplsqlParser.Create_table_definitionContext ctx) {
        return super.visitCreate_table_definition(ctx);
    }

    @Override
    public String visitCreate_table_columns(HplsqlParser.Create_table_columnsContext ctx) {
        return super.visitCreate_table_columns(ctx);
    }

    @Override
    public String visitCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx) {
        return super.visitCreate_table_columns_item(ctx);
    }

    @Override
    public String visitColumn_name(HplsqlParser.Column_nameContext ctx) {
        return super.visitColumn_name(ctx);
    }

    @Override
    public String visitCreate_table_column_inline_cons(HplsqlParser.Create_table_column_inline_consContext ctx) {
        return super.visitCreate_table_column_inline_cons(ctx);
    }

    @Override
    public String visitCreate_table_column_cons(HplsqlParser.Create_table_column_consContext ctx) {
        return super.visitCreate_table_column_cons(ctx);
    }

    @Override
    public String visitCreate_table_fk_action(HplsqlParser.Create_table_fk_actionContext ctx) {
        return super.visitCreate_table_fk_action(ctx);
    }

    @Override
    public String visitCreate_table_preoptions(HplsqlParser.Create_table_preoptionsContext ctx) {
        return super.visitCreate_table_preoptions(ctx);
    }

    @Override
    public String visitCreate_table_preoptions_item(HplsqlParser.Create_table_preoptions_itemContext ctx) {
        return super.visitCreate_table_preoptions_item(ctx);
    }

    @Override
    public String visitCreate_table_options(HplsqlParser.Create_table_optionsContext ctx) {
        return super.visitCreate_table_options(ctx);
    }

    @Override
    public String visitCreate_table_options_item(HplsqlParser.Create_table_options_itemContext ctx) {
        return super.visitCreate_table_options_item(ctx);
    }

    @Override
    public String visitCreate_table_options_ora_item(HplsqlParser.Create_table_options_ora_itemContext ctx) {
        return super.visitCreate_table_options_ora_item(ctx);
    }

    @Override
    public String visitCreate_table_options_db2_item(HplsqlParser.Create_table_options_db2_itemContext ctx) {
        return super.visitCreate_table_options_db2_item(ctx);
    }

    @Override
    public String visitCreate_table_options_td_item(HplsqlParser.Create_table_options_td_itemContext ctx) {
        return super.visitCreate_table_options_td_item(ctx);
    }

    @Override
    public String visitCreate_table_options_hive_item(HplsqlParser.Create_table_options_hive_itemContext ctx) {
        return super.visitCreate_table_options_hive_item(ctx);
    }

    @Override
    public String visitCreate_table_hive_row_format(HplsqlParser.Create_table_hive_row_formatContext ctx) {
        return super.visitCreate_table_hive_row_format(ctx);
    }

    @Override
    public String visitCreate_table_hive_row_format_fields(HplsqlParser.Create_table_hive_row_format_fieldsContext ctx) {
        return super.visitCreate_table_hive_row_format_fields(ctx);
    }

    @Override
    public String visitCreate_table_options_mssql_item(HplsqlParser.Create_table_options_mssql_itemContext ctx) {
        return super.visitCreate_table_options_mssql_item(ctx);
    }

    @Override
    public String visitCreate_table_options_mysql_item(HplsqlParser.Create_table_options_mysql_itemContext ctx) {
        return super.visitCreate_table_options_mysql_item(ctx);
    }

    @Override
    public String visitAlter_table_stmt(HplsqlParser.Alter_table_stmtContext ctx) {
        return super.visitAlter_table_stmt(ctx);
    }

    @Override
    public String visitAlter_table_item(HplsqlParser.Alter_table_itemContext ctx) {
        return super.visitAlter_table_item(ctx);
    }

    @Override
    public String visitAlter_table_add_constraint(HplsqlParser.Alter_table_add_constraintContext ctx) {
        return super.visitAlter_table_add_constraint(ctx);
    }

    @Override
    public String visitAlter_table_add_constraint_item(HplsqlParser.Alter_table_add_constraint_itemContext ctx) {
        return super.visitAlter_table_add_constraint_item(ctx);
    }

    @Override
    public String visitDtype(HplsqlParser.DtypeContext ctx) {
        return super.visitDtype(ctx);
    }

    @Override
    public String visitDtype_len(HplsqlParser.Dtype_lenContext ctx) {
        return super.visitDtype_len(ctx);
    }

    @Override
    public String visitDtype_attr(HplsqlParser.Dtype_attrContext ctx) {
        return super.visitDtype_attr(ctx);
    }

    @Override
    public String visitDtype_default(HplsqlParser.Dtype_defaultContext ctx) {
        return super.visitDtype_default(ctx);
    }

    @Override
    public String visitCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx) {
        return super.visitCreate_database_stmt(ctx);
    }

    @Override
    public String visitCreate_database_option(HplsqlParser.Create_database_optionContext ctx) {
        return super.visitCreate_database_option(ctx);
    }

    @Override
    public String visitCreate_function_stmt(HplsqlParser.Create_function_stmtContext ctx) {
        return super.visitCreate_function_stmt(ctx);
    }

    @Override
    public String visitCreate_function_return(HplsqlParser.Create_function_returnContext ctx) {
        return super.visitCreate_function_return(ctx);
    }

    @Override
    public String visitCreate_package_stmt(HplsqlParser.Create_package_stmtContext ctx) {
        return super.visitCreate_package_stmt(ctx);
    }

    @Override
    public String visitPackage_spec(HplsqlParser.Package_specContext ctx) {
        return super.visitPackage_spec(ctx);
    }

    @Override
    public String visitPackage_spec_item(HplsqlParser.Package_spec_itemContext ctx) {
        return super.visitPackage_spec_item(ctx);
    }

    @Override
    public String visitCreate_package_body_stmt(HplsqlParser.Create_package_body_stmtContext ctx) {
        return super.visitCreate_package_body_stmt(ctx);
    }

    @Override
    public String visitPackage_body(HplsqlParser.Package_bodyContext ctx) {
        return super.visitPackage_body(ctx);
    }

    @Override
    public String visitPackage_body_item(HplsqlParser.Package_body_itemContext ctx) {
        return super.visitPackage_body_item(ctx);
    }

    @Override
    public String visitCreate_procedure_stmt(HplsqlParser.Create_procedure_stmtContext ctx) {
        return super.visitCreate_procedure_stmt(ctx);
    }

    @Override
    public String visitCreate_routine_params(HplsqlParser.Create_routine_paramsContext ctx) {
        return super.visitCreate_routine_params(ctx);
    }

    @Override
    public String visitCreate_routine_param_item(HplsqlParser.Create_routine_param_itemContext ctx) {
        return super.visitCreate_routine_param_item(ctx);
    }

    @Override
    public String visitCreate_routine_options(HplsqlParser.Create_routine_optionsContext ctx) {
        return super.visitCreate_routine_options(ctx);
    }

    @Override
    public String visitCreate_routine_option(HplsqlParser.Create_routine_optionContext ctx) {
        return super.visitCreate_routine_option(ctx);
    }

    @Override
    public String visitDrop_stmt(HplsqlParser.Drop_stmtContext ctx) {
        return super.visitDrop_stmt(ctx);
    }

    @Override
    public String visitEnd_transaction_stmt(HplsqlParser.End_transaction_stmtContext ctx) {
        return super.visitEnd_transaction_stmt(ctx);
    }

    @Override
    public String visitExec_stmt(HplsqlParser.Exec_stmtContext ctx) {
        return super.visitExec_stmt(ctx);
    }

    @Override
    public String visitIf_stmt(HplsqlParser.If_stmtContext ctx) {
        return super.visitIf_stmt(ctx);
    }

    @Override
    public String visitIf_plsql_stmt(HplsqlParser.If_plsql_stmtContext ctx) {
        return super.visitIf_plsql_stmt(ctx);
    }

    @Override
    public String visitIf_tsql_stmt(HplsqlParser.If_tsql_stmtContext ctx) {
        return super.visitIf_tsql_stmt(ctx);
    }

    @Override
    public String visitIf_bteq_stmt(HplsqlParser.If_bteq_stmtContext ctx) {
        return super.visitIf_bteq_stmt(ctx);
    }

    @Override
    public String visitElseif_block(HplsqlParser.Elseif_blockContext ctx) {
        return super.visitElseif_block(ctx);
    }

    @Override
    public String visitElse_block(HplsqlParser.Else_blockContext ctx) {
        return super.visitElse_block(ctx);
    }

    @Override
    public String visitInclude_stmt(HplsqlParser.Include_stmtContext ctx) {
        return super.visitInclude_stmt(ctx);
    }

    @Override
    public String visitInsert_stmt(HplsqlParser.Insert_stmtContext ctx) {

        String aa = ctx.getText();
        System.out.println("visitInsert_stmt："+aa);

        return super.visitInsert_stmt(ctx);
    }

    @Override
    public String visitInsert_stmt_cols(HplsqlParser.Insert_stmt_colsContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitInsert_stmt_cols："+aa);

        return super.visitInsert_stmt_cols(ctx);
    }

    @Override
    public String visitInsert_stmt_rows(HplsqlParser.Insert_stmt_rowsContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitInsert_stmt_rows："+aa);

        return super.visitInsert_stmt_rows(ctx);
    }

    @Override
    public String visitInsert_stmt_row(HplsqlParser.Insert_stmt_rowContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitInsert_stmt_row："+aa);

        return super.visitInsert_stmt_row(ctx);
    }

    @Override
    public String visitInsert_directory_stmt(HplsqlParser.Insert_directory_stmtContext ctx) {
        return super.visitInsert_directory_stmt(ctx);
    }

    @Override
    public String visitExit_stmt(HplsqlParser.Exit_stmtContext ctx) {
        return super.visitExit_stmt(ctx);
    }

    @Override
    public String visitGet_diag_stmt(HplsqlParser.Get_diag_stmtContext ctx) {
        return super.visitGet_diag_stmt(ctx);
    }

    @Override
    public String visitGet_diag_stmt_item(HplsqlParser.Get_diag_stmt_itemContext ctx) {
        return super.visitGet_diag_stmt_item(ctx);
    }

    @Override
    public String visitGet_diag_stmt_exception_item(HplsqlParser.Get_diag_stmt_exception_itemContext ctx) {
        return super.visitGet_diag_stmt_exception_item(ctx);
    }

    @Override
    public String visitGet_diag_stmt_rowcount_item(HplsqlParser.Get_diag_stmt_rowcount_itemContext ctx) {
        return super.visitGet_diag_stmt_rowcount_item(ctx);
    }

    @Override
    public String visitGrant_stmt(HplsqlParser.Grant_stmtContext ctx) {
        return super.visitGrant_stmt(ctx);
    }

    @Override
    public String visitGrant_stmt_item(HplsqlParser.Grant_stmt_itemContext ctx) {
        return super.visitGrant_stmt_item(ctx);
    }

    @Override
    public String visitLeave_stmt(HplsqlParser.Leave_stmtContext ctx) {
        return super.visitLeave_stmt(ctx);
    }

    @Override
    public String visitMap_object_stmt(HplsqlParser.Map_object_stmtContext ctx) {
        return super.visitMap_object_stmt(ctx);
    }

    @Override
    public String visitOpen_stmt(HplsqlParser.Open_stmtContext ctx) {
        return super.visitOpen_stmt(ctx);
    }

    @Override
    public String visitFetch_stmt(HplsqlParser.Fetch_stmtContext ctx) {
        return super.visitFetch_stmt(ctx);
    }

    @Override
    public String visitCollect_stats_stmt(HplsqlParser.Collect_stats_stmtContext ctx) {
        return super.visitCollect_stats_stmt(ctx);
    }

    @Override
    public String visitCollect_stats_clause(HplsqlParser.Collect_stats_clauseContext ctx) {
        return super.visitCollect_stats_clause(ctx);
    }

    @Override
    public String visitClose_stmt(HplsqlParser.Close_stmtContext ctx) {
        return super.visitClose_stmt(ctx);
    }

    @Override
    public String visitCmp_stmt(HplsqlParser.Cmp_stmtContext ctx) {
        return super.visitCmp_stmt(ctx);
    }

    @Override
    public String visitCmp_source(HplsqlParser.Cmp_sourceContext ctx) {
        return super.visitCmp_source(ctx);
    }

    @Override
    public String visitCopy_from_ftp_stmt(HplsqlParser.Copy_from_ftp_stmtContext ctx) {
        return super.visitCopy_from_ftp_stmt(ctx);
    }

    @Override
    public String visitCopy_from_local_stmt(HplsqlParser.Copy_from_local_stmtContext ctx) {
        return super.visitCopy_from_local_stmt(ctx);
    }

    @Override
    public String visitCopy_stmt(HplsqlParser.Copy_stmtContext ctx) {
        return super.visitCopy_stmt(ctx);
    }

    @Override
    public String visitCopy_source(HplsqlParser.Copy_sourceContext ctx) {
        return super.visitCopy_source(ctx);
    }

    @Override
    public String visitCopy_target(HplsqlParser.Copy_targetContext ctx) {
        return super.visitCopy_target(ctx);
    }

    @Override
    public String visitCopy_option(HplsqlParser.Copy_optionContext ctx) {
        return super.visitCopy_option(ctx);
    }

    @Override
    public String visitCopy_file_option(HplsqlParser.Copy_file_optionContext ctx) {
        return super.visitCopy_file_option(ctx);
    }

    @Override
    public String visitCopy_ftp_option(HplsqlParser.Copy_ftp_optionContext ctx) {
        return super.visitCopy_ftp_option(ctx);
    }

    @Override
    public String visitCommit_stmt(HplsqlParser.Commit_stmtContext ctx) {
        return super.visitCommit_stmt(ctx);
    }

    @Override
    public String visitCreate_index_stmt(HplsqlParser.Create_index_stmtContext ctx) {
        return super.visitCreate_index_stmt(ctx);
    }

    @Override
    public String visitCreate_index_col(HplsqlParser.Create_index_colContext ctx) {
        return super.visitCreate_index_col(ctx);
    }

    @Override
    public String visitIndex_storage_clause(HplsqlParser.Index_storage_clauseContext ctx) {
        return super.visitIndex_storage_clause(ctx);
    }

    @Override
    public String visitIndex_mssql_storage_clause(HplsqlParser.Index_mssql_storage_clauseContext ctx) {
        return super.visitIndex_mssql_storage_clause(ctx);
    }

    @Override
    public String visitPrint_stmt(HplsqlParser.Print_stmtContext ctx) {
        return super.visitPrint_stmt(ctx);
    }

    @Override
    public String visitQuit_stmt(HplsqlParser.Quit_stmtContext ctx) {
        return super.visitQuit_stmt(ctx);
    }

    @Override
    public String visitRaise_stmt(HplsqlParser.Raise_stmtContext ctx) {
        return super.visitRaise_stmt(ctx);
    }

    @Override
    public String visitResignal_stmt(HplsqlParser.Resignal_stmtContext ctx) {
        return super.visitResignal_stmt(ctx);
    }

    @Override
    public String visitReturn_stmt(HplsqlParser.Return_stmtContext ctx) {
        return super.visitReturn_stmt(ctx);
    }

    @Override
    public String visitRollback_stmt(HplsqlParser.Rollback_stmtContext ctx) {
        return super.visitRollback_stmt(ctx);
    }

    @Override
    public String visitSet_session_option(HplsqlParser.Set_session_optionContext ctx) {
        return super.visitSet_session_option(ctx);
    }

    @Override
    public String visitSet_current_schema_option(HplsqlParser.Set_current_schema_optionContext ctx) {
        return super.visitSet_current_schema_option(ctx);
    }

    @Override
    public String visitSet_mssql_session_option(HplsqlParser.Set_mssql_session_optionContext ctx) {
        return super.visitSet_mssql_session_option(ctx);
    }

    @Override
    public String visitSet_teradata_session_option(HplsqlParser.Set_teradata_session_optionContext ctx) {
        return super.visitSet_teradata_session_option(ctx);
    }

    @Override
    public String visitSignal_stmt(HplsqlParser.Signal_stmtContext ctx) {
        return super.visitSignal_stmt(ctx);
    }

    @Override
    public String visitTruncate_stmt(HplsqlParser.Truncate_stmtContext ctx) {
        return super.visitTruncate_stmt(ctx);
    }

    @Override
    public String visitUse_stmt(HplsqlParser.Use_stmtContext ctx) {
        return super.visitUse_stmt(ctx);
    }

    @Override
    public String visitValues_into_stmt(HplsqlParser.Values_into_stmtContext ctx) {
        return super.visitValues_into_stmt(ctx);
    }

    @Override
    public String visitWhile_stmt(HplsqlParser.While_stmtContext ctx) {
        return super.visitWhile_stmt(ctx);
    }

    @Override
    public String visitFor_cursor_stmt(HplsqlParser.For_cursor_stmtContext ctx) {
        return super.visitFor_cursor_stmt(ctx);
    }

    @Override
    public String visitFor_range_stmt(HplsqlParser.For_range_stmtContext ctx) {
        return super.visitFor_range_stmt(ctx);
    }

    @Override
    public String visitLabel(HplsqlParser.LabelContext ctx) {
        return super.visitLabel(ctx);
    }

    @Override
    public String visitUsing_clause(HplsqlParser.Using_clauseContext ctx) {
        return super.visitUsing_clause(ctx);
    }

    @Override
    public String visitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_stmt："+aa);
        return super.visitSelect_stmt(ctx);
    }

    @Override
    public String visitCte_select_stmt(HplsqlParser.Cte_select_stmtContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitCte_select_stmt："+aa);
        return super.visitCte_select_stmt(ctx);
    }

    @Override
    public String visitCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx) {
        return super.visitCte_select_stmt_item(ctx);
    }

    @Override
    public String visitCte_select_cols(HplsqlParser.Cte_select_colsContext ctx) {
        return super.visitCte_select_cols(ctx);
    }

    @Override
    public String visitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx) {
        return super.visitFullselect_stmt(ctx);
    }

    @Override
    public String visitFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx) {
        return super.visitFullselect_stmt_item(ctx);
    }

    @Override
    public String visitFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx) {
        return super.visitFullselect_set_clause(ctx);
    }

    @Override
    public String visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        return super.visitSubselect_stmt(ctx);
    }

    @Override
    public String visitSelect_list(HplsqlParser.Select_listContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_list："+aa);
        return super.visitSelect_list(ctx);
    }

    @Override
    public String visitSelect_list_set(HplsqlParser.Select_list_setContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_list_set："+aa);
        return super.visitSelect_list_set(ctx);
    }

    @Override
    public String visitSelect_list_limit(HplsqlParser.Select_list_limitContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_list_limit："+aa);
        return super.visitSelect_list_limit(ctx);
    }

    @Override
    public String visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_list_item："+aa);
        return super.visitSelect_list_item(ctx);
    }

    @Override
    public String visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_list_alias："+aa);
        return super.visitSelect_list_alias(ctx);
    }

    @Override
    public String visitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx) {
        return super.visitSelect_list_asterisk(ctx);
    }

    @Override
    public String visitInto_clause(HplsqlParser.Into_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitInto_clause："+aa);
        return super.visitInto_clause(ctx);
    }

    @Override
    public String visitFrom_clause(HplsqlParser.From_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitFrom_clause："+aa);
        return super.visitFrom_clause(ctx);
    }

    @Override
    public String visitFrom_table_clause(HplsqlParser.From_table_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitFrom_table_clause："+aa);
        return super.visitFrom_table_clause(ctx);
    }

    @Override
    public String visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitFrom_table_name_clause："+aa);
        return super.visitFrom_table_name_clause(ctx);
    }

    @Override
    public String visitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitFrom_subselect_clause："+aa);
        return super.visitFrom_subselect_clause(ctx);
    }

    @Override
    public String visitFrom_join_clause(HplsqlParser.From_join_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitFrom_join_clause："+aa);
        return super.visitFrom_join_clause(ctx);
    }

    @Override
    public String visitFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitFrom_join_type_clause："+aa);
        return super.visitFrom_join_type_clause(ctx);
    }

    @Override
    public String visitFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx) {
        return super.visitFrom_table_values_clause(ctx);
    }

    @Override
    public String visitFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx) {
        return super.visitFrom_table_values_row(ctx);
    }

    @Override
    public String visitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx) {
        return super.visitFrom_alias_clause(ctx);
    }

    @Override
    public String visitTable_name(HplsqlParser.Table_nameContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitTable_name："+aa);
        return super.visitTable_name(ctx);
    }

    @Override
    public String visitWhere_clause(HplsqlParser.Where_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitWhere_clause："+aa);
        return super.visitWhere_clause(ctx);
    }

    @Override
    public String visitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitGroup_by_clause："+aa);
        return super.visitGroup_by_clause(ctx);
    }

    @Override
    public String visitHaving_clause(HplsqlParser.Having_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitHaving_clause："+aa);
        return super.visitHaving_clause(ctx);
    }

    @Override
    public String visitQualify_clause(HplsqlParser.Qualify_clauseContext ctx) {
        return super.visitQualify_clause(ctx);
    }

    @Override
    public String visitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitOrder_by_clause："+aa);
        return super.visitOrder_by_clause(ctx);
    }

    @Override
    public String visitSelect_options(HplsqlParser.Select_optionsContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_options："+aa);
        return super.visitSelect_options(ctx);
    }

    @Override
    public String visitSelect_options_item(HplsqlParser.Select_options_itemContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitSelect_options_item："+aa);
        return super.visitSelect_options_item(ctx);
    }

    @Override
    public String visitUpdate_stmt(HplsqlParser.Update_stmtContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitUpdate_stmt："+aa);
        return super.visitUpdate_stmt(ctx);
    }

    @Override
    public String visitUpdate_assignment(HplsqlParser.Update_assignmentContext ctx) {
        return super.visitUpdate_assignment(ctx);
    }

    @Override
    public String visitUpdate_table(HplsqlParser.Update_tableContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitUpdate_table："+aa);
        return super.visitUpdate_table(ctx);
    }

    @Override
    public String visitUpdate_upsert(HplsqlParser.Update_upsertContext ctx) {
        return super.visitUpdate_upsert(ctx);
    }

    @Override
    public String visitMerge_stmt(HplsqlParser.Merge_stmtContext ctx) {
        return super.visitMerge_stmt(ctx);
    }

    @Override
    public String visitMerge_table(HplsqlParser.Merge_tableContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitMerge_table："+aa);
        return super.visitMerge_table(ctx);
    }

    @Override
    public String visitMerge_condition(HplsqlParser.Merge_conditionContext ctx) {
        return super.visitMerge_condition(ctx);
    }

    @Override
    public String visitMerge_action(HplsqlParser.Merge_actionContext ctx) {
        return super.visitMerge_action(ctx);
    }

    @Override
    public String visitDelete_stmt(HplsqlParser.Delete_stmtContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitDelete_stmt："+aa);
        return super.visitDelete_stmt(ctx);
    }

    @Override
    public String visitDelete_alias(HplsqlParser.Delete_aliasContext ctx) {
        return super.visitDelete_alias(ctx);
    }

    @Override
    public String visitDescribe_stmt(HplsqlParser.Describe_stmtContext ctx) {
        return super.visitDescribe_stmt(ctx);
    }

    @Override
    public String visitBool_expr(HplsqlParser.Bool_exprContext ctx) {
        return super.visitBool_expr(ctx);
    }

    @Override
    public String visitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx) {
        return super.visitBool_expr_atom(ctx);
    }

    @Override
    public String visitBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx) {
        return super.visitBool_expr_unary(ctx);
    }

    @Override
    public String visitBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx) {
        return super.visitBool_expr_single_in(ctx);
    }

    @Override
    public String visitBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx) {
        return super.visitBool_expr_multi_in(ctx);
    }

    @Override
    public String visitBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx) {
        return super.visitBool_expr_binary(ctx);
    }

    @Override
    public String visitBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx) {
        return super.visitBool_expr_logical_operator(ctx);
    }

    @Override
    public String visitBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx) {
        return super.visitBool_expr_binary_operator(ctx);
    }

    @Override
    public String visitExpr(HplsqlParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public String visitExpr_atom(HplsqlParser.Expr_atomContext ctx) {
        return super.visitExpr_atom(ctx);
    }

    @Override
    public String visitExpr_interval(HplsqlParser.Expr_intervalContext ctx) {
        return super.visitExpr_interval(ctx);
    }

    @Override
    public String visitInterval_item(HplsqlParser.Interval_itemContext ctx) {
        return super.visitInterval_item(ctx);
    }

    @Override
    public String visitExpr_concat(HplsqlParser.Expr_concatContext ctx) {
        return super.visitExpr_concat(ctx);
    }

    @Override
    public String visitExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx) {
        return super.visitExpr_concat_item(ctx);
    }

    @Override
    public String visitExpr_case(HplsqlParser.Expr_caseContext ctx) {
        return super.visitExpr_case(ctx);
    }

    @Override
    public String visitExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx) {
        return super.visitExpr_case_simple(ctx);
    }

    @Override
    public String visitExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx) {
        return super.visitExpr_case_searched(ctx);
    }

    @Override
    public String visitExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx) {
        return super.visitExpr_cursor_attribute(ctx);
    }

    @Override
    public String visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx) {
        return super.visitExpr_agg_window_func(ctx);
    }

    @Override
    public String visitExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx) {
        return super.visitExpr_func_all_distinct(ctx);
    }

    @Override
    public String visitExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx) {
        return super.visitExpr_func_over_clause(ctx);
    }

    @Override
    public String visitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx) {
        return super.visitExpr_func_partition_by_clause(ctx);
    }

    @Override
    public String visitExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx) {
        return super.visitExpr_spec_func(ctx);
    }

    @Override
    public String visitExpr_func(HplsqlParser.Expr_funcContext ctx) {
        return super.visitExpr_func(ctx);
    }

    @Override
    public String visitExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx) {
        return super.visitExpr_func_params(ctx);
    }

    @Override
    public String visitFunc_param(HplsqlParser.Func_paramContext ctx) {
        return super.visitFunc_param(ctx);
    }

    @Override
    public String visitExpr_select(HplsqlParser.Expr_selectContext ctx) {
        return super.visitExpr_select(ctx);
    }

    @Override
    public String visitExpr_file(HplsqlParser.Expr_fileContext ctx) {
        return super.visitExpr_file(ctx);
    }

    @Override
    public String visitHive(HplsqlParser.HiveContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitHive："+aa);
        return super.visitHive(ctx);
    }

    @Override
    public String visitHive_item(HplsqlParser.Hive_itemContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitHive_item："+aa);
        return super.visitHive_item(ctx);
    }

    @Override
    public String visitHost(HplsqlParser.HostContext ctx) {
        return super.visitHost(ctx);
    }

    @Override
    public String visitHost_cmd(HplsqlParser.Host_cmdContext ctx) {
        return super.visitHost_cmd(ctx);
    }

    @Override
    public String visitHost_stmt(HplsqlParser.Host_stmtContext ctx) {
        return super.visitHost_stmt(ctx);
    }

    @Override
    public String visitFile_name(HplsqlParser.File_nameContext ctx) {
        return super.visitFile_name(ctx);
    }

    @Override
    public String visitDate_literal(HplsqlParser.Date_literalContext ctx) {
        return super.visitDate_literal(ctx);
    }

    @Override
    public String visitTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx) {
        return super.visitTimestamp_literal(ctx);
    }

    @Override
    public String visitIdent(HplsqlParser.IdentContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitIdent："+aa);
        return super.visitIdent(ctx);
    }

    @Override
    public String visitSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx) {
        return super.visitSingle_quotedString(ctx);
    }

    @Override
    public String visitDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx) {
        return super.visitDouble_quotedString(ctx);
    }

    @Override
    public String visitInt_number(HplsqlParser.Int_numberContext ctx) {
        return super.visitInt_number(ctx);
    }

    @Override
    public String visitDec_number(HplsqlParser.Dec_numberContext ctx) {
        return super.visitDec_number(ctx);
    }

    @Override
    public String visitBool_literal(HplsqlParser.Bool_literalContext ctx) {
        return super.visitBool_literal(ctx);
    }

    @Override
    public String visitNull_const(HplsqlParser.Null_constContext ctx) {
        return super.visitNull_const(ctx);
    }

    @Override
    public String visitNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx) {
        return super.visitNon_reserved_words(ctx);
    }
}