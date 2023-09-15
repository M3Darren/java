package com.java_learn.abnormal_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 算数异常
 */
public class Exception01 {
    public static void main(String[] args) {
        int n1=1;
        int n2=0;

        double f= 0;
        try {
            f = n1/n2;//此时程序仍然可以执行
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
        System.out.println(f);
    }
}
