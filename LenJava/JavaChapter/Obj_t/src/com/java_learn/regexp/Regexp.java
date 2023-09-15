package com.java_learn.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Regexp {
    public static void main(String[] args) {
        String str="fdsfs范德萨范德萨发双方都23424sfdsf ssssss ddd dimt";
        Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)",Pattern.CASE_INSENSITIVE);//创建正则对象
        Matcher matcher = pattern.matcher(str);//创建匹配器
        /**
         * matcher.find()
         * 1.根据指定规则，定位满足规则的子字符串
         * 2.找到后，将子字符串开始索引记录到matcher对象的属性int[] groups
         *   group[0]=开始索引，group[1]=结束索引+1
         * 3.同时记录oldLast的值为group[1]，并且下次执行find时从oldLast位置执行
         */

        /**
         * matcher.group():
         *
         *    public String group(int group) {
         *         if (first < 0)
         *             throw new IllegalStateException("No match found");
         *         if (group < 0 || group > groupCount())
         *             throw new IndexOutOfBoundsException("No group " + group);
         *         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
         *             return null;
         *         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
         *     }
         * getSubSequence截取字符串[groups[0],groups[1]即为[0,4)，实现截取子串
         * 如果匹配对象有()小括号的形式（如：(\\d\\d)(\\d)）：
         * 1.首先将匹配到的整体开始和结束索引记录到groups[0]和groups[1]
         * 2.将(\\d\\d)匹配到的开始和结束索引记录到groups[2]和groups[3]
         * 3.往后以此类推，将每个小括号的起始和结束索引记录
         */
        while (matcher.find()){
            System.out.println("找到："+matcher.group(0));
        }
    }
}
