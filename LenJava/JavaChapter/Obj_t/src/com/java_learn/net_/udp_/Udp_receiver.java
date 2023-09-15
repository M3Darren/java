package com.java_learn.net_.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 接收端
 */
public class Udp_receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket(9999);
        byte[] buf=new byte[1024];//根据发送的数据大小确定
        DatagramPacket datagramPacket=new DatagramPacket(buf,buf.length);
        //接收网络传输的DatagramPacket对象
        //若没有数据发送到9999端口，则阻塞
        datagramSocket.receive(datagramPacket);
        //接收数据后进行拆包
        int length=datagramPacket.getLength();
        byte[] data=datagramPacket.getData();
        String s=new String(data,0,length);
        System.out.println(s);

        //发送返回信息
         data="ok ,sender".getBytes();//根据发送的数据大小确定
         datagramPacket=new DatagramPacket(data,data.length, InetAddress.getByName("127.0.0.1"),9998);
        datagramSocket.send(datagramPacket);


        datagramSocket.close();
    }
}
