package com.java_learn.net_.tcp_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 接收文件的服务端
 */
public class Tcp_Server_fileload {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos;
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket=serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        fos=new FileOutputStream("server_/github_cp.png");
        int redesc=0;
        while ((redesc=inputStream.read())!=-1){
            fos.write(redesc);
        }

        inputStream.close();
        socket.close();
    }
}
