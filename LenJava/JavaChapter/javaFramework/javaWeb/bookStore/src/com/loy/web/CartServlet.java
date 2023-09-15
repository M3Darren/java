package com.loy.web;

import com.loy.pojo.Book;
import com.loy.pojo.Cart;
import com.loy.pojo.CartItem;
import com.loy.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class CartServlet extends BasicServlet{
    private static BookServiceImpl bookService=new BookServiceImpl();
    private static Cart cart=new Cart();
    static {
        /*cart.addItem(new CartItem(1,"时间简史",2,new BigDecimal(124)));
        cart.addItem(new CartItem(2,"平凡的世界",1,new BigDecimal(112)));*/
    }
    public void addCart(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int i = Integer.parseInt(req.getParameter("id"));
        Book book = bookService.findBookById(i);
        CartItem cartItem = new CartItem(i, book.getName(), 1, book.getPrice());
        Cart cart = (Cart) req.getSession().getAttribute("cart");

        cart.addItem(cartItem);
        System.out.println(req.getHeader("Referer"));
        resp.sendRedirect(req.getHeader("Referer"));
    }
    public void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int i = Integer.parseInt(req.getParameter("id"));
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        cart.deleteItem(i);
        resp.sendRedirect(req.getHeader("Referer"));
    }
    public void updateItem(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int i = Integer.parseInt(req.getParameter("id"));
        int count = Integer.parseInt(req.getParameter("count"));
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        cart.updateItem(i,count);
        resp.sendRedirect(req.getHeader("Referer"));
    }
    public void clear(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        cart.clear();
        resp.sendRedirect(req.getHeader("Referer"));
    }
    public void getCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("cart",cart);
        req.getRequestDispatcher("/pages/cartList.jsp").forward(req,resp);
    }
}
