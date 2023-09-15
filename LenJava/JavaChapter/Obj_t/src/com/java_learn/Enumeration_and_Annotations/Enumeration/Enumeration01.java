package com.java_learn.Enumeration_and_Annotations.Enumeration;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 用不合理方法解决需求，引出枚举（Enumeration02.java）
 */
public class Enumeration01 {
    public static void main(String[] args) {
    //需求：季节类,需要四个季节对象
        Season season = new Season("春天", "生机盎然");
        Season season1 = new Season("夏天", "炎炎烈日");
        Season season2 = new Season("秋天", "一片萧条");
        Season season3 = new Season("冬天", "满天飞雪");
        Season season4 = new Season("白天", "很随意");//此时显然不合适
        //问题：可自定义季节，不符合季节有限且固定


    }
}
class Season{
    private String name;
    private String dsc;

    public Season(String name, String dsc) {
        this.name = name;
        this.dsc = dsc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }
}