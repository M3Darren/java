package com.java_learn.oop_advanced.inner_;

public class LocalInner {
    public static void main(String[] args) {
        /**
         * 局部内部类使用
         */
        L_Outer lOuter = new L_Outer();
        lOuter.m2();
    }
}
class L_Outer {
    private int o_n=10;
    private void m1(){
        System.out.println("这里是外部类LocalOuter的m1方法");
    }
    public void m2(){
        System.out.println("这里是外部类LocalOuter的m2方法");
        class LocalInner{//局部内部类不能使用修饰符，可以使用final
            private int i_n=20;
            private int o_n=100;
            //与外部类重名属性，调用遵循就近原则；
            // 若想访问外部类的o_n，可使用 外部类名.this.属性名 访问
            private void i_m(){
                System.out.println("这里是内部类LocalInner的i_m方法");
            }
            private void  showi_n(){
                System.out.println("外部类属性o_n："+o_n);//可以直接访问外部类
                System.out.println("外部类属性o_n："+ L_Outer.this.o_n);//使用外部类名.this.属性名访问同名属性
            }
        }
        LocalInner localInner = new LocalInner();//外部类访问内部类成员，需要实例化
        localInner.showi_n();
    }
}