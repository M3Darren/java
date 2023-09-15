package com.java_learn.commonly_used_class.Arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用Comparator接口匿名内部类实现需求
 */
public class Practice {
    public static void main(String[] args) {

        //需求：（从小到大，从大到小）
        //按照书价格排序
        //按照书名长度排序
        System.out.println("==========方法一使用自定义方法======");
       Comparator c1=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer) o1;
                int i2=(Integer) o2;
                return i1-i2;
            }
    };
        Comparator c2=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double i1=(Double) o1;
                double i2=(Double) o2;
                return (int) (i1-i2);
            }
        };
        Book[] arr=new Book[4];
        arr[0]=new Book(12.2,"红楼梦");
        arr[1]=new Book(11.2,"活着");
        arr[2]=new Book(120.2,"平凡的世界");
        arr[3]=new Book(10.2,"java技术卷");

        //方法一：使用自定义的排序方法实现
        Book.SortingOfBookPrice(arr,c2);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].price);
        }
        Book.SortingOfBookTitle(arr,c1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].name);
        }

        //方法二：使用Array自带的sort方法实现Comparator
        System.out.println("==========方法二使用sort=======");
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1=(Book) o1;
                Book b2=(Book) o2;
                return (int)(b1.price-b2.price);
            }
        });
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1=(Book) o1;
                Book b2=(Book) o2;
                return (b1.name.length()-b2.name.length());
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
class Book{
    public Double price;
    public String name;

    public Book(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public static   void SortingOfBookTitle(Book[] obj, Comparator c){
        Book tmp=null;
        for (int i = 0; i <obj.length-1; i++) {
            for (int j = 0; j <obj.length-1-i ; j++) {
                if(c.compare(obj[j].name.length(),obj[j+1].name.length())>0){
                    tmp=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=tmp;
                }
            }
        }

    }
    public static   void SortingOfBookPrice(Book[] obj,Comparator c){
        Book tmp;
        for (int i = 0; i <obj.length-1; i++) {
            for (int j = 0; j <obj.length-1-i ; j++) {
                if(c.compare(obj[j].price,obj[j+1].price)>0){
                    tmp=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=tmp;
                }
            }
        }
    }

}
