package com.java_learn.oop_advanced.inner_;
public class AnonymousInner {
    public static void main(String[] args) {
        /**
         * 匿名内部类使用
         */
        A_Outer a_outer = new A_Outer();
        a_outer.A_met();//匿名内部类实现
    }
}

class A_Outer {
    //需求：有多个类实现IA接口，但是每个类只使用一次

    //传统方法：创建多个类，实现show方法；这里创建了类Cat
    //问题：代码可用性不高，繁琐
    public void t_met() {
        Cat cat = new Cat();
        cat.show();
    }

    //匿名内部类实现：简化开发
    public void A_met() {
        /*
        cat 的编译类型：IA
        cat 的运行类型：匿名内部类
        *****解析运行类型******
        匿名内部类底层：
        class XXXX implements IA{//此XXXX即为系统分配类名，只有调用getClass方法可看；即为》》(外部类$1)
        public void show() {
                System.out.println("匿名内部类实现了show方法");
            }
        }
         */
        //基于接口的匿名内部类
        IA cat = new IA() {
            public void show() {
                System.out.println("匿名内部类实现了show方法");
            }
        };
        cat.show();
        System.out.println("匿名内部类的类名："+cat.getClass());

        //基于类的匿名内部类
        /*
        底层实现：
        class xxx extends  Bud{};  xxx为系统分配类名---》A_Outer$2
        运行类型：A_Outer$2
         */
        Bud bud = new Bud(){

        };
        bud.b_met();
        System.out.println("基于类实现的匿名内部类名："+bud.getClass());
    }
}
class Bud{
    public void b_met(){
        System.out.println("这是Bud类的b_met方法");
    }
}

interface IA {
    void show();
}

//传统实现方法创建Cat
class Cat implements IA {
    @Override
    public void show() {
        System.out.println("这里小猫实现了show方法");
    }
}

