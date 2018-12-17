package com.tencent.spark.visitor;

import com.tencent.spark.out.SqlBaseBaseVisitor;
import com.tencent.spark.out.SqlBaseParser;

public class MyVisitor extends SqlBaseBaseVisitor<String> {

    public String visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {

        String  aa = ctx.getText();
        System.out.println("visitSingleStatement \t "+aa);
        return visitChildren(ctx);
    }

    public String visitSingleExpression(SqlBaseParser.SingleExpressionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSingleExpression \t "+ aa);
        return visitChildren(ctx);
    }

    public String visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSingleTableIdentifier 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitSingleDataType(SqlBaseParser.SingleDataTypeContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSingleDataType 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitStatementDefault");
        return visitChildren(ctx);
    }

    public String visitUse(SqlBaseParser.UseContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitUse 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitCreateDatabase(SqlBaseParser.CreateDatabaseContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateDatabase 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitSetDatabaseProperties(SqlBaseParser.SetDatabasePropertiesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetDatabaseProperties 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitDropDatabase(SqlBaseParser.DropDatabaseContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDropDatabase 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitCreateTableUsing(SqlBaseParser.CreateTableUsingContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateTableUsing 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitCreateTable(SqlBaseParser.CreateTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateTable 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitCreateTableLike(SqlBaseParser.CreateTableLikeContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateTableLike 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitAnalyze(SqlBaseParser.AnalyzeContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitAnalyze 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitRenameTable(SqlBaseParser.RenameTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRenameTable");
        return visitChildren(ctx);
    }

    public String visitSetTableProperties(SqlBaseParser.SetTablePropertiesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetTableProperties");
        return visitChildren(ctx);
    }

    public String visitUnsetTableProperties(SqlBaseParser.UnsetTablePropertiesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitUnsetTableProperties");
        return visitChildren(ctx);
    }

    public String visitSetTableSerDe(SqlBaseParser.SetTableSerDeContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetTableSerDe");
        return visitChildren(ctx);
    }

    public String visitAddTablePartition(SqlBaseParser.AddTablePartitionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitAddTablePartition");
        return visitChildren(ctx);
    }

    public String visitRenameTablePartition(SqlBaseParser.RenameTablePartitionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRenameTablePartition");
        return visitChildren(ctx);
    }

    public String visitDropTablePartitions(SqlBaseParser.DropTablePartitionsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSDropTablePartitions");
        return visitChildren(ctx);
    }

    public String visitSetTableLocation(SqlBaseParser.SetTableLocationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetTableLocation");
        return visitChildren(ctx);
    }

    public String visitRecoverPartitions(SqlBaseParser.RecoverPartitionsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRecoverPartitions");
        return visitChildren(ctx);
    }

    public String visitDropTable(SqlBaseParser.DropTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDropTable");
        return visitChildren(ctx);
    }

    public String visitCreateView(SqlBaseParser.CreateViewContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateView");
        return visitChildren(ctx);
    }

    public String visitCreateTempViewUsing(SqlBaseParser.CreateTempViewUsingContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateTempViewUsing");
        return visitChildren(ctx);
    }

    public String visitAlterViewQuery(SqlBaseParser.AlterViewQueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitAlterViewQuery");
        return visitChildren(ctx);
    }

    public String visitCreateFunction(SqlBaseParser.CreateFunctionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateFunction");
        return visitChildren(ctx);
    }

    public String visitDropFunction(SqlBaseParser.DropFunctionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDropFunction");
        return visitChildren(ctx);
    }

    public String visitExplain(SqlBaseParser.ExplainContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitExplain");
        return visitChildren(ctx);
    }

    public String visitShowTables(SqlBaseParser.ShowTablesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowTables 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitShowDatabases(SqlBaseParser.ShowDatabasesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowDatabases");
        return visitChildren(ctx);
    }

    public String visitShowTblProperties(SqlBaseParser.ShowTblPropertiesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowTblProperties");
        return visitChildren(ctx);
    }

    public String visitShowColumns(SqlBaseParser.ShowColumnsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowColumns");
        return visitChildren(ctx);
    }

    public String visitShowPartitions(SqlBaseParser.ShowPartitionsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowPartitions");
        return visitChildren(ctx);
    }

    public String visitShowFunctions(SqlBaseParser.ShowFunctionsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowFunctions");
        return visitChildren(ctx);
    }

    public String visitShowCreateTable(SqlBaseParser.ShowCreateTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitShowCreateTable 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitDescribeFunction(SqlBaseParser.DescribeFunctionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDescribeFunction");
        return visitChildren(ctx);
    }

    public String visitDescribeDatabase(SqlBaseParser.DescribeDatabaseContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDescribeDatabase");
        return visitChildren(ctx);
    }

    public String visitDescribeTable(SqlBaseParser.DescribeTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDescribeTable");
        return visitChildren(ctx);
    }

    public String visitRefreshTable(SqlBaseParser.RefreshTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRefreshTable");
        return visitChildren(ctx);
    }

    public String visitRefreshResource(SqlBaseParser.RefreshResourceContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRefreshResource");
        return visitChildren(ctx);
    }

    public String visitCacheTable(SqlBaseParser.CacheTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCacheTable");
        return visitChildren(ctx);
    }

    public String visitUncacheTable(SqlBaseParser.UncacheTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitUncacheTable");
        return visitChildren(ctx);
    }

    public String visitClearCache(SqlBaseParser.ClearCacheContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitClearCache");
        return visitChildren(ctx);
    }

    public String visitLoadData(SqlBaseParser.LoadDataContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitLoadData");
        return visitChildren(ctx);
    }

    public String visitTruncateTable(SqlBaseParser.TruncateTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTruncateTable 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitRepairTable(SqlBaseParser.RepairTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRepairTable");
        return visitChildren(ctx);
    }

    public String visitManageResource(SqlBaseParser.ManageResourceContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitManageResource");
        return visitChildren(ctx);
    }

    public String visitFailNativeCommand(SqlBaseParser.FailNativeCommandContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitFailNativeCommand");
        return visitChildren(ctx);
    }

    public String visitSetConfiguration(SqlBaseParser.SetConfigurationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetConfiguration");
        return visitChildren(ctx);
    }

    public String visitResetConfiguration(SqlBaseParser.ResetConfigurationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitResetConfiguration");
        return visitChildren(ctx);
    }

    public String visitUnsupportedHiveNativeCommands(SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitUnsupportedHiveNativeCommand");
        return visitChildren(ctx);
    }

    public String visitCreateTableHeader(SqlBaseParser.CreateTableHeaderContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateTableHeader");
        return visitChildren(ctx);
    }

    public String visitBucketSpec(SqlBaseParser.BucketSpecContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitBucketSpec");
        return visitChildren(ctx);
    }

    public String visitSkewSpec(SqlBaseParser.SkewSpecContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSkewSpec");
        return visitChildren(ctx);
    }

    public String visitLocationSpec(SqlBaseParser.LocationSpecContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitLocationSpec");
        return visitChildren(ctx);
    }

    public String visitQuery(SqlBaseParser.QueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitQuery 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitInsertInto(SqlBaseParser.InsertIntoContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitInsertInto");
        return visitChildren(ctx);
    }

    public String visitPartitionSpecLocation(SqlBaseParser.PartitionSpecLocationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitPartitionSpecLocation");
        return visitChildren(ctx);
    }

    public String visitPartitionSpec(SqlBaseParser.PartitionSpecContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitPartitionSpec");
        return visitChildren(ctx);
    }

    public String visitPartitionVal(SqlBaseParser.PartitionValContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitPartitionVal");
        return visitChildren(ctx);
    }

    public String visitDescribeFuncName(SqlBaseParser.DescribeFuncNameContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDescribeFuncName");
        return visitChildren(ctx);
    }

    public String visitDescribeColName(SqlBaseParser.DescribeColNameContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDescribeColName");
        return visitChildren(ctx);
    }

    public String visitCtes(SqlBaseParser.CtesContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCtes");
        return visitChildren(ctx);
    }

    public String visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitNamedQuery");
        return visitChildren(ctx);
    }

    public String visitTableProvider(SqlBaseParser.TableProviderContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTableProvider 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitTablePropertyList(SqlBaseParser.TablePropertyListContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTablePropertyList");
        return visitChildren(ctx);
    }

    public String visitTableProperty(SqlBaseParser.TablePropertyContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTableProperty");
        return visitChildren(ctx);
    }

    public String visitTablePropertyKey(SqlBaseParser.TablePropertyKeyContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTablePropertyKey");
        return visitChildren(ctx);
    }

    public String visitTablePropertyValue(SqlBaseParser.TablePropertyValueContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTablePropertyValue");
        return visitChildren(ctx);
    }

    public String visitConstantList(SqlBaseParser.ConstantListContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitConstantList");
        return visitChildren(ctx);
    }

    public String visitNestedConstantList(SqlBaseParser.NestedConstantListContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitNestedConstantList");
        return visitChildren(ctx);
    }

    public String visitCreateFileFormat(SqlBaseParser.CreateFileFormatContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitCreateFileFormat 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitTableFileFormat(SqlBaseParser.TableFileFormatContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTableFileFormat 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitGenericFileFormat(SqlBaseParser.GenericFileFormatContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitGenericFileFormat");
        return visitChildren(ctx);
    }

    public String visitStorageHandler(SqlBaseParser.StorageHandlerContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitStorageHandler");
        return visitChildren(ctx);
    }

    public String visitResource(SqlBaseParser.ResourceContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitResource");
        return visitChildren(ctx);
    }

    public String visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSingleInsertQuery");
        return visitChildren(ctx);
    }

    public String visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitMultiInsertQuery");
        return visitChildren(ctx);
    }

    public String visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitQueryOrganization");
        return visitChildren(ctx);
    }

    public String visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitMultiInsertQueryBody");
        return visitChildren(ctx);
    }

    public String visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitQueryTermDefault");
        return visitChildren(ctx);
    }

    public String visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetOperation");
        return visitChildren(ctx);
    }

    public String visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitQueryPrimaryDefault");
        return visitChildren(ctx);
    }

    public String visitTable(SqlBaseParser.TableContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitTable 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx) {
        String  aa = ctx.getText();
        System.out.println("visitInlineTableDefault1 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitSubquery(SqlBaseParser.SubqueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSubquery");
        return visitChildren(ctx);
    }

    public String visitSortItem(SqlBaseParser.SortItemContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSortItem");
        return visitChildren(ctx);
    }

    public String visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitQuerySpecification");
        return visitChildren(ctx);
    }

    public String visitFromClause(SqlBaseParser.FromClauseContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitFromClause 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitAggregation(SqlBaseParser.AggregationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitAggregation");
        return visitChildren(ctx);
    }

    public String visitGroupingSet(SqlBaseParser.GroupingSetContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitGroupingSet");
        return visitChildren(ctx);
    }

    public String visitLateralView(SqlBaseParser.LateralViewContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitLateralView");
        return visitChildren(ctx);
    }

    public String visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSetQuantifier");
        return visitChildren(ctx);
    }

    public String visitRelation(SqlBaseParser.RelationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRelation 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitJoinRelation(SqlBaseParser.JoinRelationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitJoinRelation 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitJoinType(SqlBaseParser.JoinTypeContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitJoinType 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitJoinCriteria");
        return visitChildren(ctx);
    }

    public String visitSample(SqlBaseParser.SampleContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSample 	 "+ aa);
        return visitChildren(ctx);
    }

    public String visitIdentifierList(SqlBaseParser.IdentifierListContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitIdentifierList");
        return visitChildren(ctx);
    }

    public String visitIdentifierSeq(SqlBaseParser.IdentifierSeqContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitIdentifierSeq");
        return visitChildren(ctx);
    }

    public String visitOrderedIdentifierList(SqlBaseParser.OrderedIdentifierListContext ctx) {
        String  aa = ctx.getText();
        return visitChildren(ctx);
    }

    public String visitOrderedIdentifier(SqlBaseParser.OrderedIdentifierContext ctx) {
        String  aa = ctx.getText();
        return visitChildren(ctx);
    }

    public String visitIdentifierCommentList(SqlBaseParser.IdentifierCommentListContext ctx) {
        String  aa = ctx.getText();
        return visitChildren(ctx);
    }

    public String visitIdentifierComment(SqlBaseParser.IdentifierCommentContext ctx) {
        String  aa = ctx.getText();
        return visitChildren(ctx);
    }

    public String visitTableName(SqlBaseParser.TableNameContext ctx) {
        System.out.println("visitTableName: " + ctx.getText());
        return visitChildren(ctx);
    }

    public String visitAliasedQuery(SqlBaseParser.AliasedQueryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitAliasedQuery");
        return visitChildren(ctx);
    }

    public String visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitAliasedRelation");
        return visitChildren(ctx);
    }

    public String visitInlineTableDefault2(SqlBaseParser.InlineTableDefault2Context ctx) {
        String  aa = ctx.getText();
        System.out.println("visitInlineTableDefault2");
        return visitChildren(ctx);
    }

    public String visitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTableValueFunction");
        return visitChildren(ctx);
    }

    public String visitInlineTable(SqlBaseParser.InlineTableContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitInlineTable");
        return visitChildren(ctx);
    }

    public String visitRowFormatSerde(SqlBaseParser.RowFormatSerdeContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRowFormatSerde");
        return visitChildren(ctx);
    }

    public String visitRowFormatDelimited(SqlBaseParser.RowFormatDelimitedContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRowFormatDelimited");
        return visitChildren(ctx);
    }

    public String visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitTableIdentifier: table=" + aa);
        return visitChildren(ctx);
    }

    public String visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitNamedExpression");
        return visitChildren(ctx);
    }

    public String visitNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitNamedExpressionSeq");
        return visitChildren(ctx);
    }

    public String visitExpression(SqlBaseParser.ExpressionContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitExpression");
        return visitChildren(ctx);
    }

    public String visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitLogicalNot");
        return visitChildren(ctx);
    }

    public String visitBooleanDefault(SqlBaseParser.BooleanDefaultContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitBooleanDefault");
        return visitChildren(ctx);
    }

    public String visitExists(SqlBaseParser.ExistsContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitExists");
        return visitChildren(ctx);
    }

    public String visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitLogicalBinary");
        return visitChildren(ctx);
    }

    public String visitPredicated(SqlBaseParser.PredicatedContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitPredicated");
        return visitChildren(ctx);
    }

    public String visitPredicate(SqlBaseParser.PredicateContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitPredicate");
        return visitChildren(ctx);
    }

    public String visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitValueExpressionDefault");
        return visitChildren(ctx);
    }

