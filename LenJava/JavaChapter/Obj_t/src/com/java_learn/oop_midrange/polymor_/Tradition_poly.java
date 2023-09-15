package com.java_learn.oop_midrange.polymor_;

public class Tradition_poly {
    public static void main(String[] args) {
        /*
        传统方法实现多态问题：
        新增类，必须新增方法
        形参类型固定，不能灵活使用
         */
        Master master=new Master("汤姆");
        Cat cat=new Cat("布偶猫");
        Dog dog=new Dog("金毛");
        Fish fish=new Fish("小鱼干");
        Bone bone=new Bone("骨头");
        master.show(cat,fish);
        System.out.println("===============");
        master.show(dog,bone);
    }
}
