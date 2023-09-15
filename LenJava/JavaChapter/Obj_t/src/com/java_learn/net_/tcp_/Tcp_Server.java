package com.java_learn.net_.tcp_;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟服务器端
 */
public class Tcp_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        //当没有客户端连接9999端口，程序阻塞，等待连接
        //当有客户端连接，会返回Socket对象，程序继续运行
        Socket socket=serverSocket.accept();
        InputStream inputStream = socket.getInputStream();


       /* byte[]  buf=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }*/
        /*上述代码为字节流读数据
        以下为字符流读数据：*/
        BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
        String s=br.readLine();
        System.out.println(s);



        //读完数据后，给客户端返回数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("ok,client".getBytes());
        socket.shutdownOutput();

        //注意使用字符流时，关闭外层流：br/bw.close()
        inputStream.close();
        outputStream.close();

        socket.close();
        serverSocket.close();
    }
}
