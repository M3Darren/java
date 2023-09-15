package com.java_learn.regexp;

import java.util.regex.Pattern;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class BrowPrtten {
    public static void main(String[] args) {
            String str="ddaac322";
            String reg="dd.";
        System.out.println(Pattern.matches(reg,str));
    }
}
