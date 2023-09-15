package com.loy.spb_web.servlet.regist;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyRegistConfig {
    //    注册servlet
    @Bean
    public ServletRegistrationBean myServlet_R() {
        MyServlet_R myServlet_R = new MyServlet_R();
        return new ServletRegistrationBean(myServlet_R, "/my", "my01");
    }

    //    注册filter
    @Bean
    public FilterRegistrationBean myFilter_R() {
        MyFilter_R myFilter_R = new MyFilter_R();
//          方式一：相当于拦截myservlet的路径
//        return new FilterRegistrationBean(myFilter,myServlet());
//        方式二：自定义路径
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter_R);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my", "/uoy"));
        return filterRegistrationBean;
    }

    //    注册listener
    @Bean
    public ServletListenerRegistrationBean myListener_R() {
        MyListener_R myListener_R = new MyListener_R();
        return new ServletListenerRegistrationBean(myListener_R);
    }
}
