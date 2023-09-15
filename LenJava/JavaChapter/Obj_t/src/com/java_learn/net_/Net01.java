package com.java_learn.net_;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 示例InetAddress类的方法
 */
public class Net01 {
    public static void main(String[] args) throws UnknownHostException {
            //获取InetAddress对象
        InetAddress localhost=InetAddress.getLocalHost();
        System.out.println(localhost);
        //根据主机名获取InetAddress对象
        InetAddress h1=InetAddress.getByName("echo小戴");
        System.out.println(h1);
        System.out.println("h1的主机地址："+h1.getHostAddress()+"h1的主机名："+h1.getHostName());
        //根据域名返回InetAddress对象
        InetAddress h2=InetAddress.getByName("www.baidu.com");
        System.out.println(h2);
    }
}
