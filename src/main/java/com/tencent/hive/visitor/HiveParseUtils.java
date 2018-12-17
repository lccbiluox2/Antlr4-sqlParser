package com.tencent.hive.visitor;

import com.tencent.hive.out.HplsqlLexer;
import com.tencent.hive.out.HplsqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @Author: chuanchuan.lcc
 * @CreateDate: 2018/12/17 PM7:37
 * @Version: 1.0
 * @Description: java类作用描述：
 */
public class HiveParseUtils {

    public static void parseTable(String sql ){

        HplsqlLexer lexer = new HplsqlLexer(new ANTLRInputStream(sql));
        HplsqlParser parser = new HplsqlParser(new CommonTokenStream(lexer));
        HiveVisitor visitor = new HiveVisitor();

        HplsqlParser.StmtContext bb = parser.stmt();

        String res = visitor.visitStmt(bb);

        return  ;

    }


}
