package cn.demo.mor_user_network.QQClient.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;
import cn.demo.mor_user_network.QQServer.service.ManageClientThread;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 发消息功能
 */
public class MessageClientService {
    //私聊
   public void sendMessageToOne(String content,String senderId,String getterId){
       Message message=new Message();
       message.setMessType(MessageType.MESSAGE_COMM_MES);
       message.setSender(senderId);
       message.setGetter(getterId);
       message.setContent(content);
       message.setSendTime(new Date().toString());


           System.out.println(senderId+"向"+getterId+"发送一条私信");
           try {

               ObjectOutputStream objectOutputStream = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
               objectOutputStream.writeObject(message);
           } catch (IOException e) {
               throw new RuntimeException(e);
           }


   }

   //群发
   public void sendMessageToAll(String content,String senderId){
       Message message=new Message();
       message.setMessType(MessageType.MESSAGE_ALL_MES);
       message.setSender(senderId);

       message.setContent(content);
       message.setSendTime(new Date().toString());
       System.out.println(senderId+"向大家发送消息了");
       try {
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
           objectOutputStream.writeObject(message);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }


}
