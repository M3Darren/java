package com.java_learn.Enumeration_and_Annotations.Enumeration;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 自定义枚举的使用，创建对象繁琐，引出enum实现枚举：（Enumeration03.java）
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Sanson01.SPRING);
        System.out.println(Sanson01.SUMMER);
        System.out.println(Sanson01.AUTUMN);
        System.out.println(Sanson01.WINTER);
    }
}
class Sanson01{
    private String name;
    private String desc;

    public static final Sanson01 SPRING=new Sanson01("春天","生机盎然");
    public static final Sanson01 SUMMER=new Sanson01("夏天","炎炎烈日");
    public static final Sanson01 AUTUMN=new Sanson01("秋天","萧条");
    public static final Sanson01 WINTER=new Sanson01("冬天","漫天飞雪");
    //上述创建对象较为繁琐，引出enum实现枚举：（Enumeration03.java）


    /*自定义实现枚举：
    1.私有化构造器，放置new
    2.去除set方法，这样可控制只能读取不能修改
    3.在类里面直接创建固定对象
     */
    private Sanson01(String name, String desc) {
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
        return "Sanson01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}