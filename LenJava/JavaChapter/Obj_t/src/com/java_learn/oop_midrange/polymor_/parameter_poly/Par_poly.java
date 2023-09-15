package com.java_learn.oop_midrange.polymor_.parameter_poly;

public class Par_poly {
    public static void main(String[] args) {
        Employee[] arr=new Employee[3];
        arr[0]=new Worker("张三",10000);
        arr[1]=new Worker("李四",15000);
        arr[2]=new Manager("王五",40000,5000);
        (new Par_poly()).showAnnual(arr);
    }

    public void showAnnual(Employee[] arr){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] instanceof Manager){
                ((Manager)arr[i]).manage();
            } else if (arr[i] instanceof Worker) {
                ((Worker)arr[i]).work();
            }
            System.out.println(arr[i].getAnnual());
            System.out.println("=================");
        }
    }
}
