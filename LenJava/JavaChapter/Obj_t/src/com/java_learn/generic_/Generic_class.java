package com.java_learn.generic_;

import java.sql.Array;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_class {
    public static void main(String[] args) {
        Gen<String, Integer> stringIntegerGen = new Gen<>();
        stringIntegerGen.met("asd",12);
    }
}
class Gen<T,R>{
    T name;
    R age;
    public void met(T aa,R bb){
        System.out.println("aa:"+aa.getClass()+"\n"+bb.getClass());
    }
    //    此时会编译报错，静态方法不允许使用类的泛型
    //    public static <K> void met1(T a,R b){}
    //     使用泛型的数组不能被   初始化
//        T[] arr=new Array(9);
}