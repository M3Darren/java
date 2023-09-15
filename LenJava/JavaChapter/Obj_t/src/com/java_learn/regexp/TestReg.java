package com.java_learn.regexp;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class TestReg {
    public static void main(String[] args) {
        String context="-0.231";
        if(context.matches("-?([1-9]\\d*|0)\\.?\\d+")){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
