package com.java_learn.regexp;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 字符串的替换分割
 */
public class StringMatches {
    public static void main(String[] args) {
//        字符串的替换
            String context="java8一直都是经典版本，尽管现在已经更新到java16、java18";
            context=context.replaceAll("java(\\d)+","java.x");
        System.out.println(context);
        //字符串的匹配
        context="15527528193";
        if(context.matches("1(5|3)\\d{9}")){
            System.out.println("ok");
        }else {
            System.out.println("fail");
        }

//        字符串的分割
        context="芝加哥-公牛#罗斯@1";
        String[] split=context.split("-|#|@");
        for (String s:split){
            System.out.println(s);
        }
    }
}
