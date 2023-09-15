package com.java_learn.commonly_used_class.BigInteger_BigDecimal_;

import java.math.BigInteger;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary BigInteger类的使用（处理整数）
 */
public class BigInteger01 {
    public static void main(String[] args) {

        BigInteger bigInteger=new BigInteger("11111111111111111111111");
        System.out.println(bigInteger);
        BigInteger b1=new BigInteger("100");
        //add("数字")对BigInteger类型进行加法操作
        System.out.println(bigInteger.add(b1));
        //subtract 减法
        System.out.println(bigInteger.subtract(bigInteger));
        //multiply 乘法
        System.out.println(bigInteger.multiply(b1));
        //divide 除法
        System.out.println(bigInteger.divide(b1));
    }
}
