package com.java_learn.reflection.question;

import com.java_learn.reflection.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class ReflectionQue {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //传统的方式new对象-》
        Cat cat = new Cat();
        cat.hi();
//我们尝试做一做->明白反射
//1.使用Properties类，可以读写配置文件
        Properties properties= new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath= properties.get("classfullpath").toString();//"com.hspedu.Cat"
        String method =properties.get("method").toString();//"hi"
        System.out.println("classfullpath="+classfullpath);
        System.out.println("method="+method);
//new classfullpath();🔺注意classfullpath是String类型，不可以直接创建对象

//    2.使用反射实现
//    【1】加载类，返回Class类型的对象cls
    Class cls=Class.forName(classfullpath);
//    【2】通过cla得到加载类的对象实例
        Object o=cls.newInstance();
//     【3】通过cls得到类的method方法对象，反射机制中方法也视为对象
        Method med=cls.getMethod(method);
//        【4】通过med调用方法（即通过方法对象调用方法）
        System.out.println("通过配置文件调用方法：");
        med.invoke(o);//传统方法：对象.方法()  反射：方法.invoke(对象)
    }


}
