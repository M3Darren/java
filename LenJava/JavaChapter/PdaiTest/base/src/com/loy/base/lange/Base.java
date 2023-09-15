package com.loy.base.lange;

import com.loy.base.domain.Animate;

public class Base {
    public static void main(String[] args) {
        Animate zhangsan = new Animate(1, "zhangsan");
        Integer i1=100;
        Integer i2=100;
        Integer i3=200;
        Integer i4=200;
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
