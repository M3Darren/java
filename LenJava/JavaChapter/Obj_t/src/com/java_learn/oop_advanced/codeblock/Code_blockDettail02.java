package com.java_learn.oop_advanced.codeblock;

public class Code_blockDettail02 {
    public static void main(String[] args) {
        /**
         * super()
         * 隐式调用普通代码块
         * 构造器
         */
        CbD2_child1 cbD2_child1 = new CbD2_child1();

    }
}
class CbD2{
    {
        System.out.println("这里是父类的普通代码块");
    }

    public CbD2() {
        System.out.println("这里是父类构造器");
    }
}
class CbD2_child1 extends CbD2{
    {
        System.out.println("这里是子类的普通代码块");
    }
    public CbD2_child1() {
        super();//1.默认有可不写
        //2.此时隐式调用普通代码块
        System.out.println("这里是子类构造器");//3.构造器
    }
}