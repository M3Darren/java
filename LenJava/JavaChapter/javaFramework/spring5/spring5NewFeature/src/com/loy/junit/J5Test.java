package com.loy.junit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:springconfig.xml")
//@SpringJUnitConfig(locations = "classpath:springconfig.xml")
public class J5Test {
@Autowired
    private Ju ju;
    @Test
    public void  test(){
        ju.test();
    }
}
