package com.java_learn.commonly_used_class.string;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary String类的理解
 */
public class String_lj {
    public static void main(String[] args) {
         final char[] value={'a','a','c'};
         value[1]='s';
         char[] a={'a','s'};
//         value=a;由于被final修饰所以不能改变其地址
    }
}
