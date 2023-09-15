package com.java_learn.oop_midrange.polymor_;

public class Method_poly {
    public static void main(String[] args) {
        /*
        重写和重构体现了方法的多态
         */
        Animal animal=new Animal("gou");
        animal.over_load();
        Cat cat=new Cat("buou");
        cat.over_ride();
    }
}
