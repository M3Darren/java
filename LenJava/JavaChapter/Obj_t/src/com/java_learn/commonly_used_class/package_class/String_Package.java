package com.java_learn.commonly_used_class.package_class;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary String和包装类的转换
 */
public class String_Package {
    public static void main(String[] args) {
        //Integer -> String
        Integer i=100;
        String s1=i+"";//方法1
        String s2=i.toString();//方法2
        String s3=String.valueOf(i);//方法3

        //String -> Integer
        String s="123";
        Integer i1=Integer.parseInt(s);//方法1
        Integer i2=new Integer(s);//方法2
    }
}
