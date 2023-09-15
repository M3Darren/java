package com.java_learn.oop_advanced.codeblock;

public class CodeblockDetail03 {
    public static void main(String[] args) {
        Cbd03_child cbd03_child = new Cbd03_child();
    }
}
class CbD03{
    private static int n1=getn1();
    public static int getn1(){
        System.out.println("这里是父类getn1方法");
        return 100;
    }
    {
        System.out.println("这里是父类普通代码块");
    }
    static{
        System.out.println("这里是父类静态代码块");
    }
    public CbD03() {
        System.out.println("这里是父类构造器");
    }
}
class Cbd03_child extends CbD03{
    private static int n2=getn2();
    public static int getn2(){
        System.out.println("这里是子类getn2方法");
        return 200;
    }
    {
        System.out.println("这里是子类普通代码块");
    }
    static{
        System.out.println("这里是子类静态代码块");
    }
    public Cbd03_child() {
        System.out.println("这里是子 类构造器");
    }
}