package com.java_learn.oop_midrange.exercises;

public class Hw01_ObjArr {
    public static void main(String[] args) {
        /*
        定义Person类{name，age，job)初始化Person数组，三个元素，
        按照age从小到大排序
         */
        Person[] arr=new Person[3];
        Person tmp;
        arr[0]=new Person(21,"jack","manager");
        arr[1]=new Person(13,"lucy","student");
        arr[2]=new Person(1,"toma","master");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=0;j< arr.length-1-i;j++){
                if(arr[j].getAge()>arr[j+1].getAge()){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getAge()+"\t"+arr[i].getName()+"\t"+arr[i].getJob());
        }
    }

}
class Person{
    private int age;
    private String name;
    private String job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}