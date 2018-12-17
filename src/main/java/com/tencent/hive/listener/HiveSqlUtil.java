package com.tencent.hive.listener;


import com.tencent.hive.out.HplsqlLexer;
import com.tencent.hive.out.HplsqlParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Map;
import java.util.Set;

public class HiveSqlUtil {
    public static Map<String, Set<String>> getDataBaseTablenameAndOper(String sql){

        ANTLRNoCaseStringStream aa = new ANTLRNoCaseStringStream(sql);
        HplsqlLexer lexer = new HplsqlLexer(aa);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        MySqlBaseBaseListener mySqlBaseBaseListener = new MySqlBaseBaseListener();

        HplsqlParser.StmtContext bb = parser.stmt();

        walker.walk(mySqlBaseBaseListener,bb );

        return mySqlBaseBaseListener.getDataBaseTablenameAndOper();
    }


    public static Map<String, Set<String>> getDataBaseTablenameAndOper2(String sql){

        ANTLRInputStream aa = new ANTLRInputStream(sql);
        HplsqlLexer lexer = new HplsqlLexer(aa);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        MySqlBaseBaseListener mySqlBaseBaseListener = new MySqlBaseBaseListener();

        HplsqlParser.StmtContext bb = parser.stmt();

        walker.walk(mySqlBaseBaseListener,bb );

        return mySqlBaseBaseListener.getDataBaseTablenameAndOper();
    }

}
