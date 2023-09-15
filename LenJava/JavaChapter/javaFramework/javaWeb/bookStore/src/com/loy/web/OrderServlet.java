package com.loy.web;

import com.loy.pojo.Cart;
import com.loy.service.impl.OrderService;
import com.loy.utils.JdbcUtilsByDruid;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderServlet extends BasicServlet{
    private OrderService orderService=new OrderService();
    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        得到购物车对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");
//        获取用户登录的id
        String orderId = null;

            orderId = orderService.createOrder(cart, 1);//若该方法里有异常，会出现生成订单，但是没有订单项

        req.setAttribute("orderId",orderId);
        req.getRequestDispatcher("/pages/orderList.jsp").forward(req,resp);
    }
}
