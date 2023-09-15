package com.java_learn.oop_advanced.interface_;



public class ExtendsVsInterface {
    public static void main(String[] args) {
        /**
         * 当一个人继承了父类之后
         * 后天需要学习技能提升自己，使用接口便可以实现
         * 不必要求父类重新新增技能
         */
        Child_I og = new Child_I(21, "OG");
        og.study_java();
        og.talk();
        og.play_teen();
    }
}
class Father{
   private int age;
   private String name;
    public Father(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void talk(){
        System.out.println("走路技能");
    }
}
interface Learn{
    //子类可通过接口学习技能
    void study_java();
}
interface  Play{
    //子类通过娱乐接口，正在打网球
    void play_teen();
}
/**
 * 此时继承父类，并且实现Learn接口提升java技能
 * 同时实现Play接口打网球
 */

class Child_I extends Father implements Learn,Play{
    public Child_I(int age, String name) {
        super(age, name);
    }
    @Override
    public void study_java() {
        System.out.println("子类在使用接口学习java");
    }

    @Override
    public void play_teen() {
        System.out.println("正在打网球。。。");
    }
}