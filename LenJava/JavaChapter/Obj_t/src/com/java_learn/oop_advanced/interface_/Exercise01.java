package com.java_learn.oop_advanced.interface_;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        当继承的父类和实现的接口有同名属性时
         */
        Sub01 sub01 = new Sub01();
        sub01.showN();
    }
}
interface E01{
    int n=10;
}
class F01{
    public int n=20;
}
class Sub01 extends F01 implements E01{
    int n=100;
    public void showN(){
//        System.out.println(x);此时会编译失败，不能分辨n
//        System.out.println(this.n);不能使用this
        //只能使用以下方法，明确指出
        System.out.println(super.n);
        System.out.println(E01.n);
        System.out.println(this.n);
    }
}
