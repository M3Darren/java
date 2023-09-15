package com.java_learn.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 非捕获分组
 */
public class NonCaptureGroup {
    public static void main(String[] args) {
        String context="平凡之路是由路遥写的平凡的世界拍成的电视剧";
        String reg="平凡(?:之路|的世界)";//此时不加?:也可以实现该模式匹配
//        String reg="平凡(?=之路|的世界)";//此时返回的结果只有平凡
//        String reg="平凡(?!之路|的世界)";//此时返回的结果只有不是平凡之路和平凡的世界中的平凡
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(context);
        while (matcher.find()){
            System.out.println(matcher.group(0));
            //注意此时只能使用0为索引，使用1报错
        }

    }
}
