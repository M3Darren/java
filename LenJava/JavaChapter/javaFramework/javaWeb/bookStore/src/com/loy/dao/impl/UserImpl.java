package com.loy.dao.impl;

import com.loy.dao.BasicDao;
import com.loy.dao.intf.UserDao;
import com.loy.pojo.User;

public class UserImpl extends BasicDao<User> implements UserDao {
    @Override
    public int saveUser(User user) {
        String sql="insert into b_user values(null,?,?,?)";
        return update(sql,user.getUsername(),user.getEmail(),user.getPassword());
    }

    @Override
    public User queryUserByUsername(String username) {
        String sql="select * from b_user where username=?";
        return queryString(sql,User.class,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql="select * from  b_user where username=? and password=?";
        return queryString(sql,User.class,username,password);
    }
}
