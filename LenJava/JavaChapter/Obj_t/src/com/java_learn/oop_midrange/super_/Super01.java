package com.java_learn.oop_midrange.super_;

public class Super01 {
    public static void main(String[] args) {
        C c=new C();
        c.info();
        c.showway();
    }
}
class S{
    public int n;
    protected int n1;
    private  int n2;
    public void f1(){
        System.out.println("S类f1方法");
    }
    protected void f2(){

    }
    private void  f3(){

    }
}
class  C extends S{
    public  void  f1(){
        System.out.println("C类f1方法");
    }
    public void info(){
        System.out.println("S类的属性："+super.n);
    }
    public void showway(){
        super.f1();//不会查找调用本类方法
    }
}
