package com.java_learn.jdbc_.connectionPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary c3p0的使用
 */
public class C3p0 {
    public static void main(String[] args) {

    }
    @Test
    //方式1：直接手动配置c3p0
    public void testC3p0_01() throws Exception {
        //1.创建数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2.通过配置文件mysql.properties
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user= properties.getProperty("user");
        String password= properties.getProperty("password");
        String url= properties.getProperty("url");
        String driver= properties.getProperty("driver");
        //3.给数据源comboPooledDataSource设置相关信息(用于管理连接)
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        //4.设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);//产生10个连接放入池中
        comboPooledDataSource.setMaxPoolSize(30);//最大连接数
        //5.开始连接
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
//            System.out.println("连接成功");
            connection.close();
        }
        long l1 = System.currentTimeMillis();
        System.out.println("C3p0连接5000次耗时："+(l1-l));

    }
    @Test
    //方式2：使用c3p0配置文件模板
    public void testC3p0_02() throws Exception {
        //相当于将方法1的配置步骤由src/c3p0.config.xml文件完成
        ComboPooledDataSource hello = new ComboPooledDataSource("hello");
        Connection connection = hello.getConnection();
        System.out.println("连接成功");
        connection.close();
    }
}
