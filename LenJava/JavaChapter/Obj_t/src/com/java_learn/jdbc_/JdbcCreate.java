package com.java_learn.jdbc_;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class JdbcCreate {
    public static void main(String[] args) throws Exception {
        //1.首先将mysql连接的驱动添加到项目；右键jar文件，添加到项目
        //2.注册驱动
        // 方式1：直接引用Driver类
        Driver driver = new Driver();//静态加载。灵活性差，依耐性强

        //3.获得连接
        String url = "jdbc:mysql://localhost:3306/mydat?serverTimezone=GMT%2B8&useSSL=false";
        //获取配置文件的数据
        Properties properties = new Properties();
        //注意：user和password是接口规定，不可自定义
        properties.setProperty("user", "root");
        properties.setProperty("password", "111111");
        Connection connect = driver.connect(url, properties);

        //4.操作数据库
        String sql = "insert into per(name,age) values('dd',12)";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//受影响行数
        System.out.println("第一种方式：（受影响行数）"+rows);
        //5.关闭连接
        statement.close();
        connect.close();
    }
    @Test
    public void connect02() throws Exception {
        //方式2：使用反射
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");//动态加载
        Driver o =(Driver) aClass.newInstance();
        //3.获得连接
        String url = "jdbc:mysql://localhost:3306/mydat?serverTimezone=GMT%2B8&useSSL=false";
        //获取配置文件的数据
        Properties properties = new Properties();
        //注意：user和password是接口规定，不可自定义
        properties.setProperty("user", "root");
        properties.setProperty("password", "111111");
        Connection connect = o.connect(url, properties);

        //4.操作数据库
        String sql = "insert into per(name,age) values('dd',12)";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//受影响行数
        System.out.println("第二种方式：（受影响行数）"+rows);
        //5.关闭连接
        statement.close();
        connect.close();
    }
    public void connect03() throws Exception{
        //方式3：使用反射手动注册
        Class<?> aClass = Class.forName("com.mysql.cj.jsbc.Driver");
        Driver o =(Driver) aClass.newInstance();
        //创建url
        String url="jdbc:mysql://localhost:3306/mydat?serverTimezone=GMT%2B8&useSSL=false";
        String user="root";
        String password="111111";
        DriverManager.registerDriver(o);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第三种连接方式："+connection);
        connection.close();
    }
    @Test
    //常见使用
    public void connect04() throws Exception {
        //方式4：使用反射自动完成注册驱动（简化代码）
        Class.forName("com.mysql.cj.jdbc.Driver");
        /*使用反射触发Driver的静态代码块
        static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }
        * */
        String url="jdbc:mysql://localhost:3306/mydat?serverTimezone=GMT%2B8&useSSL=false";
        String user="root";
        String password="111111";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第四种连接方式："+connection);
        connection.close();
    }
@Test
    public void connect05() throws Exception {
    //最终常用方法：使用反射和配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);//可不写此句，在高版本jdbc中会自动加载（libs/mysql-connector-java.jar/META-INF/services/java.sql.Driver）
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("推荐使用：（建立连接）"+connection);
    }
}
