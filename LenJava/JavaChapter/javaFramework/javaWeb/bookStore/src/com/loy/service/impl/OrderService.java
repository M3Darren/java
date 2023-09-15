package com.loy.service.impl;

import com.loy.dao.impl.BookImpl;
import com.loy.dao.impl.OrderImpl;
import com.loy.dao.impl.OrderItemImpl;
import com.loy.pojo.*;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;
import java.util.Map;

public class OrderService{
    private OrderImpl order=new OrderImpl();
    private OrderItemImpl orderItem=new OrderItemImpl();
private BookImpl bookimpl=new BookImpl();
    public String createOrder(Cart cart,Integer userId){
        String orderId=System.currentTimeMillis()+""+userId;
//        创建订单
        Order order1 = new Order(orderId,new Date(),cart.getTotalPrice(),0,userId);
        int i = order.saveOrder(order1);
//        i=10/0;//设置异常，测试事务
//        将购物车商品项转化为订单项
        for (Map.Entry<Integer, CartItem> entry : cart.getItems().entrySet()){
            CartItem cartItem = entry.getValue();

            OrderItem orderItem1 = new OrderItem(null,cartItem.getName(),cartItem.getCount(),cartItem.getPrice(),cartItem.getTotalPrice(),orderId);
            orderItem.saveOrderItem(orderItem1);

//            结账后将库存，销量更新
            Book bookById = bookimpl.queryBookById(cartItem.getId());
            bookById.setSales(bookById.getSales()+ cartItem.getCount());
            bookById.setStock(bookById.getStock()-cartItem.getCount());
            bookimpl.updateBook(bookById);
        }
//        将结账的商品从购物车删除
        cart.clear();
        return orderId;
    }
}
