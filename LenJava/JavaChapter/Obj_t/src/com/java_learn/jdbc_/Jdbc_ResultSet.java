package com.java_learn.jdbc_;

import java.io.FileInputStream;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 连接数据库的其他方式
 */
public class Jdbc_ResultSet {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);//可不写此句，在高版本jdbc中会自动加载（libs/mysql-connector-java.jar/META-INF/services/java.sql.Driver）
        Connection connection = DriverManager.getConnection(url, user, password);
        //获取statement
        Statement statement = connection.createStatement();
        String sql="select * from l827";
        ResultSet resultSet = statement.executeQuery(sql);
        //使用循环输出结果集
        while (resultSet.next()){
           int id= resultSet.getInt(1);//获取改行的第1列
            String name=resultSet.getString(2);
            String sex=resultSet.getString(3);
            int age=resultSet.getInt(4);
            System.out.println(id+"\t"+name+"\t"+sex+"\t"+age+"\t");
        }


        resultSet.close();
        statement.close();
        connection.close();

    }

}
