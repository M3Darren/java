package com.loy.boot.config;

import com.loy.boot.domain.Cat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


/**
 * 配置类使用@Bean向容器注册组件，默认单实例
 * proxyBeanMethods：代理bean的方法
 *      Full（proxyBeanMethods=true）：组件间有依赖关系
 *      Lite（proxyBeanMethods=false）：组件间无依赖关系
 */
@Configuration(proxyBeanMethods = true)//告诉SpringBoot这是一个配置类，等同于配置文件
public class MyConfig {
    @Bean("cat")
    /**
     * 向容器添加组件，默认以方法名作为bean的id
     * 当注释有值则以定义的值为主
     * 返回值：组件在容器中的实例
     */
    @ConditionalOnBean(name = "catAu")
    public Cat catBu(){
        return new Cat(1,"小布","布偶");
    }
    public Cat catAu(){
        return new Cat(1,"小蓝","蓝猫");
    }
}
