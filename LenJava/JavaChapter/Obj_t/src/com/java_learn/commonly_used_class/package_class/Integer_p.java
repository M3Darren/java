package com.java_learn.commonly_used_class.package_class;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 装箱。拆箱其他包装类相似；以int<---->Integer为例
 */
public class Integer_p {
    public static void main(String[] args) {
             //jdk5之前：
        int  n=100;
        //手动装箱
        Integer in=new Integer(n);//方法1
        Integer in1=Integer.valueOf(n);//方法2
        //手动拆箱
        int i=in.intValue();

            //jdk5之后：自动拆装箱底层实现就是手动拆装箱
        int a=200;
        //自动拆箱
        Integer in2=a;
        //自动拆箱
        int a2=in2;

    }
}
