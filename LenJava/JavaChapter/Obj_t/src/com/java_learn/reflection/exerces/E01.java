package com.java_learn.reflection.exerces;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class E01 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.java_learn.reflection.exerces.PriTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"aa");
        Method getName = aClass.getDeclaredMethod("getName");

        System.out.println(  getName.invoke(o));
    }
}
class PriTest{
    private String name="kitt";

    public String getName() {
        return name;
    }
}
