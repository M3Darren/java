package com.loy.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loy.demo.domain.Users;
import com.loy.demo.mapper.UsersMapper;
import com.loy.demo.service.UsersService;
import org.springframework.stereotype.Service;

/**
* @author echoXiaoDai
* @description 针对表【users】的数据库操作Service实现
* @createDate 2023-09-03 09:22:38
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




