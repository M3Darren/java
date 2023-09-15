package com.loy.loyhellospringbootstarterautoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

//默认不放入容器，而是自动配置
public class HelloService {

    @Autowired
    HelloProperties helloProperties;
    public String sayHello(String username){
        return helloProperties.getPrefix()+":"+username+">"+helloProperties.getSuffix();
    }
}
