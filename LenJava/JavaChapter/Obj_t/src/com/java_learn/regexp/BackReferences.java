package com.java_learn.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 反向引用
 */
public class BackReferences {
    public static void main(String[] args) {
            String context="123 aa bb cc 1221 111";
            String reg="(\\d)\\1{2}";//表示匹配与第一位相同的三位数
//            String reg="(\\d)(\\d)\\1";//表示匹配形如aba的数字串
//            String reg="(\\d)(\\d)\\2\\1";//表示匹配形如abba的数字串
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(context);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }


        //外部反向引用
        String str="我...要要..学学学jjjaava 我喜欢jjavva开发";
        str=Pattern.compile("(\\.+)").matcher(str).replaceAll("");
        String cont=Pattern.compile("(.)\\1+").matcher(str).replaceAll("$1");
        //解释：将匹配到重复的项使用$1（表示将重复的项使用第一次出现时的字符替换）；
        System.out.println(cont);
    }
}
