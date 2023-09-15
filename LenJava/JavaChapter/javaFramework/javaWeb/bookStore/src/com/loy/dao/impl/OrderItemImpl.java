package com.loy.dao.impl;

import com.loy.dao.BasicDao;
import com.loy.pojo.OrderItem;

public class OrderItemImpl extends BasicDao {
    public  int saveOrderItem(OrderItem orderItem){
        String sql="insert into b_order_item values(?,?,?,?,?,?)";
        return update(sql,null,orderItem.getName(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());
    }
}
