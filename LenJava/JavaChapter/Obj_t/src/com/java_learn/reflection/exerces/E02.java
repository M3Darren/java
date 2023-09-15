package com.java_learn.reflection.exerces;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class E02 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        Object o = declaredConstructor.newInstance("./src/reflection_Access_CreateFile.txt");
        Method createNewFile = aClass.getDeclaredMethod("createNewFile");
        createNewFile.invoke(o);
        System.out.println(o.getClass()+"文件创建成功");
    }
}
