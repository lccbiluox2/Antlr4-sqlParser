package com.tencent.spark.visitor;

import com.tencent.spark.out.SqlBaseLexer;
import com.tencent.spark.out.SqlBaseParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserDriver {
    public static void main(String[] args) {
//        String query = "SELECT LastName,FirstName FROM Persons;";

        String  query = "SELECT Persons.LastName, Persons.FirstName, Orders.OrderNo\n" +
                "FROM Persons\n" +
                "INNER JOIN Orders\n" +
                "ON Persons.Id_P = Orders.Id_P\n" +
                "ORDER BY Persons.LastName";

        System.out.println(query);

        SqlBaseLexer lexer = new SqlBaseLexer(new ANTLRInputStream(query));
        SqlBaseParser parser = new SqlBaseParser(new CommonTokenStream(lexer));
        MyVisitor visitor = new MyVisitor();
        SqlBaseParser.SingleStatementContext bb = parser.singleStatement();
        String res = visitor.visitSingleStatement(bb);
        System.out.println("res="+res);
    }
}
