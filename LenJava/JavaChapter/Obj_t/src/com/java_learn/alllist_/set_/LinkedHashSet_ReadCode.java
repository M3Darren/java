package com.java_learn.alllist_.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class LinkedHashSet_ReadCode {
    public static void main(String[] args) {
        /*
        需求：
        定义Car类，如果name和price相同则添加失败
         */
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add(new Car("bwm",120000));
        linkedHashSet.add(new Car("audi",110000));
        linkedHashSet.add(new Car("bwm",120000));

        System.out.println(linkedHashSet);

    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
