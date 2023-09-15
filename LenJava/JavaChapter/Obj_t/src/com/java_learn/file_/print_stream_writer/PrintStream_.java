package com.java_learn.file_.print_stream_writer;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 打印输出流
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out=System.out;
        out.println("hello");//系统默认输出到控制台
        //由于底层使用write实现打印；所以还可以使用如下方法
        out.write("这是write方法".getBytes());
        out.close();

        PrintStream ps=new PrintStream(new FileOutputStream("./src/src",true));
        System.setOut(ps);//将打印输出位置改成文件
        System.out.println("这里更改了输出位置");
    }
}
