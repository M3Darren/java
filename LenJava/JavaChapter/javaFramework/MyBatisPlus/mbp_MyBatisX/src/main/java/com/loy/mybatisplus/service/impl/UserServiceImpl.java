package com.loy.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loy.mybatisplus.domain.User;
import com.loy.mybatisplus.service.UserService;
import com.loy.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author echo 小戴
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-08-09 17:14:45
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




