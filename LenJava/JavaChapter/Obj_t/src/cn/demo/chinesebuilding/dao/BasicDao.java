package cn.demo.chinesebuilding.dao;

import JDBCUtils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 通用dao文件，是其他dao的父类
 */
public class BasicDao<T> {
   private QueryRunner queryRunner =new QueryRunner();

   //通用增删改
    public int update(String sql,Object... parameters){
        Connection connection=null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            int rows=queryRunner.update(connection,sql,parameters);//返回受影响行数
            return rows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }


//查
    /**多行结果
     * //返回多个对象（sql语句返回多行数据）
     * @param sql  语句可以是有？的预处理语句
     * @param clazz 传入javabean的类，如Actor.class
     * @param parameters
     * @return
     */
    public List<T> queryMulti(String sql,Class<T>  clazz,Object... parameters){
        Connection connection=null;
        try {
            connection=JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection,sql,new BeanListHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //返回单行数据
    public T queryString(String sql,Class<T> clazz,Object... parameters){
        Connection connection=null;
        try {
            connection=JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection,sql,new BeanHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //返回单行单列数据
    public Object queryScalar(String sql,Object... parameters){
        Connection connection=null;
        try{
            connection=JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection,sql,new ScalarHandler(),parameters);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
}

