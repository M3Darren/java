package com.java_learn.Enumeration_and_Annotations.Enumeration;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary enum枚举类的成员方法
 */
public class enum_MemberMethod {
    public static void main(String[] args) {
        //name()方法返回该常量名
        System.out.println(Emm.FID.name());
        //ordinal()方法返回该常量编号，默认从0开始
        System.out.println(Emm.MOD.ordinal());
        //values()方法返回枚举对象数组
        Emm[] arr= Emm.values();
        for (Emm i : arr){//增强for循环
            System.out.println(i);
        }
        //valuesOf()方法，将字符串转换成枚举对象，前提该字符串已经在枚举类中；否则异常
        System.out.println(Emm.valueOf("MOD"));
        //compareTo方法比较两个常量位置编号，返回 前者编号-后者编号
        System.out.println(Emm.MOD.compareTo(Emm.MOD));
    }
}
enum Emm{
    MOD,FID,UPD;
}
