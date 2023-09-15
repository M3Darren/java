package com.loy.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//使用配置类，实现完全注解开发；不用xml配置文件
@Configuration//作为配置类，替代xml
@ComponentScan(basePackages = "com.loy.spring5")
public class SpringConfig {

}
