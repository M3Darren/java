package com.java_learn.jdbc_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary statement存在SQL注入问题演示
 */
public class Jdbc_Statement {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //如果使用注入语法，会成功登录 name值（1' or） pass值(or '1'='1)
        System.out.println("请输入用户名：");
        String name=scanner.nextLine();
        System.out.println("请输入密码：");
        String pass=scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);//可不写此句，在高版本jdbc中会自动加载（libs/mysql-connector-java.jar/META-INF/services/java.sql.Driver）
        Connection connection = DriverManager.getConnection(url, user, password);
        //获取statement
        //1.select使用executeQuery(sql),返回ResultSet结果集;
        //2.(update/delete/insert)使用executeUpdate(sql),返回受影响行数;
        //3.execute(sql)执行任意sql语句，返回布尔值

        Statement statement = connection.createStatement();
        String sql="select * from l827 where name='"+name+"' and pass='"+pass+"'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()) System.out.println("登录成功");
        else System.out.println("登录失败");
    }
}
