package com.loy.sangeng_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loy.sangeng_demo.domain.User;
import com.loy.sangeng_demo.mapper.UserMapper;
import com.loy.sangeng_demo.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author echoXiaoDai
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2023-09-04 16:15:39
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




