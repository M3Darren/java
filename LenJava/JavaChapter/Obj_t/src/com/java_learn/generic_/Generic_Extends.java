package com.java_learn.generic_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_Extends {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<G1> g1s = new ArrayList<>();
        ArrayList<G2> g2s = new ArrayList<>();
        ArrayList<G3> g3s = new ArrayList<>();

        //T1可以传入任意泛型的list
        T1(objects);
        T1(strings);

        //T2只能接收G1或其子类的list
//        T2(objects);报错，类型不在范围
        T2(g1s);

        //T3只能接收G2或者其父类
//        T3(g3s);报错显示，类型不在范围，因为G3是G2的子类
        T3(objects);
    }
    public static void T1(List<?> list){}//表示可以使用任意类型
    public static void T2(List<? extends G1> list){}//表示可以使用G1或其子类
    public static void T3(List<? super G2> list){}//表示可以使用G2或其父类

}
class G1{}
class G2 extends G1{}
class G3 extends G2{}
