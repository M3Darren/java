package com.java_learn.commonly_used_class.Date_Calender_LocalDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary Date类的方法
 */
public class Date_met {
    public static void main(String[] args) throws ParseException {
        Date dt=new Date();
        System.out.println(dt.getTime());

//        SimpleDateFormat()格式化日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
        System.out.println(sdf.format(dt));

        //把字符串转成日期
        String s="2022-01-01 10:10:00 星期一";//注意格式化必须和sdf对象的格式一致
        Date pase=sdf.parse(s);
        System.out.println(sdf.format(pase));
    }
}
