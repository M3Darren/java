package com.loy.sangeng_demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestSysMenuMapper {

    @Autowired
    SysMenuMapper sysMenuMapper;
    @Test
    public void testSysMenu(){
        List<String> strings = sysMenuMapper.selectMenuByUserId(1L);
        System.out.println(strings);
    }
}
