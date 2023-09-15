package com.loy.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.ISqlSegment;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.loy.mybatisplus.mapper.UserMapper;
import com.loy.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("张三");
        user.setAge(12);
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
    @Test
    public void testDelete(){
        /*int i = userMapper.deleteById(11);
        System.out.println(i);*/
     /*Map<String, Object> map = new HashMap<>();
        map.put("name","张三");
        int i1 = userMapper.deleteByMap(map);
        System.out.println(i1);*/
//        批量删除
        int i2 = userMapper.deleteBatchIds(Arrays.asList(12, 13, 14));
        System.out.println(i2);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(17);
        user.setName("haha");
        int i = userMapper.updateById(user);
        System.out.println(i);

    }

}
