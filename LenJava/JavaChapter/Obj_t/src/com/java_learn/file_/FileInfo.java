package com.java_learn.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 获取文件信息
 */
public class FileInfo {
    public static void main(String[] args) {
        FileInfo.info();
    }

    public static void info() {
        File file = new File("./src/bb.txt");
        System.out.println("文件名：" + file.getName());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件大小：" + file.length());
        System.out.println("文件是否存在：" + file.exists());
//        System.out.println("文件是否存在：" + file.exists());
    }
}
