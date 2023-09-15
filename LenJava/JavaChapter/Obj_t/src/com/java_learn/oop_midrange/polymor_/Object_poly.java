package com.java_learn.oop_midrange.polymor_;

public class Object_poly {
    public static void main(String[] args) {
        /*
        对象的多态：
        打破传统方法实现多态
       对象多态更加灵活
         */
        Master master=new Master("汤姆");
        Animal animal=new Dog("阿拉斯加");
        Food food=new Bone("狗粮");
        master.show(animal,food);
        //此时区别明显，当再次变化动物类和食物类；show()方法不需要再次被重载
        System.out.println("=================");
        Animal animal1=new Cat("银渐层");
        Food food1=new Food("猫条");
        master.show(animal1,food1);
    }
}
