package com.java_learn.jdbc_;

import JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用编写的JDBCUtils工具操作
 */
public class UseJDBCUtils {
    public static void main(String[] args) {
        Connection connection = JDBCUtils.getConnection();
        String sql = "select * from l827";
//        String sql1 = "update l827 set pass='222222' where name ='李四'";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement = connection.prepareStatement(sql1);
            resultSet = preparedStatement.executeQuery();//执行查询操作
//            int i = preparedStatement.executeUpdate();//执行dml操作
//            System.out.println(i);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String pass = resultSet.getString("pass");
                System.out.println(id + "\t" + name + "\t" + pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
