package com.java_learn.file_.reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 使用FileReader
 */
public class FileRr {
    public static void main(String[] args) {
        FileReader fileReader =null;
        int redEsc=0;
        try {
            fileReader= new FileReader("./src/src");
            while ((redEsc=fileReader.read())!=-1){
                System.out.print((char) redEsc);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
