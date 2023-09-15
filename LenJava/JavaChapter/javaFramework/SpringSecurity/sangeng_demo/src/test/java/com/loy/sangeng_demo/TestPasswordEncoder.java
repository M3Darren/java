package com.loy.sangeng_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class TestPasswordEncoder {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Test
    public void testPasswordEncoder(){
        String encode = passwordEncoder.encode("123");
        boolean matches = passwordEncoder.matches("123", "$2a$10$Kbx5ttbIj1nmPiA5CkXeMOB.oBl94g15/.D9GKlMNB9TfkF7LtXg2");
        System.out.println(encode+"\n"+matches);
    }
}
