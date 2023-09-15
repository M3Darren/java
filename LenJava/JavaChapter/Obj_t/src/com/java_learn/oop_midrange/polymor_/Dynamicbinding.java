package com.java_learn.oop_midrange.polymor_;

public class Dynamicbinding {
    public static void main(String[] args) {
        A a=new B();

        System.out.println(a.sum());/*30;此时A类的sum中的getI()发生动态绑定。即为getI()会绑定为运行类型;即为B下的getI();若没有，遵循向上查找*/
        System.out.println(a.sum1());
    }
}
class A{
    public int i=10;
    public int sum(){
        return getI()+10;
    }
    public int getI(){
        return i;
    }
    public int sum1(){
        return getI()+20;
    }
}
class B  extends A{
    public int i=20;
    /* public int sum(){
         return getI()+20;
     }*/
    public int getI(){
        return i;
    }
    public int sum1(){
        return getI()+10;
    }
}
