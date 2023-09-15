package com.java_learn.alllist_.list_;

import javax.smartcardio.ATR;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary list集合排序
 */
public class ListExercise {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book("平凡的世界","路遥",112.2));
        list.add(new Book("活着","余华",90.1));
        list.add(new Book("三国演义","罗贯中",142.2));

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j <list.size()-i-1 ; j++) {
                Book book1=(Book) list.get(j);
                Book book2=(Book) list.get(j+1);
                if(book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
        for (Object o:list){
            System.out.println(o);
        }

    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
