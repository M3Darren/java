package com.java_learn.reflection.classload_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 类加载三阶段【验证-准备-解析】
 */
public class ClassLoadThreePhase {
    public static void main(String[] args) {

    }
}

class VerificationPhase {
    public int n=10;//不是静态变量，不会默认初始化
    public static int n1=11;//是静态变量，会默认初始化为0
    public static final int n2=111;//常量，初始化即为所赋的值
}


