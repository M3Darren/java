package com.java_learn.file_.in_output_stream_r_w;

import java.io.*;
import java.nio.Buffer;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary  字节转换流：将字符流转为字节流(转换成gbk格式编码）
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
       /* InputStreamReader isr=new InputStreamReader(new FileInputStream("./src/src"),"gbk");
        BufferedReader br=new BufferedReader(isr);//写法一*/

        //写法二：
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("./src/src"),"gbk"));//由于存储utf8，所以输出乱码

        String s=br.readLine();
        s+=br.readLine();
        System.out.println(s);
        br.close();

    }
}
