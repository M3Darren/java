package com.java_learn.oop_midrange.polymor_.arr;

public class Arr_poly {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Student("jack", 21, 151);
        arr[1] = new Student("luss", 20, 125);
        arr[2] = new Teacher("tom", 32, 23111);
        for (int i = 0; i < arr.length; i++) {
            arr[i].say();
            "sds".equals("sad");
//调用子类特有方法
            if (arr[i] instanceof Student) {
                ((Student) arr[i]).learn();
            } else if (arr[i] instanceof Teacher) {
                ((Teacher) arr[i]).teach();
            } else {
                System.out.println("类型有误");
            }
            System.out.println("========");
        }
    }
}
