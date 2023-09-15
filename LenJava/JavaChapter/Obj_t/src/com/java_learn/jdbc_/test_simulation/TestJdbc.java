package com.java_learn.jdbc_.test_simulation;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟调用接口实现连接数据库
 */
public class TestJdbc {
    public static void main(String[] args) {
        MysqlJdbcImps mysqlJdbcImps = new MysqlJdbcImps();
        mysqlJdbcImps.getConnect();
        mysqlJdbcImps.crud();
        mysqlJdbcImps.close();
    }
}
