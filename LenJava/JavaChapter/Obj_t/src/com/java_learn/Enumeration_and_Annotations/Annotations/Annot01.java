package com.java_learn.Enumeration_and_Annotations.Annotations;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 注解的使用，重写和过时
 */

public class Annot01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        A01 a01 = new A01();
        a01.f1();//f1标记了已经过时，不推荐使用；但是可以使用
    }
}
class A01{

    public int a=0;
    @Deprecated//可用于类，成员和局部变量
    public void  f1(){

    }
}
class A02 extends A01{

    @Override//重写只能用于方法
    public void f1() {
        super.f1();
    }
}