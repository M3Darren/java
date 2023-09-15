package com.loy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Cart {
//    购物车模型
    private int totalCount;
    private BigDecimal totalPrice;
    private Map<Integer,CartItem> items=new LinkedHashMap<Integer,CartItem>();

    public void addItem(CartItem cartItem){
        //先查看当前购物车是否有该商品，有则直接数量加一
        CartItem cartItem1 = items.get(cartItem.getId());
        if(cartItem1==null){
//            表示购物车没有此商品
            items.put(cartItem.getId(),cartItem);
        }else{
//            购物车已有该商品
                    cartItem1.setCount((cartItem1.getCount())+1);
                    cartItem1.setTotalPrice(cartItem1.getPrice().multiply(new BigDecimal(cartItem1.getCount())));//得到该商品总金额
        }
    }
    public void deleteItem(int id){
        items.remove(id);
    }
    public void clear(){
        items.clear();
    }
    public void updateItem(int id,int count){
//        检查是否有该商品，有则该数量，更新总价格
        CartItem cartItem = items.get(id);
        if(cartItem!=null){
            cartItem.setCount(count);
            cartItem.setTotalPrice(cartItem.getPrice().multiply(new BigDecimal(cartItem.getCount())));
        }
    }

    public Cart() {
    }

    public Cart(int totalCount, BigDecimal totalPrice, Map<Integer,CartItem> items) {
        this.totalCount = totalCount;
        this.totalPrice = totalPrice;
        this.items = items;
    }


    public int getTotalCount() {
        totalCount=0;
        for (Map.Entry<Integer,CartItem> entry : items.entrySet()){
            totalCount+=entry.getValue().getCount();
        }
        return totalCount;
    }



    public BigDecimal getTotalPrice() {
        totalPrice=new BigDecimal(0);
        for (Map.Entry<Integer,CartItem> entry : items.entrySet()){
            totalPrice=totalPrice.add(entry.getValue().getTotalPrice());
        }
        return totalPrice;
    }



    public Map<Integer,CartItem> getItems() {
        return items;
    }

    public void setItems(Map<Integer,CartItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "totalCount=" + getTotalCount() +
                ", totalPrice=" + getTotalPrice() +
                ", items=" + items +
                '}';
    }
}
