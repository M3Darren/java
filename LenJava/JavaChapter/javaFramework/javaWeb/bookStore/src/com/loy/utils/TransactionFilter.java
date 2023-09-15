package com.loy.utils;

import javax.servlet.*;
import java.io.IOException;

public class TransactionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//            使用Filter管理事务，这将使匹配的资源都会执行事务
        try {
            filterChain.doFilter(servletRequest,servletResponse);
            JdbcUtilsByDruid.commitAndClose();//提交事务
        } catch (Exception e) {
            JdbcUtilsByDruid.rollbackAndClose();//回滚事务
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {

    }
}
