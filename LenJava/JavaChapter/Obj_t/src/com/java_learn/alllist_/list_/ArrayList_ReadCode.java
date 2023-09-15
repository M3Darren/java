package com.java_learn.alllist_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary ArrayList源码分析
 */
public class ArrayList_ReadCode {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        //使用有参构造器
        ArrayList list1=new ArrayList(6);
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
    }
}
