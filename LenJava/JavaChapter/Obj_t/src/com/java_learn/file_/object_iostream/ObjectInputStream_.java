package com.java_learn.file_.object_iostream;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./src/src_obj"));
        //读取顺序一定要和写入顺序一致
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readInt());
//        System.out.println(ois.readObject());//注意：此时返回的Object类型是不可以操作对象的，必须引入Car类才能向下转型
       Car car=(Car)ois.readObject();//转型后可对对象操作
        System.out.println(car.name);
        ois.close();
    }
}
