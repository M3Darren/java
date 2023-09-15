package com.java_learn.oop_advanced.inner_;

public class Exercise {
    public static void main(String[] args) {
        met(
                new Nu() {
                    @Override
                    public void show() {
                        System.out.println("这里通过匿名内部类作参数");
                    }
                }
        );
    }
    public static void met(Nu n){
        n.show();
    }
}
interface Nu{
   default void show(){
       System.out.println("这里是接口的方法");
   };
}
