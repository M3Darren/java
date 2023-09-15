package com.loy.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.loy.mybatisplus.entity.User;
import com.loy.mybatisplus.mapper.UserMapper;
import com.loy.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author loy
 * @since 2023-08-09
 */
@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
