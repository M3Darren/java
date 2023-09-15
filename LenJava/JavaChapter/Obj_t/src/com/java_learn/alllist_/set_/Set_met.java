package com.java_learn.alllist_.set_;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary HashSet的方法
 */
public class Set_met {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);
        set.remove("aaa");
        System.out.println(set);
        set.clear();
        System.out.println(set);

    }
}
