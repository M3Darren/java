package com.java_learn.alllist_;

import java.util.TreeSet;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 分析TreeSet和HashSet的去重和底层
 */
public class Exercise_04 {
    public static void main(String[] args) {
        //TreeSet:由于底层会调用Comparable的compareTo方法比较（所以如果没有实现Comparable接口的对象会报错类型异常。如下
        TreeSet treeSet = new TreeSet();
//        treeSet.add(new Person());//ClassCastException异常
        //HashSet：hashCode+equal（可自定义比较规则）遍历比较


    }
}
class Person{

}
