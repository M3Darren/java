package com.java_learn.file_.reader_writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary FileWriter
 */
public class FileWr {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter("./src/src",true);
            fileWriter.write("这里是追加的内容：aaa");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
