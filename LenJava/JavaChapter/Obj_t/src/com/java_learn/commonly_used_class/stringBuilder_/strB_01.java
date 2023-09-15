package com.java_learn.commonly_used_class.stringBuilder_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 测试String、StringBuffer、StringBuilder执行效率
 */
public class strB_01 {
    public static void main(String[] args) {
        String str="";
        StringBuffer buffer=new StringBuffer();
        StringBuilder builder=new StringBuilder();

        long start_time=0;
        long end_time=0;

        start_time=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str+=i;
        }
        end_time=System.currentTimeMillis();
        System.out.println("string run time:"+ (end_time-start_time));



        start_time=System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            buffer.append("s");
        }
        end_time=System.currentTimeMillis();
        System.out.println("buffer run time:"+ (end_time-start_time));



        start_time=System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            builder.append("s");
        }
        end_time=System.currentTimeMillis();
        System.out.println("builder run time:"+ (end_time-start_time));
    }
}
