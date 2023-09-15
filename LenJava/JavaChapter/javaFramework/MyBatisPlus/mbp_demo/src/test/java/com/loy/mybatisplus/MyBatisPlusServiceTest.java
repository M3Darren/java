package com.loy.mybatisplus;

import com.loy.mybatisplus.pojo.User;
import com.loy.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MyBatisPlusServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testGetCount(){
        long count = userService.count();
        System.out.println(count);
    }
    @Test
    public void testSaveBatch(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("loy"+i);
            user.setAge(i);
            users.add(user);
        }

        boolean b = userService.saveBatch(users);
        System.out.println(b);
    }
}
