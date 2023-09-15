package com.loy.shcxhc.service;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.loy.shcxhc.pojo.DataCenter;
import com.loy.shcxhc.pojo.User;
import com.loy.shcxhc.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private DataCenter dataCenter;

    public ResponseResult selectUserById(Long id) {
        //1、从redis查询商户缓存
        String shop = stringRedisTemplate.opsForValue().get("cache:shop:" + id);
        //2.判断是否存在
        if (StrUtil.isNotBlank(shop)) {
            //3.存在，直接返回
            User bean = JSONUtil.toBean(shop, User.class);
            return new ResponseResult(200, "success", bean);
        }

        //4.不存在，根据id查询数据库
        Map map = dataCenter.getMap();
        Object o = map.get(id);
        //5.不存在，返回466
        if (o == null) {
            return new ResponseResult<>(466, "error", "商户不存在");
        }

        //6.存在，写入redis
        stringRedisTemplate.opsForValue().set("cache:shop:" + id, JSONUtil.toJsonStr(o));
        //7.返回
        return new ResponseResult(200, "success", o);
    }

    public ResponseResult updateUserById(Long id) {
        //1、判断用户是否存在
        Map map = dataCenter.getMap();
        Object o = map.get(id);
        if (o==null){
            return new ResponseResult<>(466,"error","商户不存在");
        }
        //2.存在则更新数据库
        map.put(1,new User(1,"zhangsan","张三的商户修改了信息"));
        //3.删除缓存
        stringRedisTemplate.delete("cache:shop:"+id);
        return new ResponseResult(200,"success","更新成功");
    }
}
