package com.tencent.hive.listener;

import com.tencent.spark.listener.utils.SparkSqlUtil;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by lcc on 2018/12/17.
 */
public class HiveSqlUtilTest {

    @Test
    public void getDataBaseTablenameAndOper() throws Exception {
        String sql = "insert into table_a (id,name ) select a.id,b.name  from a inner join b on a.id =b.id ";
        Map<String, Set<String>> aa = HiveSqlUtil.getDataBaseTablenameAndOper(sql);

        System.out.println(aa);
    }


    @Test
    public void getDataBaseTablenameAndOper1() throws Exception {
        String sql = "select a.id,b.name  from a inner join b on a.id =b.id ";
        Map<String, Set<String>> aa = HiveSqlUtil.getDataBaseTablenameAndOper(sql);

        System.out.println(aa);
    }


    @Test
    public void getDataBaseTablenameAndOper2() throws Exception {
        String sql = "select a.id,b.name  from a inner join b on a.id =b.id ";
        Map<String, Set<String>> aa = HiveSqlUtil.getDataBaseTablenameAndOper2(sql);

        System.out.println(aa);
    }


}