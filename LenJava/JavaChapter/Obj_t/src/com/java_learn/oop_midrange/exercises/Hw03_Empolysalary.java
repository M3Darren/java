package com.java_learn.oop_midrange.exercises;

public class Hw03_Empolysalary {
    public static void main(String[] args) {
        Manager m=new Manager(200,365,"zhanghsan",1.2);
        m.setBonus(1000);
        System.out.println(m.printinfo());
        General g=new General(120,365,"lisi",1.1);
        System.out.println(g.printinfo());
    }
}
class Employee{
    private double day_salary;
    private  int day;
    private String name;
    private double level;
    private  double total_salary=day*day_salary;

    public Employee(double day_salary, int day, String name, double level) {
        this.day_salary = day_salary;
        this.day = day;
        this.name = name;
        this.level = level;
    }

    public double getDay_salary() {
        return day_salary;
    }

    public void setDay_salary(double day_salary) {
        this.day_salary = day_salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getTotal_salary() {
        return total_salary;
    }

    public void setTotal_salary(double total_salary) {
        this.total_salary = total_salary;
    }

    public String printinfo(){
        return "姓名："+this.name+"\t日工资："+this.day_salary+"\t工作天数："+this.day+"\t结算："+this.total_salary;
    }
}
class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(double day_salary, int day, String name, double level) {
        super(day_salary, day, name, level);
    }

    @Override
    public String printinfo() {
        System.out.println("---------经理-----------");
        this.setTotal_salary(this.getDay_salary()*this.getDay()*this.getLevel()+this.bonus);
        return super.printinfo();
    }
}
class General extends Employee{
    public General(double day_salary, int day, String name, double level) {
        super(day_salary, day, name, level);
    }

    @Override
    public String printinfo() {
        System.out.println("--------普通员工-----------");
        this.setTotal_salary(this.getDay_salary()*this.getDay()*this.getLevel());
        return super.printinfo();
    }
}
class Work extends Employee{
    public Work(double day_salary, int day, String name) {
        super(day_salary, day, name,1);
    }

    @Override
    public String printinfo() {
        return super.printinfo();
    }
}
class Teachers extends Employee{
    private double lesson_salary;
    public Teachers(double day_salary, int day, String name, double level) {
        super(day_salary, day, name, level);
    }

    public double getLesson_salary() {
        return lesson_salary;
    }

    public void setLesson_salary(double lesson_salary) {
        this.lesson_salary = lesson_salary;
    }

    @Override
    public String printinfo() {
        this.setTotal_salary(this.getTotal_salary()+this.getDay()*this.lesson_salary);
        return super.printinfo();
    }
}