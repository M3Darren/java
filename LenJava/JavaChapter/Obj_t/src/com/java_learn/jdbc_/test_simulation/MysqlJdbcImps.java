package com.java_learn.jdbc_.test_simulation;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary mysql厂商实现提供的接口
 */
public class MysqlJdbcImps implements JdbcInterface {
    @Override
    public void getConnect() {
        System.out.println("mysql开始连接");
    }

    @Override
    public void crud() {
        System.out.println("mysql实现crud");
    }

    @Override
    public void close() {
        System.out.println("mysql关闭连接");
    }
}
