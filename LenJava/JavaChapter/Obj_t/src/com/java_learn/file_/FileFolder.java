package com.java_learn.file_;

import java.io.File;
import java.io.IOException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 目录操作
 */
public class FileFolder {
    public static void main(String[] args) {
//        FileFolder.met();
        FileFolder.Fmet();
    }
    public static void met(){
        File file = new File("./src/bb.txt");
        //删除目录同理，在java中目录是一种特殊的文件
        if(file.exists() && file.length()==0){
            if(file.delete()){
                System.out.println("删除成功");
            }else{
                System.out.println(
                        "删除失败"
                );
            }
        }else{
            System.out.println("没有找到文件");
            System.out.println("正在创建该文件");
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void Fmet(){
        File file = new File("./src/a");
        if (file.exists()){
            System.out.println("正在删除");
            file.delete();
        }else{
            System.out.println("正在创建");
            file.mkdirs();//mkdirs和mkdir区别，加上s会创建多级目录
        }
    }
}
