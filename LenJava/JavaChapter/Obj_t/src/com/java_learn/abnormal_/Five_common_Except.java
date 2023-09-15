package com.java_learn.abnormal_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 四个常见的异常处理
 */
public class Five_common_Except {
    public static void main(String[] args) {
        E01.NullPointerF();
        E01.ArrayIndexOutOfF();
        E01.ClassCaseF();
        E01.NumberFormatF();
    }
}
class E01{
    private static String name=null;
    public static void NullPointerF(){
        //空指针异常
        try {
            System.out.println(E01.name.length());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ArrayIndexOutOfF(){
        //数组索引越界
        int[] arr={1,2,3};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void ClassCaseF(){
        //类转型异常
        class A{}
        class B extends A{}
        class C extends A{}

        A b = new B();//向上转型
        B a=(B)b;//向下转型
        try {
            C c=(C)b;//C和B无关系，都是A的子类
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void NumberFormatF(){
        String name="asd";
        int a= 0;
        try {
            a = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println(a);
    }
}