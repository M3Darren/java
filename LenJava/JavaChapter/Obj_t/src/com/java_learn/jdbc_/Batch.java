package com.java_learn.jdbc_;

import JDBCUtils.JDBCUtils;


import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 批处理演示
 * 源码分析：
 *  public void addBatch(Object batch) {
 *         if (this.batchedArgs == null) {
 *             this.batchedArgs = new ArrayList();//创建ArrayList存放sql语句，到达指定值开始1.5倍扩容
 *         }
 *
 *         this.batchedArgs.add(batch);
 *     }
 *
 *         public void checkAllParametersSet() {//检查预处理参数
 *         for(int i = 0; i < this.bindValues.length; ++i) {
 *             this.checkParameterSet(i);
 *         }
 */
public class Batch {
    public static void main(String[] args) throws Exception {

        Connection connection = JDBCUtils.getConnection();
        String sql="insert into l827(name,pass) values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,""+i);
            preparedStatement.setString(2,"111"+i);

            //传统方式
//            preparedStatement.executeUpdate();
            //1.将语句加入批处理包
            preparedStatement.addBatch();
            //当加入100条数据开始批处理
            if((i+1)%1000==0){
                //2.执行批处理
                preparedStatement.executeBatch();
                //3.清空批处理包
                preparedStatement.clearBatch();
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println("批处理耗时："+(l1-l));
        JDBCUtils.close(null,preparedStatement,connection);

    }
}
