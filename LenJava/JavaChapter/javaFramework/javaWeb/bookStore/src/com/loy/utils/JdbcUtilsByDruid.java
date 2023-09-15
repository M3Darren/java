package com.loy.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class JdbcUtilsByDruid {
    private static DruidDataSource ds;
    private static ThreadLocal<Connection> conns=new ThreadLocal<>();

    static {

        try {
            Properties properties = new Properties();
            properties.load(JdbcUtilsByDruid.class.getClassLoader().getResourceAsStream("jdbcdruid.properties"));
            ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //获得连接的方法
    public static Connection getConnection() throws SQLException {
        Connection conn=conns.get();//从线程中取得连接
        if (conn==null){
            conn= ds.getConnection();//如果线程中没有连接，则创建连接
            conns.set(conn);//放入线程
            conn.setAutoCommit(false);//设置手动提交事务
        }
        return conn;
    }

    public static void commitAndClose(){
        Connection connection = conns.get();
        if(connection!=null){
            //如果不是空，说明之前操作过数据库
            try {
                connection.commit();//提交事务

            } catch (SQLException e) {
               e.printStackTrace();
            }finally {
                try {
                    connection.close();//关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        conns.remove();//将线程移出
    }
    public static  void rollbackAndClose(){
        Connection connection = conns.get();
        if(connection!=null){
            //如果不是空，说明之前操作过数据库
            try {
                connection.rollback();//回滚事务

            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    connection.close();//关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        conns.remove();//将线程移出
    }

    //关闭连接的方法
 /*   public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();//处理机制与jdbc原生不同，此处只是将连接放回池中
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }*/

}
