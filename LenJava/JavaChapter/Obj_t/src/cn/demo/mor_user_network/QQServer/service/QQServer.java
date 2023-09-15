package cn.demo.mor_user_network.QQServer.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;
import cn.demo.mor_user_network.QQCommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟qq客户端
 */
public class QQServer {
    private ServerSocket ss = null; //定义服务端socket

    //创建集合，存放指定用户可登录
    private static HashMap<String,User> validUsers=new HashMap<>();
    //使用静态代码块，在类加载时初始化用户列表
    static {
        validUsers.put("root",new User("root","123456"));
        validUsers.put("client1",new User("client1","111111"));
        validUsers.put("client2",new User("client2","222222"));
    }
    private boolean checkUser(String Userid,String Pwd){//验证客户端用户密码是否正确

        User user=validUsers.get(Userid);
        if(user==null){
            return  false;
        }
        if(!user.getPwd().equals(Pwd)){
            return false;
        }
        return true;
    }
    public QQServer() {
        System.out.println("服务器监听9999端口了");
        try {
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);
            while (true) {
                Socket socket = null;
                //监听9999端口，没有客户端连接会一直阻塞在这
                socket = ss.accept();

                //获取socket对象的输入/出流
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

                User u = (User) objectInputStream.readObject();//读取发送来的用户对象
                Message message = new Message();//创建消息对象
                //验证用户是否正确登录
                if (checkUser(u.getUserId(),u.getPwd())) {
                    //验证通过，将MessType设置成功状态，并且使用对象输出流，传向客户端
                    message.setMessType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    objectOutputStream.writeObject(message);
                    //将与客户端的连接创建线程
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, u.getUserId());
                    serverConnectClientThread.start();
                    //将线程加入到集合中管理
                    ManageClientThread.addClientThread(u.getUserId(), serverConnectClientThread);
                } else {
                    //密码错误或者没有该用户，将MessType状态设为失败，使用对象输出流，将mess对象发送给客户端
                    message.setMessType(MessageType.MESSAGE_LOGIN_FAIL);
                    objectOutputStream.writeObject(message);
                    socket.close();
                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
