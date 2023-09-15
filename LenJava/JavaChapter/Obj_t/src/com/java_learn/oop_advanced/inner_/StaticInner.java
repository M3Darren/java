package com.java_learn.oop_advanced.inner_;

public class StaticInner {
    public static void main(String[] args) {
        S_Outer s_outer = new S_Outer();
        //方法1
        s_outer.innerInstance().S_met();
        //方法2
        S_Outer.S_Inner s_inner = new S_Outer.S_Inner();
        s_inner.S_met();

    }
}
class S_Outer{
    private static int a=10;
    private int b=20;
    static class S_Inner{
        private int a=30;
        public void S_met(){
            System.out.println("这是静态内部类的方法;访问同名外部属性a"+S_Outer.a);
        }
    }
    public S_Inner innerInstance(){
        return new S_Inner();
    }
}