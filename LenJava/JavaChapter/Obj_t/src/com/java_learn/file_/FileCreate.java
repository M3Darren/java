package com.java_learn.file_;

import java.io.File;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 创建文件
 */
public class FileCreate {
    public static void main(String[] args) throws IOException {
//        FileCreate.create01();
//        FileCreate.create02();
        FileCreate.create03();
    }

    public static void create01() throws IOException {
//        方式一：new File("路径");
        String filepath="./a.txt";//会在项目目录下创建文件
        File file = new File(filepath);
        file.createNewFile();
    }
    public static void create02(){
//        方式二：new File(父目录，文件名）
        File parentF=new File("./src");
        String chF="bb.txt";
        File file=new File(parentF,chF);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void create03(){
//        方法三：new File(String 父目录，String 文件名)
        String pF="./src";
        String cF="./src";
        File file = new File(pF, cF);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
