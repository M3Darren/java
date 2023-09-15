package com.loy.features;

import com.loy.loyhellospringbootstarterautoconfiguration.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeaturesApplicationTests {

    @Autowired
    HelloService helloService;
    @Test
    void contextLoads() {
        String s = helloService.sayHello("zhangsan");
        System.out.println(s);
    }

}
