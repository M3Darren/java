package cn.demo.mor_user_network.QQServer.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class SendNewsToAllService implements Runnable{
   private Scanner scanner=new Scanner(System.in);

   @Override
   public void run() {
      while (true){
         System.out.println("退出推送服务输入exit");
         System.out.println("请输入推送：");
         String news= scanner.next();
         if (news.equals("exit")){
            break;
         }
         Message message=new Message();
         message.setSender("服务器");
         message.setContent(news);
         message.setMessType(MessageType.MESSAGE_ALL_MES);
         message.setSendTime(new Date().toString());
         System.out.println("服务器推文："+news);

         //发送推文
         HashMap<String,ServerConnectClientThread> hm=ManageClientThread.getHm();
         Iterator<String> iterator = hm.keySet().iterator();
         while (iterator.hasNext()){
            String onLineUserId= iterator.next().toString();
            ServerConnectClientThread serverConnectClientThread=hm.get(onLineUserId);
            try {
               ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
               objectOutputStream.writeObject(message);
            } catch (IOException e) {
               throw new RuntimeException(e);
            }
         }
      }
   }
}
