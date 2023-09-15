package com.loy.dao.impl;

import com.loy.dao.BasicDao;
import com.loy.pojo.Order;

public class OrderImpl extends BasicDao {
    public int saveOrder(Order order){
        String sql="insert into b_order values(?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }
}
