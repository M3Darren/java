package com.java_learn.file_.object_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./src/src_obj"));
        oos.writeBoolean(true);
        oos.writeChar('a');//自动装箱Char--->Character
        oos.writeInt(100);//自动装箱Int--->Integer

        //注意序列化对象时必须实现Serializable
        oos.writeObject(new Car(100000,"Audi"));
        oos.close();
    }
}
class Car implements Serializable{
    float price;
    String name;

    public Car(float price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
