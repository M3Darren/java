package cn.demo.chinesebuilding.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
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
public class JDBCUtilsByDruid {
   private static DataSource ds;
   static {
       Properties properties = new Properties();
       try {
           properties.load(new FileInputStream("src\\druid.properties"));
           ds= DruidDataSourceFactory.createDataSource(properties);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
   //获得连接的方法
   public static Connection getConnection() throws SQLException {
       return ds.getConnection();
   }
   //关闭连接的方法
    public static void close(ResultSet resultSet, Statement statement,Connection connection) {
       try{
           if(resultSet!=null)resultSet.close();
           if (statement!=null)statement.close();
           if(connection!=null)connection.close();//处理机制与jdbc原生不同，此处只是将连接放回池中
       }catch (SQLException e){
           throw new RuntimeException();
       }
    }

}
