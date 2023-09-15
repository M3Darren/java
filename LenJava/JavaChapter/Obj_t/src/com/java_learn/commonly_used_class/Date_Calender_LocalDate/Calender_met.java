package com.java_learn.commonly_used_class.Date_Calender_LocalDate;

import java.util.Calendar;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary Calender的方法
 */
public class Calender_met {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);//会输出对象所有字段
//        获取某个字段
        System.out.println("年"+c.get(Calendar.YEAR));
        System.out.println("月"+c.get(Calendar.MONTH+1));//按照0开始的
        System.out.println("日"+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时"+c.get(Calendar.HOUR));
        System.out.println("分"+c.get(Calendar.MINUTE));
        System.out.println("秒"+c.get(Calendar.SECOND));
    }
}
