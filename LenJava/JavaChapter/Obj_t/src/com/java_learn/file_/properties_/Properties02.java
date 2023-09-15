package com.java_learn.file_.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用Properties读写文件
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("./src/src.properties"));//将文件内容加载到properties对象
        properties.list(System.out);//将对象信息输出到控制台
        //获取key对应的value
        String ip= properties.getProperty("IP");
        String un= properties.getProperty("username");
        System.out.println("ip地址为："+ip);
        System.out.println("username为："+un);
    }
}
