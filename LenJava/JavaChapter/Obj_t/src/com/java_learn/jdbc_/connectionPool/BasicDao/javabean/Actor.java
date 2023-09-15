package com.java_learn.jdbc_.connectionPool.BasicDao.javabean;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 存放resultset数据集；模拟ApacheDBUtils封装
 */
public class Actor {//叫法：Javabean，POJO，Domain对象
    private int id;
    private String name;
    private String password;
    private String sex;
    private int age;
    public Actor(){}
    public Actor(int id, String name, String sex, int age, String password){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.password=password;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "\nActor{"+"id='"+id+"',name='"+name+"',pass='"+password+"',sex='"+sex+"',age='"+age+"'}\n";
    }
}
