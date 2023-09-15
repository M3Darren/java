package com.example.dxyz.utils;

import cn.hutool.core.util.ReUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestRegexUtils {
    @Test
    public void testRegex(){
        boolean phoneInvalid = RegexUtils.isPhoneInvalid("15527528190");
        System.out.println(phoneInvalid);
    }
}
