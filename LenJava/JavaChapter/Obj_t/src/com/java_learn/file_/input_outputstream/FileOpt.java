package com.java_learn.file_.input_outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 文件输出流（从内存写入磁盘）
 */
public class FileOpt {
    public static void main(String[] args) {
        FileOpt.Foutput();
    }
    public static void Foutput(){
        //若没有找到目标文件，则自动创建文件
        FileOutputStream fileOutputStream =null;

        try {
            fileOutputStream= new FileOutputStream("./src/src",true);//设置true后以追加方式写入
//            fileOutputStream.write('H');//该方法只能写入一个字符
            String str="hello world";
            fileOutputStream.write(str.getBytes());//将字符串转成字符数组

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
