package com.loy.sangeng_demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.loy.sangeng_demo.domain.LoginUser;
import com.loy.sangeng_demo.domain.User;
import com.loy.sangeng_demo.mapper.SysMenuMapper;
import com.loy.sangeng_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        查询用户信息
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUserName,username);
        User user = userMapper.selectOne(wrapper);
//        判断查询结果是否有用户
        if(Objects.isNull(user)){
            throw new RuntimeException("用户名或密码错误");
        }
//        查询权限信息
//        List<String> list = Arrays.asList("user");
//        从数据库中获取权限
        List<String> authenticateList = sysMenuMapper.selectMenuByUserId(user.getId());
//        把数据封装到UserDetails返回
                return new LoginUser(user,authenticateList);
    }
}
