package com.java_learn.oop_midrange.exercises;

public class Hw02_override {
    public static void main(String[] args) {
        Professor p=new Professor("zhangsna",23,"教授",22202,1.3);
        System.out.println( p.introduce());
        AssociateProfessor a=new AssociateProfessor("lisi",43,"副教授",12229,1.2);
        System.out.println( a.introduce());
        Lecturer l=new Lecturer("wangwu",53,"讲师",9990,1.1);
        System.out.println( l.introduce());
    }
}
class Teacher{
    private String name;
    private  int age;
    private  String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String introduce(){
        return "教师："+this.name+"\t年龄："+this.age+"\t职称："+this.post+"\t基本工资："+this.salary;
    }
}
class Professor extends Teacher{
    private double salary_level;

    public Professor(String name, int age, String post, double salary, double salary_level) {
        super(name, age, post, salary);
        this.salary_level = salary_level;
    }

    @Override
    public String introduce() {
        System.out.println("-----教授级---------");
      return super.introduce()+"\t工资级别："+this.salary_level;
    }
}
class AssociateProfessor extends Teacher{
    private double salary_level;

    public AssociateProfessor(String name, int age, String post, double salary, double salary_level) {
        super(name, age, post, salary);
        this.salary_level = salary_level;
    }

    @Override
    public String introduce() {
        System.out.println("---------副教授级--------");
        return super.introduce()+"\t工资级别："+this.salary_level;
    }
}
class Lecturer extends Teacher{
    private double salary_level;

    public Lecturer(String name, int age, String post, double salary, double salary_level) {
        super(name, age, post, salary);
        this.salary_level = salary_level;
    }

    @Override
    public String introduce() {
        System.out.println("--------讲师级---------");
        return super.introduce()+"\t工资级别："+this.salary_level;
    }
}