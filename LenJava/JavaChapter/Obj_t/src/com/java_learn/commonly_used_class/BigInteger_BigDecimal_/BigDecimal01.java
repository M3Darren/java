package com.java_learn.commonly_used_class.BigInteger_BigDecimal_;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 处理小数
 */
public class BigDecimal01 {
    public static void main(String[] args) {
//        方法同BigInteger
//        特别注意小数的除法运算，若除不尽会抛异常，使用以下方法解决
        BigDecimal bd=new BigDecimal("12.11111111111111111");
        BigDecimal b1=new BigDecimal("3");
        System.out.println(bd.divide(b1,BigDecimal.ROUND_CEILING));
        //保留分子的精度
    }
}
