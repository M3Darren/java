package com.java_learn.generic_;

import java.util.ArrayList;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小黑",5));
        arrayList.add(new Dog("小白",2));
        arrayList.add(new Cat("小花",1));//此时不会报错
        //传统方式：遍历集合中的对象
        for (Object o:arrayList){//只能使用Object接受对象
//            Dog dog=(Dog) o;//此时输出会报错，类型错误
            System.out.println(
//                    dog
            );
        }

        //引入泛型
        ArrayList<Dog> dogs = new ArrayList<Dog>();//此时限定类型为Dog，
        dogs.add(new Dog("f_xiaohei",12));
        dogs.add(new Dog("f_xiaobai",1));
//        dogs.add(new Cat("f_xiaohua",2));//此时编译会报错，
        for (Dog d:dogs){//此时可以直接使用Dog接收对象，不用转型
            System.out.println(d.getName()+"-"+d.getAge());
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}