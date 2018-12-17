package com.tencent.spark.listener;

import com.tencent.spark.out.SqlBaseBaseListener;
import com.tencent.spark.out.SqlBaseParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MySqlBaseBaseListener extends SqlBaseBaseListener {
    private Map<String, Set<String>> dataBaseTablenameAndOper = new HashMap<>();//用来保存表与操作的对应关系

    public Map<String, Set<String>> getDataBaseTablenameAndOper() {
        return dataBaseTablenameAndOper;
    }


    @Override
    public void enterQuery(SqlBaseParser.QueryContext ctx) {
        ParseTreeWalker queryWalker = new ParseTreeWalker();
        queryWalker.walk(new SqlBaseBaseListener() {
            public void enterTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
                SqlBaseParser.IdentifierContext identifierContext = ctx.table;
                if ( identifierContext != null) {
                    String table = ctx.getText().toLowerCase();
                    Set<String> oper;
                    if (dataBaseTablenameAndOper.containsKey(table)) {
                        oper = dataBaseTablenameAndOper.get(table);
                    } else {
                        oper = new HashSet<>();
                    }
                    oper.add("SELECT");
                    dataBaseTablenameAndOper.put(table, oper);
                }
            }
        }, ctx);
    }


    @Override
    public void enterQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        final SqlBaseParser.QuerySpecificationContext baseCtx = ctx;
        ParseTreeWalker queryWalker = new ParseTreeWalker();
        queryWalker.walk(new SqlBaseBaseListener() {
            public void enterTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
                if (ctx.table != null) {
                    String table = ctx.getText().toLowerCase();
                    Set<String> oper;
                    if (dataBaseTablenameAndOper.containsKey(table)) {
                        oper = dataBaseTablenameAndOper.get(table);
                    } else {
                        oper = new HashSet<>();
                    }
                    oper.add("SELECT");
                    dataBaseTablenameAndOper.put(table, oper);
                }
            }
        }, ctx);
    }

    @Override
    public void enterInsertInto(SqlBaseParser.InsertIntoContext ctx) {
        final SqlBaseParser.InsertIntoContext baseCtx = ctx;
        ParseTreeWalker queryWalker = new ParseTreeWalker();
        final Set<String> simpleTables = new HashSet<String>();
        queryWalker.walk(new SqlBaseBaseListener() {
            public void enterTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
                if (ctx.table != null) {
                    String table = ctx.getText().toLowerCase();
                    Set<String> oper;
                    if (dataBaseTablenameAndOper.containsKey(table)) {
                        oper = dataBaseTablenameAndOper.get(table);
                    } else {
                        oper = new HashSet<>();
                    }
                    oper.add("INSERT");
                    dataBaseTablenameAndOper.put(table, oper);
                }
            }
        }, ctx);
    }
}
