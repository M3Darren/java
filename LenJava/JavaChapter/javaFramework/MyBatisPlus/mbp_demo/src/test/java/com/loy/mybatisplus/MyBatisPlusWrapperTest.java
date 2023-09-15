package com.loy.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.loy.mybatisplus.mapper.UserMapper;
import com.loy.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusWrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQueryWrapperForSelect() {
//        查询用户名包含a，年龄在20-80
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a")
                .between("age", 20, 80);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);

    }

    @Test
    public void testUpdateWrapperForUpdate() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 20)
                .ge("age", 100)
                .or().isNull("name");
        User user = new User();
        user.setName("张三");
        user.setAge(100);
        int update = userMapper.update(user, queryWrapper);
        System.out.println(
                update
        );
    }

    @Test
    public void testQueryWrapperForDelete() {
//        当有逻辑字段时不会删除数据库数据
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a");
        int delete = userMapper.delete(queryWrapper);
        System.out.println(delete);
    }

    @Test
    public void testOrder() {
//        查询信息，按年龄降序，若年龄相同按id升序排序
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age").orderByAsc("id");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }


    @Test
    public void testPriority() {
//        条件优先级：
//        情形一：条件1 and 条件2 or 条件3
//    queryWrapper.like("name", "a") .ge("age", 100)
//                .or().isNull("name");

//        情形二：条件1 and （条件2 or 条件3）
//    queryWrapper.like("name", "a") .and(wrapper->wrapper.ge("age", 100)
//                                   .or().isNull("name"));
        //优先级Lambda中的高，为情形二
    }

    @Test
    public void testSelectPartOfTheField(){
        //上述测试方法都是返回全列，该方法返回指定列
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name","age");
        List<Map<String,Object>> users = userMapper.selectMaps(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void testTheSubquery(){
        //in子查询
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("id","select id from user where id<20");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }



    @Test
    public void testUpdateWrapper(){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.like("name","a").and(
                wrapper->wrapper.gt("age",20).or().isNull("name")
        );
        updateWrapper.set("name","李四").set("age",30);
        int update = userMapper.update(null, updateWrapper);
        System.out.println(update);
    }

//    模拟业务处理
    @Test
    public  void  testLikeSelect(){
        String likeStr="a";
        Integer startAge=20;
        Integer endAge=100;
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(likeStr),"name",likeStr)
                .ge(startAge !=null,"age",startAge)
                .le(endAge!=null,"age",endAge);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }


    @Test
    public void testLambdaQueryWrapper(){
        String likeStr="a";
        Integer startAge=20;
        Integer endAge=100;
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(likeStr),User::getName,likeStr)
                .ge(startAge !=null,User::getAge,startAge)
                .le(endAge!=null,User::getAge,endAge);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void testLambdaUpdateWrapper(){
        LambdaUpdateWrapper<User> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.like(User::getName,"a").and(
                wrapper->wrapper.gt(User::getAge,20).or().isNull(User::getName)
        );
        updateWrapper.set(User::getName,"李四").set(User::getAge,30);
        int update = userMapper.update(null, updateWrapper);
        System.out.println(update);
    }
}
