package com.java_learn.jdbc_;

import JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用事务
 */
public class Jdbc_transaction {
    public static void main(String[] args) {
        Connection connection = JDBCUtils.getConnection();
        String sql="update l827 set pass=222 where name='张三'";
        String sql1="update l827 set pass=333 where name='李四'";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //设置不自动提交
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
//            int i=1/0;//异常发生点
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.executeUpdate();
            //这里设置提交事务
            connection.commit();
        } catch (SQLException e) {
            System.out.println("执行异常，进行回滚中。。。");
            try {
                connection.rollback();//执行回滚操作
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
