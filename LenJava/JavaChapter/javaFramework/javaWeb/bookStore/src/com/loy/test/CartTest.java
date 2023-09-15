package com.loy.test;

import com.loy.pojo.Cart;
import com.loy.pojo.CartItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CartTest {
private static Cart cart=new Cart();
static {
    cart.addItem(new CartItem(1,"shijianjianshi",2,new BigDecimal(12.22)));
    cart.addItem(new CartItem(2,"pingfandeshijie",1,new BigDecimal(112)));
}
    @Test
    public void addItem() {
        cart.addItem(new CartItem(1,"shijianjianshi",2,new BigDecimal(12.22)));
        cart.addItem(new CartItem(2,"pingfandeshijie",1,new BigDecimal(112)));
        System.out.println(cart);
    }

    @Test
    public void deleteItem() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void updateItem() {

        System.out.println(cart);
    }
}