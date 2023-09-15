package com.java_learn.file_.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 对比传统文件读取配置文件极其参数
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //传统方法
        //弊端：繁琐
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/src.properties"));
        String line="";
        while ((line=bufferedReader.readLine())!=null){
            String[] splits=line.split("=");
            System.out.println(splits[0]+"==>"+splits[1]);
        }
        bufferedReader.close();
    }
}
