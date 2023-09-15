package com.java_learn.file_.buffer;

import java.io.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用BufferedInputStream字节处理流
 */
public class BufferedIpt {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        byte[] buff=new byte[1024];
        int Len=0;
        bis=new BufferedInputStream(new FileInputStream("./src/github.png"));
        bos=new BufferedOutputStream(new FileOutputStream("./src/github_copy.png"));
        while ((Len=bis.read(buff))!=-1){
            bos.write(buff,0,Len);
        }
        System.out.println("拷贝完毕");
        bis.close();
        bos.close();

    }
}
