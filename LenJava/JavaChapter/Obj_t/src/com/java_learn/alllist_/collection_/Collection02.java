package com.java_learn.alllist_.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用iterator方法和增强for 遍历集合
 */
public class Collection02 {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Book("java技术卷","gosling",111.2));
        col.add(new Book("java编程思想","Jams",451.2));
        col.add(new Book("java并发编程","Waill",121.2));
        col.add(new Book("java高级","Jaak",211.2));
        //使用iterator方法
        Iterator iterator=col.iterator();

        while (iterator.hasNext()) {//判断下一个元素是否存在
            Object next =  iterator.next();//指针指向下一个元素
            System.out.println(next);
        }
        //如果想再次遍历，需要重新指向开头，即重新申明
        iterator=col.iterator();


        //增强for遍历集合元素
        System.out.println("=====增强for========");
        for(Object books:col){
            System.out.println(books);
        }
    }
}
class Book{
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
