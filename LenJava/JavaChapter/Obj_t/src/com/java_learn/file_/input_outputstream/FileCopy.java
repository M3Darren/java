package com.java_learn.file_.input_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {
            FileCopy.Fcopy();
    }
    public static void Fcopy(){
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        int readEsc=0;
        try {
            fileInputStream = new FileInputStream("./src/src");
            fileOutputStream=new FileOutputStream("./src/src_.txt");
            while ((readEsc=fileInputStream.read())!=-1){
                fileOutputStream.write((char)readEsc);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
