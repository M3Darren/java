package cn.demo.mor_user_network.QQClient.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;
import jdk.nashorn.internal.runtime.Scope;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 创建连接线程
 */
public class ClientConnectServerThread extends Thread {
    private Socket socket;//用于接收该用户通讯的socket
    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
    @Override
    public void run() {
        //因为要与服务器一直连接
        while (true) {
            System.out.println("等待读取服务器信息");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //如果服务器没有发送消息，会一直阻塞在read
                Message ms = (Message) ois.readObject();
                //如果读到服务器的返回用户列表类型
                if(ms.getMessType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)){
                    String[] onlineUser=ms.getContent().split(" ");
                    System.out.println("用户列表如下");
                    for (int i = 0; i <onlineUser.length ; i++) {
                        System.out.println("用户："+onlineUser[i]);
                    }
                } else if (ms.getMessType().equals(MessageType.MESSAGE_COMM_MES)) {
                    System.out.println(ms.getSender()+"对你说："+ms.getContent());
                } else if (ms.getMessType().equals(MessageType.MESSAGE_ALL_MES)) {
                    System.out.println(ms.getSender()+"对大家说："+ms.getContent());
                } else if (ms.getMessType().equals(MessageType.MESSAGE_FILE_MES)) {
                    System.out.println(ms.getSender()+"给你发送文件"+ms.getSrc()+"到目录"+ms.getDest());
                    FileOutputStream fileOutputStream = new FileOutputStream(ms.getDest());
                    fileOutputStream.write(ms.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("文件保存成功");
                } else{
                    //其他业务逻辑
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
