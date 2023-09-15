package com.java_learn.alllist_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Exercise_03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        //更改jack工资为2600元
        hashMap.put("jack",2600);

        Set set = hashMap.keySet();
            for (Object o: set){
               hashMap.put(o,(Integer)(hashMap.get(o))+100);
                System.out.println(o+"-"+hashMap.get(o));
            }
    }
}

