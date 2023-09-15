package com.java_learn.alllist_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Exercise_02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("BWM",400000));
        arrayList.add(new Car("Audi",340000));

        for (Object o: arrayList){
            System.out.println(o);
        }
        System.out.println("=====迭代器=====");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}