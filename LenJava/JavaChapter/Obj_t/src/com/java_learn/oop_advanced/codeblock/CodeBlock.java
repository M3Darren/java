package com.java_learn.oop_advanced.codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        /**
         * 静态代码块调用时机
         */
//        new Block("ok");
        System.out.println("===================");
//        B1 aa = new B1("aa");
        System.out.println("===================");
//        System.out.println(B1.num);
        System.out.println("=============");

    }
}
class Block{
    private String name;
    private int height;
    private  int weight;
    static {
        System.out.println("这里是父类静态代码块");
    }
    {
        //可以把构造器中的重复语句抽离到这里
        System.out.println("这里是父类普通代码块执行");
    }

    public Block(String name) {
        System.out.println("name有参构造器");
        this.name = name;
    }

    public Block(String name, int height) {
        System.out.println("name,height构造器");
        this.name = name;
        this.height = height;
    }

    public Block(String name, int height, int weight) {

       this(name,height);
        System.out.println("代码块");
        this.weight = weight;
    }
}
class B1 extends Block{
    static {
        System.out.println("这里是子类静态代码块");
    }
    {
        System.out.println("这里是子类普通代码块");
    }
    public static int num=0;

    public B1(String name) {
        super(name);
    }

}