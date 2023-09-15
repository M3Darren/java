package com.java_learn.alllist_.list_;

import java.util.Vector;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
@SuppressWarnings({"all"})
public class Vector_ReadCode {
    public static void main(String[] args) {
        Vector vector=new Vector();
        for (int i = 0; i < 13; i++) {
            vector.add(i);
        }
        vector.add(null);
        System.out.println(vector );
    }
}
