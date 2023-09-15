package com.loy.mybatisplus;

import com.loy.mybatisplus.mapper.GoodsMapper;
import com.loy.mybatisplus.pojo.Goods;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class MbpLockTest {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void  testPriceUpdate(){
        //模拟修改冲突
//        小李查询商品价格
        Goods goodLi = goodsMapper.selectById(11);
        BigDecimal priceL=goodLi.getPrice();
        System.out.println(priceL);

//        小王查询商品
        Goods goodsWang = goodsMapper.selectById(11);
        BigDecimal priceW=goodsWang.getPrice();
        System.out.println(priceW);

//        小李修改价格
        goodLi.setPrice(new BigDecimal(50).add( priceL));
        goodsMapper.updateById(goodLi);
//        小王修改价格
        goodsWang.setPrice(priceW.subtract(new BigDecimal(30)));
        int i = goodsMapper.updateById(goodsWang);
        //判断小王操作是否生效
        if(i==0){
            //重新获取商品信息进行修改
            Goods goodsNew = goodsMapper.selectById(11);
            goodsNew.setPrice(goodsNew.getPrice().subtract(new BigDecimal(30)));
            goodsMapper.updateById(goodsNew);

        }
        Goods goodsBoss = goodsMapper.selectById(11);
        System.out.println(goodsBoss);
    }

}
