package com.java_learn.oop_midrange.exercises;
public class Hw05_zonghe {
    public static void main(String[] args) {
        Pers[] pers=new Pers[4];
        Pers tmp=null;
        pers[0]=new Stu("李华","男",12,"20169022");
        pers[1]=new Stu("李芸","女",14,"20169022");
        pers[2]=new Tea("史密斯","男",32,12);
        pers[3]=new Tea("路易斯","女",30,10);

        for (int i = 0; i < pers.length-1 ; i++) {
            for (int j=0;j< pers.length-i-1;j++){
                if(pers[j].getAge()<pers[j+1].getAge()){
                    tmp=pers[j];
                    pers[j]=pers[j+1];
                    pers[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i < pers.length; i++) {
            System.out.println(pers[i].getAge());
        }

    }
}
class Pers{
    private String name;
    private String sex;
    private int age;
public Pers(){}
    public Pers(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play(){
        return "爱玩";
    }
    public void showinfo(Pers p){
        System.out.println("姓名："+p.getName()+"\n"+"年龄："+p.getAge());
        if (p instanceof Tea){
            System.out.println("工龄："+((Tea) p).getWork_age());
            ((Tea) p).teach();

        }else if (p instanceof Stu){
            System.out.println("学号："+((Stu) p).getStu_id());
           ((Stu) p).study();

        }
        System.out.println(p.play());
    }
}
class Stu extends Pers {
    private String stu_id;

    public Stu(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习的");
    }

    @Override
    public String play() {
        System.out.println("---------学生---------");
        return this.getName()+super.play()+"足球";
    }
}
class Tea extends Pers{
    private int work_age;

    public Tea(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会好好教学");
    }

    @Override
    public String play() {
        System.out.println("------教师-----------");
        return this.getName()+super.play()+"象棋";
    }
}