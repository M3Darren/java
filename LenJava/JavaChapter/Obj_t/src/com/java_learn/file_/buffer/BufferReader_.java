package com.java_learn.file_.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class BufferReader_ {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("./src/src"));
            String line;
            //按行读取
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();//只需关闭外层流(BufferedReader)，底层会关闭里层节点流（FileReader)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
