package com.loy.jdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

//@Configuration
public class DruidConfig {
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        /**
         * 使用@ConfigurationProperties("spring.datasource")会自动将文件内容配置到数据源
         * druidDataSource.setUrl();
         * druidDataSource.setUsername();
         * druidDataSource.setPassword();
         */
        druidDataSource.setFilters("stat,wall");//开启监控页的sql统计功能,以及防火墙开启
        return druidDataSource;
    }

    /**
     * 配置druid监控页
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(statViewServlet,"/druid/*");
        return servletRegistrationBean;
    }

    //配置WebStatFilter用于采集Web-jdbc关联监控数据
    @Bean
    public FilterRegistrationBean webStatFilter(){
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        webStatFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));//监控所有请求
        webStatFilterFilterRegistrationBean.addInitParameter("exclusions","/static");//排除静态资源
        return webStatFilterFilterRegistrationBean;
    }
}
