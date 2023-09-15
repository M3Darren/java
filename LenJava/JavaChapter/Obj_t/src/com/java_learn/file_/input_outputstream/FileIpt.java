package com.java_learn.file_.input_outputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 文件输入流（从磁盘读入内存）
 */
public class FileIpt {
    public static void main(String[] args) {
        FileIpt.Finput();
    }
    public static void Finput(){//字节流适用于二进制文件
        FileInputStream fileInputStream=null;
        int readEsc=0;
        try {
              fileInputStream = new FileInputStream("./src/src");
              while ((readEsc=fileInputStream.read())!=-1){
                  System.out.print((char)readEsc);//若文件有中文则会出现乱码
              }
        }catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
