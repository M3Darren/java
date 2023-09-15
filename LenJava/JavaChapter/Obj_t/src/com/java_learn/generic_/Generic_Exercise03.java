package com.java_learn.generic_;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_Exercise03 {
    public static void main(String[] args) {
        Dao<User> userDao = new Dao<>();
        userDao.save("zhangsan",new User(1,12,"zhangsan"));
        userDao.save("lisi",new User(2,14,"lisi"));
        System.out.println(userDao.map);
        for (User list: userDao.list()){
            System.out.println(list.getName());
        }
    }
}
class Dao<T>{
    public HashMap<String,T> map=new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    @Test
    public List<T> list(){
        List<T> ts = new ArrayList<>();
        Set<String> strings = map.keySet();
        for (String k: strings){
            ts.add(map.get(k));
        }
        return ts;
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}