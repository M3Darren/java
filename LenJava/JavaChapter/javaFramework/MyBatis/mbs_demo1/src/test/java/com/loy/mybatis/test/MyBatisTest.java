package com.loy.mybatis.test;

import com.loy.mybatis.mapper.UserMapper;
import com.loy.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyBatisTest {

    public   <T> T basicTestMyBatis(Class<T> tClass ){
//        加载核心配置文件
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        获取SqlSession,true自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        获取mapper接口对象
        T mapper = sqlSession.getMapper(tClass);
        return mapper;
    }

    @Test
    public void testUserMapper(){
        UserMapper userMapper = basicTestMyBatis(UserMapper.class);
//        userMapper.insertUser();
//        userMapper.updateUser();
        User user = userMapper.getUserById();
        System.out.println(user);
        List<User> users = userMapper.userList();
        System.out.println(users);
    }
}
