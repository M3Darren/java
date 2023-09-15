package com.loy.mybatisplus;

import com.loy.mybatisplus.entity.Employee;
import com.loy.mybatisplus.entity.User;
import com.loy.mybatisplus.service.IEmployeeService;
import com.loy.mybatisplus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestService {
    @Autowired
    private IUserService userService;
    @Autowired
    private IEmployeeService employeeService ;

    @Test
    public void testUser(){

        User user = userService.getById(775946262);
        Employee employee = employeeService.getById(12);
        System.out.println(user);
        System.out.println(employee);
    }

}
