package com.loy.log;

import org.springframework.stereotype.Service;

@Service
public class TestBean {

    public void test(){
        int i=10/0;
    }
}
