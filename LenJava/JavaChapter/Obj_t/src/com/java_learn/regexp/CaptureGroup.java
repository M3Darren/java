package com.java_learn.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 捕获分组的方式
 */
public class CaptureGroup {
    public static void main(String[] args) {
        String context = "daipain1233dsad3211";
        String reg = "(daipa)(i|n)";
//        String reg = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(context);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println("第一个分组:" + matcher.group(1));
//            System.out.println("g1分组:" + matcher.group("g1"));
            System.out.println("第二个分组:" + matcher.group(2));
//            System.out.println("g2分组:" + matcher.group("g2"));
        }
    }
}
