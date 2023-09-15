package cn.demo.mor_user_network.QQServer.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class ServerConnectClientThread  extends  Thread{
     private Socket socket;//存放服务器与客户端连接的socket
     private String UserId;//记录用户id

     public ServerConnectClientThread(Socket socket, String userId) {
          this.socket = socket;
          UserId = userId;
     }

     public Socket getSocket() {
          return socket;
     }

     @Override
     public void run() {
          while (true){
               System.out.println("服务器已连接"+UserId+"，读数据。。。");
               try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                    //读取客户端发送的消息，若没有则阻塞在此
                    Message message=(Message) objectInputStream.readObject();

                    if(message.getMessType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)){
                         System.out.println("用户"+message.getSender()+"拉取在线用户列表");
                         String onlineUser = ManageClientThread.getOnlineUser();
                         Message message1 = new Message();
                         message1.setMessType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                         message1.setContent(onlineUser);
                         message1.setGetter(message.getSender());
                         ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                         objectOutputStream.writeObject(message1);
                    }else if(message.getMessType().equals(MessageType.MESSAGE_CLIENT_EXIT)){
                         System.out.println(message.getSender()+"退出");
                         ManageClientThread.removeServerConnectClientThread(message.getSender());
                         socket.close();
                         //退出循环
                         break;
                    } else if (message.getMessType().equals(MessageType.MESSAGE_COMM_MES)) {
                         //获取接收方线程
                         ServerConnectClientThread serverConnectClientThread=ManageClientThread.getServerConnectClientThread(message.getGetter());
                         //转发消息
                         ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                         objectOutputStream.writeObject(message);

                    } else if (message.getMessType().equals(MessageType.MESSAGE_ALL_MES)) {
                         //群发消息
                         HashMap<String, ServerConnectClientThread> hm = ManageClientThread.getHm();
                         Iterator<String> iterator = hm.keySet().iterator();
                         while (iterator.hasNext()){
                              String onlineUserId= iterator.next().toString();
                              if(!onlineUserId.equals(message.getSender())){
                                  //对除了发送者以外的用户发送消息
                                   ObjectOutputStream objectOutputStream = new ObjectOutputStream(hm.get(onlineUserId).getSocket().getOutputStream());
                                   objectOutputStream.writeObject(message);
                              }
                         }
                    } else if (message.getMessType().equals(MessageType.MESSAGE_FILE_MES)) {//发送文件
                         ServerConnectClientThread serverConnectClientThread = ManageClientThread.getServerConnectClientThread(message.getGetter());
                         ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                         objectOutputStream.writeObject(message);

                    }
               } catch (Exception e) {
                    throw new RuntimeException(e);
               }
          }
     }
}
