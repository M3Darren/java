package com.loy.mybatis.mapper;

import com.loy.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     * @return
     */
    int insertUser();

    /**
     * 更新用户信息
     */
    int updateUser();

    /**
     * 删除用户
     * @return
     */
    int deleteUser();

    /**
     * 查询用户
     */
    User getUserById();

    /**
     * 查询用户列表
     */
    List<User> userList();
}
