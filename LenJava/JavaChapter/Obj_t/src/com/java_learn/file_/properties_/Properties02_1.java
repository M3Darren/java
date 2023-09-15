package com.java_learn.file_.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用Properties类写文件
 */
public class Properties02_1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //向文件写入配置（修改同理，只需要修改对应key的value即可）
        //底层实现Hashtable,
        properties.setProperty("charset","utf-8");//若有中文则保存对应的字符编码
        properties.setProperty("useGroup","Admin");

        properties.store(new FileOutputStream("./src/src01.properties"),null);
        System.out.println("保存成功");
    }
}
