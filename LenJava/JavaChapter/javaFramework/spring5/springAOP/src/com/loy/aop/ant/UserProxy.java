package com.loy.aop.ant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Service
@Aspect//生成代理对象
public class UserProxy {//增强类

//    抽取相同切入点
  /*  @Pointcut(value = "execution(* com.loy.aop.ant.User.add(..))")
    public void point(){}
    @Before(value = "point()")
    public void beforeNotice() {
        System.out.println("前置通知");
    }*/


    //    配置前置通知
    @Before(value = "execution(* com.loy.aop.ant.User.add(..))")
    public void beforeNotice() {
        System.out.println("前置通知");
    }

    //    配置后置通知
    @AfterReturning(value = "execution(* com.loy.aop.ant.User.add(..))")
    public void finallyNotice() {
        System.out.println("后置通知");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.loy.aop.ant.User.add(..))")
    public void throwNotice() {
        System.out.println("异常通知");
    }

    //    环绕通知
    @Around(value = "execution(* com.loy.aop.ant.User.add(..))")
    public void aroundNotice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知前");
//调用切入点
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知后");
    }

    //最终通知
    @After(value = "execution(* com.loy.aop.ant.User.add(..))")
    public void afterNotice() {
        System.out.println("最终通知");
    }

}
