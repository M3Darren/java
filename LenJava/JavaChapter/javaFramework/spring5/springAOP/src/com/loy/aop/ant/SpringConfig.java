package com.loy.aop.ant;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.loy.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启生成代理对象
public class SpringConfig {
}
