package com.java_learn.jdbc_.connectionPool;

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
 * @Summary 使用Apache-DBUtils和德鲁伊连接池的方式,实现crud
 */
public class UseApacheDBUtils {
    public static void main(String[] args) throws SQLException {
        //1.得到连接
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用Apache-DBUtils，引入commons-dbutils.jar包并且加入项目库
        //3.创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        UseApacheDBUtils useApacheDBUtils = new UseApacheDBUtils();

//      crud操作
        useApacheDBUtils.APDBUtils_select(connection, queryRunner);
//        useApacheDBUtils.APDBUtils_insert(connection,queryRunner);
//        useApacheDBUtils.APDBUtils_delete(connection,queryRunner);
//        useApacheDBUtils.APDBUtils_update(connection,queryRunner);

//        返回单行数据,使用BeanHandler
        useApacheDBUtils.APDBUtils_ReturnSingle(connection, queryRunner);
//            返回单行单列数据，使用ScalarHandler
        useApacheDBUtils.ApacheDBUtils_ReturnScalar(connection, queryRunner);

        JDBCUtilsByDruid.close(null, null, connection);
    }

    public void APDBUtils_select(Connection connection, QueryRunner queryRunner) throws SQLException {
        String sql = "select * from l827 where id<=?";
        /**
         * 解读：
         * query执行sql语句得到resultset结果集，将其封装到ArrayList;返回集合
         * （1）connection:连接
         * （2）sql：执行的sql语句
         * （3）BeanListHandler<>(Actor.class):将resultset -->封装Actor对象 -->ArrayList
         *        底层通过反射获取Actor的属性进行封装
         * （4）1：即为给sql第一个？赋值，可有多个值（因为参数是可变参数：Object...params）
         * （5）底层会关闭ResultSet和PreparedStatement资源
         */
        //由于返回的结果集为多条数据所以使用BeanListHandler
        List<Actor> query = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 10);
        System.out.print("BeanListHandler多行数据集：");
        for (Actor actor : query) {
            System.out.println(actor);
        }


    }

    public void APDBUtils_insert(Connection connection, QueryRunner queryRunner) {
        String sql = "insert into l827(name,pass,sex,age) values('h','12h','男',12)";
        try {
            int query = queryRunner.update(connection, sql);
            System.out.println(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void APDBUtils_delete(Connection connection, QueryRunner queryRunner) {
        String sql = "delete from l827 where id>?";
        try {
            int query = queryRunner.update(connection, sql, 3);
            System.out.println(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void APDBUtils_update(Connection connection, QueryRunner queryRunner) {
        String sql = "update l827 set name=? where id=? ";
        try {
            int query = queryRunner.update(connection, sql, "hahah", 43504);
            System.out.println(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //返回单行结果
    public void APDBUtils_ReturnSingle(Connection connection, QueryRunner queryRunner) throws SQLException {
        String sql = "select * from l827 where id=?";
        BeanHandler<Actor> actorBeanHandler = new BeanHandler<>(Actor.class);
        Actor query = queryRunner.query(connection, sql, actorBeanHandler, 1);

        System.out.println("BeanHandler单行数据返回：" + query);
    }

    //返回单行单列
    public void ApacheDBUtils_ReturnScalar(Connection connection, QueryRunner queryRunner) throws SQLException {
        String sql = "select name from l827 where id=?";
        ScalarHandler scalarHandler = new ScalarHandler();
        Object query = queryRunner.query(connection, sql, scalarHandler, 1);
        System.out.println(query);
    }

}
