package com.java_learn.commonly_used_class.Date_Calender_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary LocalDate方法
 */
public class LocalDate_met {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        //DateTimeFormatter格式化
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
        System.out.println(dtf.format(ldt));
        //获取单独字段
        System.out.println("年"+ldt.getYear());
        System.out.println("月"+ldt.getMonthValue());
        System.out.println("日"+ldt.getDayOfMonth());
        System.out.println("时"+ldt.getHour());
        System.out.println("分"+ldt.getMinute());
        System.out.println("秒"+ldt.getSecond());

        //其他方法
        LocalDateTime pludt=ldt.plusDays(122);
    }
}
