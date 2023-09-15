package cn.demo.mor_user_network.QQServer.service;

import cn.demo.mor_user_network.QQCommon.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class ManageClientThread {
  //key为用户id，value为服务器连接客户端的线程
  public static HashMap<String,ServerConnectClientThread> hm=new HashMap<>();
  public static HashMap<String, Message> offM=new HashMap<>();

  public static HashMap<String, ServerConnectClientThread> getHm() {
    return hm;
  }
  
  public static void  addClientThread(String UserId, ServerConnectClientThread serverConnectClientThread){//将线程加入集合
    hm.put(UserId,serverConnectClientThread);
  }
  public static  ServerConnectClientThread getServerConnectClientThread(String UserId){
    //获取对应集合
    return  hm.get(UserId);
  }
  public static String getOnlineUser(){
    Iterator<String> iterator = hm.keySet().iterator();
    String onlineUserList="";
    while (iterator.hasNext()){
      onlineUserList+= iterator.next().toString()+" ";
    }
    return onlineUserList;
  }
  //删除退出的用户线程
  public static void removeServerConnectClientThread(String userid){
    hm.remove(userid);
  }
}
