package com.java_learn.reflection.reflectionutils;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Utils {
    public static void main(String[] args) {

    }

    //第一组：java.lang.Class类
    @Test
    public void apiOne() {
        Class<P> pClass = P.class;
        //getName():获取全类名
        System.out.println(pClass.getName());
        //getSimpleName():获取简单类名
        System.out.println(pClass.getSimpleName());
        //getFields():获取所有public修饰的属性（包括本类以及父类
        Field[] fields = pClass.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        //getDeclaredFields():获取本类所有属性
        Field[] fields1 = pClass.getDeclaredFields();
        System.out.println("===获取所有属性===");
        for (Field field : fields1) {
            System.out.println(field.getName());
        }
        //getMethods():获取本类及父类public修饰的所有方法
        Method[] methods = pClass.getMethods();
        System.out.println("===获取本类以及父类所有方法===");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //getDeclaredMethods():获取本类所有方法
        Method[] declaredMethods = pClass.getDeclaredMethods();
        System.out.println("===获取本类所有方法===");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        //getConstructors():获取本类public修饰的构造器
        Constructor<?>[] constructors = pClass.getConstructors();
        System.out.println("===获取本类public修饰的构造器");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
        //getDeclaredConstructors():获取本类所有构造器
        Constructor<?>[] declaredConstructors = pClass.getDeclaredConstructors();
        System.out.println("===获取本类及父类所有构造器===");
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
        //getPackage():以Package形式返回包信息
        System.out.println(pClass.getPackage());
        //getSuperclass():以Class形式返回父类信息
        System.out.println(pClass.getSuperclass());
        //getInterfaces():以Class[]形式返回接口信息
        Class<?>[] interfaces = pClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        //getAnnotations():以Annotation[]形式返回注解信息
        Annotation[] annotations = pClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
    @Test
    //第二组：java.lang.reflect.Field类
    public void apiTwo(){
         //getModifiers():以int形式返回修饰符（默认：0、public：1、private：2、protected：4、static：8、final：16；若有多个则相加）
        //getType():以Class形式返回类型
        //getName:返回属性名
        Class<P> pClass = P.class;
        Field[] declaredFields = pClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("属性："+declaredField.getName()+";int类型修饰符："+declaredField.getModifiers()+";类型："+declaredField.getType());
        }
    }
    @Test
    //第三组：java.lang.reflect.Method类
    public void apiThree(){
        //getModifiers():以int形式返回修饰符（默认：0、public：1、private：2、protected：4、static：8、final：16；若有多个则相加）
        //getReturnType():以Class形式获取方法返回类型
        //getName:返回属方法名
        //getParameterTypes():以Class[]返回参数类型数组
        Class<P> pClass = P.class;
        Method[] methods = pClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("\n方法名："+methods[i].getName());
            Class<?>[] parameterTypes = methods[i].getParameterTypes();
            for (int i1 = 0; i1 < parameterTypes.length; i1++) {
                System.out.println("参数类型："+parameterTypes[i1].getName());
            }
        }
    }
}
interface IA{

}
interface IB{

}
class O implements IA{
    public String pre;

    public void o1() {

    }

    public O() {
    }
}
@Deprecated
class P extends O implements IB{
    public String name;
    protected int age;
    private double sal;
    String job;

    public P() {
    }

    private P(String name) {
        this.name = name;
    }

    public void f1() {

    }

    protected void f2() {

    }

    private void f3(String a, int b, Array c) {

    }

    void f4() {
    }
}
