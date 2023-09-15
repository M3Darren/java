package com.loy.loyhellospringbootstarterautoconfiguration.auto;

import com.loy.loyhellospringbootstarterautoconfiguration.HelloProperties;
import com.loy.loyhellospringbootstarterautoconfiguration.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)//默认将该文件放入容器中，
public class ServiceAutoConfiguration {
    @ConditionalOnMissingBean(HelloService.class)//容器中没有该类，才自动配置进容器，这就是为什么不直接放入容器原因
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
