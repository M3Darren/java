package com.java_learn.Enumeration_and_Annotations.Enumeration;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 实现枚举一周
 */
public class Exercise01 {
    public static void main(String[] args) {
        Week[] arr=Week.values();
        for (Week i : arr){
            System.out.println(i.getName());
        }
    }
}
enum Week{
    MON("星期一"),
    WEN("星期二"),
    TUS("星期三"),
    TUR("星期四"),
    FRI("星期无"),
    SAN("星期六"),
    SAT("星期日"),
    ;

    private String name;

   private   Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
