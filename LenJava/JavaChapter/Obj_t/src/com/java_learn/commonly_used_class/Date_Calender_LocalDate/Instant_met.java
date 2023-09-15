package com.java_learn.commonly_used_class.Date_Calender_LocalDate;

import java.time.Instant;
import java.util.Date;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 将Instant对象转换成Date对象
 */
public class Instant_met {
    public static void main(String[] args) {
        Instant ins=Instant.now();
        System.out.println(ins);
        //使用from转换
        Date dt=Date.from(ins);
        System.out.println(dt);
        //使用roInstant将Date转换成Instant
        Instant ins2=dt.toInstant();
        System.out.println(ins2);
    }
}
