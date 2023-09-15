package com.loy.aop.proxy;

import com.loy.aop.dao.UserDao;
import com.loy.aop.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JdkProxy {//    jdk动态代理底层原理

    //    创建接口实现类代理对象
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
    /*方式一：使用匿名内部类实现
    Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return null;
        }
    });
    */

//    方式二：使用对象实现InvocationHandler接口
        UserDao userDao = (UserDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new UserDaoProxy(new UserDaoImpl()));
        System.out.println(userDao.add(1, 2));
    }

    static class UserDaoProxy implements InvocationHandler {

        //    代理对象
        private Object object;

        //将代理对象传入
        public UserDaoProxy(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //        需要增强的方法之前执行的代码
            System.out.println(method.getName() + "执行前输出；传递的参数：" + Arrays.toString(args));
//            被增强的方法执行
            Object invoke = method.invoke(object, args);

            //        需要增强的方法之前执行的代码
            System.out.println("方法执行之后" + object);

            return invoke;
        }
    }

}
