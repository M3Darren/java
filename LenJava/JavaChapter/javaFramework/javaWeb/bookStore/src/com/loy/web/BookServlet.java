package com.loy.web;

import com.loy.pojo.Book;
import com.loy.pojo.Page;
import com.loy.service.impl.BookServiceImpl;
import com.loy.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BasicServlet{
    private static BookServiceImpl bookService=new BookServiceImpl();
    public void getList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(bookService.bookList());
        req.setAttribute("bookList",bookService.bookList());
        req.getRequestDispatcher("/pages/bookList.jsp").forward(req,resp);
    }
    public void getFrontList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(bookService.bookList());
        req.setAttribute("bookList",bookService.bookList());
        req.getRequestDispatcher("/pages/goodsList.jsp").forward(req,resp);
    }

    public void addBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Book book = WebUtils.copyParamToBean(req, new Book());
        int i = bookService.addBook(book);

//        req.getRequestDispatcher("/bookList?action=getList").forward(req,resp);//防止刷新页面多次提交表单
        resp.sendRedirect(req.getContextPath()+"/bookList?action=getPage&pageNo=");
    }
    public void updateBook(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("param"));
        req.setAttribute("action","editBook");
        req.setAttribute("book", bookService.findBookById(id));
        req.getRequestDispatcher("/pages/addBook.jsp").forward(req,resp);
    }
    public void editBook(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        Book book = WebUtils.copyParamToBean(req, new Book());
        bookService.updateBook(book);
        resp.sendRedirect(req.getContextPath()+"/bookList?action=getPage");
    }
    public void getPage(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
//        判断是否为页面加载时请求页码
        int pageNo,pageSize;
        if(req.getParameter("pageNo")==null ){
            pageNo=1;
        }else{
            pageNo=Integer.parseInt(req.getParameter("pageNo"));
        }
        if(req.getParameter("pageSize")==null ){
            pageSize=4;
        }else{
            pageSize=Integer.parseInt(req.getParameter("pageSize"));
        }

        Page<Book> page = bookService.page(pageNo, pageSize);
        page.setUrl("bookList?action=getPage");
        req.setAttribute("page",page);
        req.getRequestDispatcher("/pages/bookList.jsp").forward(req,resp);


    }
}
