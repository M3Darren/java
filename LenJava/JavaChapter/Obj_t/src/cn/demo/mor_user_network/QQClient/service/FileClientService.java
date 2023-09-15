package cn.demo.mor_user_network.QQClient.service;

import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQCommon.MessageType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 文件传输服务
 */
public class FileClientService {
  public void sendFileToOne(String src,String dest,String sendId,String getterId){
    Message message = new Message();
    message.setMessType(MessageType.MESSAGE_FILE_MES);
    message.setSender(sendId);
    message.setGetter(getterId);
    message.setSrc(src);
    message.setDest(dest);

    FileInputStream fileInputStream=null;
    byte[] fileBytes=new byte[(int)new File(src).length()];

    try {
      fileInputStream=new FileInputStream(src);
      fileInputStream.read(fileBytes);
      message.setFileBytes(fileBytes);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      if(fileInputStream!=null){
        try {
          fileInputStream.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
    System.out.println(sendId+"给"+getterId+"发送文件："+src+"到对方电脑目录："+dest);
    try {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(sendId).getSocket().getOutputStream());
      objectOutputStream.writeObject(message);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
