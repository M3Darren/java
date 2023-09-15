package com.java_learn.alllist_.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class TreeSet_met {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String) o2);
            }
        });
        treeSet.add("dsa");
        treeSet.add("sdasa");
        treeSet.add("vdsa");
        System.out.println(treeSet);
    }
}
