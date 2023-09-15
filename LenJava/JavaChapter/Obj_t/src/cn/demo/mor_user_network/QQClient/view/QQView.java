package cn.demo.mor_user_network.QQClient.view;

import cn.demo.mor_user_network.QQClient.service.FileClientService;
import cn.demo.mor_user_network.QQClient.service.MessageClientService;
import cn.demo.mor_user_network.QQClient.service.UserClientService;
import cn.demo.mor_user_network.QQCommon.Message;
import cn.demo.mor_user_network.QQServer.service.ManageClientThread;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟qq界面视图
 */
public class QQView {

    public static void main(String[] args) {
        new QQView().mainMenu();
    }

    private boolean loop = true;//选择界面控制符
    private String key = "";//定义用户输入
    private UserClientService userClientService = new UserClientService();//客户端服务
    private MessageClientService messageClientService=new MessageClientService();//用户发消息
    private FileClientService fileClientService= new FileClientService();//发送文件服务
    private void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("=======欢迎来到多用户通讯系统==========");
            System.out.println("1.登录系统");
            System.out.println("9.退出系统\n");
            key = scanner.next();
            switch (key.charAt(0)) {
                case '1':
                    System.out.println("登录系统");
                    System.out.print("请输入用户id");
                    String UserId = scanner.next();
                    System.out.print("请输入用户密码");
                    String UserPwd = scanner.next();
                    //这里需要请求服务器验证用户合法性
                    if (userClientService.check(UserId, UserPwd)) {//调用服务验证用户是否登陆成功
                        System.out.println("======欢迎（"+UserId+"）=======");
                        while (loop) {
                            System.out.println("\n====通信系统二级菜单=====\n");
                            System.out.println("\t\t1.显示在线用户列表");
                            System.out.println("\t\t2.群发");
                            System.out.println("\t\t3.私聊");
                            System.out.println("\t\t4.发文件");
                            System.out.println("\t\t9.退出系统");
                            key = scanner.next();
                            switch (key.charAt(0)) {
                                case '1':
//                                    System.out.println("显示在线用户列表");
                                    userClientService.onlineUserList();
                                    break;
                                case '2':
                                    System.out.println("请输入群发内容：");
                                    String s=scanner.next();
                                    messageClientService.sendMessageToAll(s,UserId);
                                    break;
                                case '3':
                                    System.out.println("对谁发送私聊？");
                                    String getterId=scanner.next();
                                    System.out.println("私信内容：");
                                    String content=scanner.next();
                                    messageClientService.sendMessageToOne(content,UserId,getterId);
                                    break;
                                case '4':
                                    System.out.println("请输入文件接收方：");
                                    getterId = scanner.next();
                                    System.out.println("请输入文件路径：");
                                    String src=scanner.next();
                                    System.out.println("接收方路径：");
                                    String dest=scanner.next();
                                    fileClientService.sendFileToOne(src,dest,UserId,getterId);
                                    break;
                                case '9':
                                    System.out.println("退出系统");
                                    userClientService.logout();
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("输入不合法，请重新输入");

                            }
                        }
                    } else {
                        System.out.println("登录错误 ");
                    }
                    break;
                case '9':
                    System.out.println("退出系统");
                    loop = false;
                    break;
                default:
                    System.out.println("请输入正确的数字");
            }
        }
    }
}
