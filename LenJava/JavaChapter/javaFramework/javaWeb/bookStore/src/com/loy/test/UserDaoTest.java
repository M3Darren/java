package com.loy.test;

import com.loy.dao.impl.UserImpl;
import com.loy.pojo.User;
import org.junit.Test;

public class UserDaoTest {
    UserImpl user = new UserImpl();

    @Test
    public void saveUser() {
        User admin = new User("admin1", "111", "3212@qq.com");
        user.saveUser(admin);

    }

    @Test
    public void queryUserByUsername() {
        System.out.println(user.queryUserByUsername("admiean"));
    }


    public void queryUserByUsernameAndPassword() {
    }
}