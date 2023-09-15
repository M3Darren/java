package com.java_learn.net_.tcp_;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟客户端
 */
public class Tcp_client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);
        //如果连接成功返回socket对象，服务器端也会有相应动作
        OutputStream outputStream=socket.getOutputStream();



      /*  //使用socket对象发送数据
        outputStream.write("hello server".getBytes());
        socket.shutdownOutput();//必须设置写入结束标记（字节流）*/
        /* 上述write为，字节流写入；
        以下代码为字符流： */
         BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(outputStream ));
         //由于BufferedWriter不能接收字节流，使用转换流OutputStreamWriter转换
         bw.write("hello,server");
         bw.newLine();//注意，此时newLine为结束写入标志，要求对方使用readLine读取数据（字符流）
         bw.flush();//注意，需要手动刷新，否则写入失败





        //接收服务器返回的数据
        InputStream inputStream = socket.getInputStream();
        byte[]  buf=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端退出。。。");
    }
}
