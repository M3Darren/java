package cn.demo.mor_user_network.QQClient.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;
import cn.demo.mor_user_network.QQCommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 客户端服务
 */
public class UserClientService {
    private User u = new User();//创建User对象，用于保存用户的id和pwd

    private Socket socket;//用于与服务器通信的socket

    public boolean check(String userid, String pwd) {
        boolean b = false;//返回登录状态的布尔值
        //将用户输入的密码和id放入u对象
        u.setUserId(userid);
        u.setPwd(pwd);
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            //使用对象输出流，将u对象通过socket向服务器发送
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);

            //从服务器读取返回的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            //如果服务器没有返回Message对象会一直阻塞在read
            Message ms = (Message) ois.readObject();
            //判断返回信息是否成功登录
            if (ms.getMessType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {
                //登陆成功，将开启一个线程，荣该用户与服务器保持连通
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                clientConnectServerThread.start();
                //为后续单用户多个连接，将线程放入集合中
                ManageClientConnectServerThread.addClientConnectServerThread(userid, clientConnectServerThread);
                //将返回值改为true，告诉界面，后台验证通过
                b = true;
            } else {
                //验证不通过，则将socket关闭
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return b;
    }

    //请求用户在线列表
    public void onlineUserList(){
        Message message = new Message();
        message.setMessType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());
        ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());//获取当前用户线程
        Socket socket1 = clientConnectServerThread.getSocket();//获取当前连接的socket
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket1.getOutputStream());
            objectOutputStream.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //退出系统
    public void logout(){
        Message message=new Message();
        message.setMessType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(message);
            System.out.println(u.getUserId()+"退出系统");
            System.exit(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
