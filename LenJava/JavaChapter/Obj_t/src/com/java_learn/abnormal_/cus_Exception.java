package com.java_learn.abnormal_;

import java.util.Scanner;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 自定义异常类
 */
public class cus_Exception {
    public static void main(String[] args) {
        AgeException.met();
    }
}
class AgeException extends RuntimeException{//继承运行时异常

    public AgeException(String message) {//使用构造器输出错误信息
        super(message);
    }
    public static void met(){
        System.out.println("请输入年龄（1~120）：");
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if(age<1 || age >120){
            throw new AgeException("年龄不在范围内");//可自定义错误信息
        }
    }
}