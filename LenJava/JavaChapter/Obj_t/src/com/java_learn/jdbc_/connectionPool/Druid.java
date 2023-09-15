package com.java_learn.jdbc_.connectionPool;

import JDBCUtils.JDBCUtilsByDruid;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Druid {
    public static void main(String[] args) throws Exception {
        //1.加入duid.jar包
        //2.加入druid.properties文件
        //3.创建properties对象
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        //4.创建指定参数的数据库连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println("连接成功");
        connection.close();
    }

    @Test
    public void useDruidJDBCUtils() throws SQLException {
        //使用JDBCUtilsByDruid工具类
        Connection connection = JDBCUtilsByDruid.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from l827 where id<?");
        preparedStatement.setInt(1,2);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
JDBCUtilsByDruid.close(resultSet,preparedStatement,connection);
    }

    @Test
    //使用封装的actor集合存放数据库返回的数据（了解ApacheDBUtils基本原理）
    public void useApacheDBUtils(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        ArrayList<Actor> list = new ArrayList<>();
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement("select * from l827 where id<?");
            preparedStatement.setInt(1,3);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
//                System.out.println(resultSet.getString("name"));
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String password=resultSet.getString("pass");
                String sex=resultSet.getString("sex");
                int age=resultSet.getInt("age");
                list.add(new Actor(id,name,sex,age,password));//将一个Actor对象存入ArrayList集合中
            }
            System.out.println(list);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(resultSet,preparedStatement,connection);
        }

    }

}
