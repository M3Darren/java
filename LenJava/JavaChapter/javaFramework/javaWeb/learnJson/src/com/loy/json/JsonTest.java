package com.loy.json;

import com.google.gson.Gson;


import com.google.gson.reflect.TypeToken;
import com.loy.pojo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) {
        System.out.println("========javabean============");
        JsonTest.jsonCastJavaBean();
        System.out.println("========list============");
        JsonTest.jsonCastList();
        System.out.println("========map============");
        JsonTest.jsonCastMap();
    }

    public static void jsonCastJavaBean() {
        Person person = new Person("zhangsan", "nan");
        Gson gson = new Gson();
//javaBean转json
        String gsonStr = gson.toJson(person);
        System.out.println(gsonStr);

//        将json字符串转为javaBean
        Person person1 = gson.fromJson(gsonStr, Person.class);
        System.out.println(person1);
    }

    public static void jsonCastList() {
        ArrayList<Person> people = new ArrayList<>();
        Gson gson = new Gson();
        people.add(new Person("zhangsan", "nan"));
        people.add(new Person("meixue", "nv"));

//        list转json
        String gsonJson = gson.toJson(people);
        System.out.println(" list转json：" + gsonJson);

//        json转list
//        需要先定义类继承TypeToken
        Object o = gson.fromJson(gsonJson,new TypeToken<ArrayList<Person>>(){}.getType());
        System.out.println(o);
    }
    public static void jsonCastMap(){
        HashMap<Integer, Person> personHashMap = new HashMap<>();
        Gson gson = new Gson();
        personHashMap.put(1,new Person("zhangsan","nan"));

//        map转json
        String gsonStr = gson.toJson(personHashMap);
        System.out.println(gsonStr);
//        json转map需要创建类继承TypeToken
        Object o = gson.fromJson(gsonStr,new TypeToken<Map<Integer,Person>>(){}.getType());
        System.out.println(o);
    }
}
