package cn.demo.mor_user_network.QQClient.service;

import java.util.HashMap;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 管理用户连接服务器线程
 */
public  class ManageClientConnectServerThread {
    //key为用户id，value为线程
    private static HashMap<String,ClientConnectServerThread> hm=new HashMap<>();

    public   static  void  addClientConnectServerThread(String UserId,ClientConnectServerThread clientConnectServerThread){//添加线程进入集合中
        hm.put(UserId,clientConnectServerThread);
    }


    public static ClientConnectServerThread getClientConnectServerThread(String UserId) {
        //通过uid获取对应线程
        return hm.get(UserId);
    }
}
