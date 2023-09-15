package com.java_learn.file_.print_stream_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(System.out);//系统控制台输出输出
        pw.print("ok");
        pw.close();

        PrintWriter pw1=new PrintWriter(new FileWriter("./src/src",true));
        pw1.println("这里是printwriter追加内容");
        pw1.close();
    }
}
