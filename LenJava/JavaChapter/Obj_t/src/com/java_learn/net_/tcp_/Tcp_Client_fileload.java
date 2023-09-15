package com.java_learn.net_.tcp_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 实现客户端上传图片，发送给服务器；服务器收到文件保存，并且回复客户端
 */
public class Tcp_Client_fileload {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int redesc=0;
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream=socket.getOutputStream();
        fis=new FileInputStream("client_/github.png");
        while ((redesc=fis.read())!=-1){
            outputStream.write(redesc);
        }
        socket.shutdownOutput();
        outputStream.close();
        socket.close();

    }
}
