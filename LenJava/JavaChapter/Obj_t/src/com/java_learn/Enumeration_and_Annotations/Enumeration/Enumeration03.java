package com.java_learn.Enumeration_and_Annotations.Enumeration;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用enum实现枚举类
 */
public class Enumeration03 {
    public static void main(String[] args) {

    }
}
enum Season03{

    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","萧条"),
    WINTER("冬天","寒冷")
    ;
    /*enum实现枚举类：
    1.私有化构造器
    2.使用get方法，禁用set方法
    3.枚举需要放在第一行，每个常量间用逗号隔开

     */
    private String name;
    private String desc;

    Season03(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season03{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}