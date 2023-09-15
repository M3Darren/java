package com.java_learn.oop_advanced.final_;

public class FinalDetail {
    public static void main(String[] args) {
        //final static搭配使用不会触发类加载
        System.out.println(A.n);
    }
}
class A{
    public static final int n=10;//静态常量只能在定义或者静态代码块赋值
    private final int n1;
static {
    System.out.println("A类静态代码块");
}
    public A() {
        n1=100;
    }
}
 final class B extends A{

}