    public String visitComparison(SqlBaseParser.ComparisonContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitComparison");
        return visitChildren(ctx);
    }

    public String visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitArithmeticBinary: operator=" + ctx.operator.getText() + ctx.operator.getType());
        return visitChildren(ctx);
    }

    public String visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitArithmeticUnary " + ctx.operator);
        return visitChildren(ctx);
    }

    public String visitDereference(SqlBaseParser.DereferenceContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitDereference");
        return visitChildren(ctx);
    }
    
    public String visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSimpleCase");
        return visitChildren(ctx);
    }

    public String visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitColumnReference:\t"+aa);
        return visitChildren(ctx);
    }

    public String visitRowConstructor(SqlBaseParser.RowConstructorContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitRowConstructor");
        return visitChildren(ctx);
    }

    public String visitStar(SqlBaseParser.StarContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitStar");
        return visitChildren(ctx);
    }

    public String visitSubscript(SqlBaseParser.SubscriptContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitSubscript");
        return visitChildren(ctx);
    }

    public String visitTimeFunctionCall(SqlBaseParser.TimeFunctionCallContext ctx) {
        String  aa = ctx.getText();
        System.out.println("visitTimeFunctionCall");
        return visitChildren(ctx);
    }

    public String visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx) {
        System.out.println("visitSubqueryExpression");
        return visitChildren(ctx);
    }

    public String visitCast(SqlBaseParser.CastContext ctx) {
        System.out.println("visitCast");
        return visitChildren(ctx);
    }

    public String visitConstantDefault(SqlBaseParser.ConstantDefaultContext ctx) {
        System.out.println("visitConstantDefault");
        return visitChildren(ctx);
    }

    public String visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        System.out.println("visitParenthesizedExpression");
        return visitChildren(ctx);
    }

    public String visitFunctionCall(SqlBaseParser.FunctionCallContext ctx) {
        System.out.println("visitFunctionCall: " + ctx.getText() + " | qualifiedName="
                + ctx.qualifiedName().getText() + ctx.expression(0).getText());
        return visitChildren(ctx);
    }

    public String visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx) {
        System.out.println("visitSearchedCase");
        return visitChildren(ctx);
    }

    public String visitNullLiteral(SqlBaseParser.NullLiteralContext ctx) {
        System.out.println("visitNullLiteral");
        return visitChildren(ctx);
    }

    public String visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx) {
        System.out.println("visitIntervalLiteral");
        return visitChildren(ctx);
    }

    public String visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx) {
        System.out.println("visitTypeConstructor");
        return visitChildren(ctx);
    }

    public String visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx) {
        System.out.println("visitNumericLiteral");
        return visitChildren(ctx);
    }

    public String visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx) {
        System.out.println("visitBooleanLiteral");
        return visitChildren(ctx);
    }

    public String visitStringLiteral(SqlBaseParser.StringLiteralContext ctx) {
        System.out.println("visitStringLiteral");
        return visitChildren(ctx);
    }

    public String visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        System.out.println("visitComparisonOperator");
        return visitChildren(ctx);
    }

    public String visitArithmeticOperator(SqlBaseParser.ArithmeticOperatorContext ctx) {
        System.out.println("visitArithmeticOperator");
        return visitChildren(ctx);
    }

    public String visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx) {
        System.out.println("visitPredicateOperator");
        return visitChildren(ctx);
    }

    public String visitBooleanValue(SqlBaseParser.BooleanValueContext ctx) {
        System.out.println("visitBooleanValue");
        return visitChildren(ctx);
    }

    public String visitInterval(SqlBaseParser.IntervalContext ctx) {
        System.out.println("visitInterval");
        return visitChildren(ctx);
    }

    public String visitIntervalField(SqlBaseParser.IntervalFieldContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitIntervalField:"+aa);
        return visitChildren(ctx);
    }

    public String visitIntervalValue(SqlBaseParser.IntervalValueContext ctx) {
        String aa = ctx.getText();
        System.out.println("visitIntervalValue:"+aa);
        return visitChildren(ctx);
    }

    public String visitComplexDataType(SqlBaseParser.ComplexDataTypeContext ctx) {
        System.out.println("visitComplexDataType");
        return visitChildren(ctx);
    }

    public String visitPrimitiveDataType(SqlBaseParser.PrimitiveDataTypeContext ctx) {
        System.out.println("visitPrimitiveDataType");
        return visitChildren(ctx);
    }

    public String visitColTypeList(SqlBaseParser.ColTypeListContext ctx) {
        System.out.println("visitColTypeList");
        return visitChildren(ctx);
    }

    public String visitColType(SqlBaseParser.ColTypeContext ctx) {
        System.out.println("visitColType");
        return visitChildren(ctx);
    }

    public String visitComplexColTypeList(SqlBaseParser.ComplexColTypeListContext ctx) {
        System.out.println("visitComplexColTypeList");
        return visitChildren(ctx);
    }

    public String visitComplexColType(SqlBaseParser.ComplexColTypeContext ctx) {
        System.out.println("visitComplexColType");
        return visitChildren(ctx);
    }

    public String visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        System.out.println("visitWhenClause");
        return visitChildren(ctx);
    }

    public String visitWindows(SqlBaseParser.WindowsContext ctx) {
        System.out.println("visitWindows");
        return visitChildren(ctx);
    }

    public String visitNamedWindow(SqlBaseParser.NamedWindowContext ctx) {
        System.out.println("visitNamedWindow");
        return visitChildren(ctx);
    }

    public String visitWindowRef(SqlBaseParser.WindowRefContext ctx) {
        System.out.println("visitWindowRef");
        return visitChildren(ctx);
    }

    public String visitWindowDef(SqlBaseParser.WindowDefContext ctx) {
        System.out.println("visitWindowDef");
        return visitChildren(ctx);
    }

    public String visitWindowFrame(SqlBaseParser.WindowFrameContext ctx) {
        System.out.println("visitWindowFrame");
        return visitChildren(ctx);
    }

    public String visitFrameBound(SqlBaseParser.FrameBoundContext ctx) {
        System.out.println("visitFrameBound");
        return visitChildren(ctx);
    }

    public String visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx) {
        System.out.println("visitQualifiedName");
        return visitChildren(ctx);
    }

    public String visitIdentifier(SqlBaseParser.IdentifierContext ctx) {
        System.out.println("visitIdentifier");
        return visitChildren(ctx);
    }

    public String visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        System.out.println("visitUnquotedIdentifier");
        return visitChildren(ctx);
    }

    public String visitQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx) {
        System.out.println("visitQuotedIdentifierAlternative");
        return visitChildren(ctx);
    }

    public String visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        System.out.println("visitQuotedIdentifer");
        return visitChildren(ctx);
    }

    public String visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx) {
        System.out.println("visitDecimalLiteral");
        return visitChildren(ctx);
    }

    public String visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        System.out.println("visitIntegerLiteral");
        return visitChildren(ctx);
    }

    public String visitBigIntLiteral(SqlBaseParser.BigIntLiteralContext ctx) {
        System.out.println("visitBigIntLiteral");
        return visitChildren(ctx);
    }

    public String visitSmallIntLiteral(SqlBaseParser.SmallIntLiteralContext ctx) {
        System.out.println("visitSmallIntLiteral");
        return visitChildren(ctx);
    }

    public String visitTinyIntLiteral(SqlBaseParser.TinyIntLiteralContext ctx) {
        System.out.println("visitTinyIntLiteral");
        return visitChildren(ctx);
    }

    public String visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx) {
        System.out.println("visitDoubleLiteral");
        return visitChildren(ctx);
    }

    public String visitBigDecimalLiteral(SqlBaseParser.BigDecimalLiteralContext ctx) {
        System.out.println("visitBigDecimalLiteral");
        return visitChildren(ctx);
    }

    public String visitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        System.out.println("visitNonReserved");
        return visitChildren(ctx);
    }


}