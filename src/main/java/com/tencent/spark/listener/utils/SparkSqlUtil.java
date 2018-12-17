package com.tencent.spark.listener.utils;

import com.tencent.spark.listener.MySqlBaseBaseListener;
import com.tencent.spark.out.SqlBaseLexer;
import com.tencent.spark.out.SqlBaseParser;
import com.tencent.spark.listener.ANTLRNoCaseStringStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.util.Map;
import java.util.Set;

public class SparkSqlUtil {
    public static Map<String, Set<String>> getDataBaseTablenameAndOper(String sql){

        ANTLRNoCaseStringStream aa = new ANTLRNoCaseStringStream(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(aa);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        MySqlBaseBaseListener mySqlBaseBaseListener = new MySqlBaseBaseListener();

        SqlBaseParser.StatementContext bb = parser.statement();

        walker.walk(mySqlBaseBaseListener,bb );

        return mySqlBaseBaseListener.getDataBaseTablenameAndOper();
    }


    public static Map<String, Set<String>> getDataBaseTablenameAndOper2(String sql){

        ANTLRInputStream aa = new ANTLRInputStream(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(aa);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        MySqlBaseBaseListener mySqlBaseBaseListener = new MySqlBaseBaseListener();

        SqlBaseParser.StatementContext bb = parser.statement();

        walker.walk(mySqlBaseBaseListener,bb );

        return mySqlBaseBaseListener.getDataBaseTablenameAndOper();
    }

}
