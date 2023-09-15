package com.loy.dao.intf;

import com.loy.pojo.User;

public interface UserDao{

    /**
     * 保存用户信息(注册使用)
     * @param user
     * @return
     */
    public int saveUser(User user);
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User queryUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUsernameAndPassword(String username,String password);


}
