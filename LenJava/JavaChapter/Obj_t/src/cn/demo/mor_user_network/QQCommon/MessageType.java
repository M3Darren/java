package cn.demo.mor_user_network.QQCommon;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public interface MessageType {
    String MESSAGE_LOGIN_SUCCEED="1";//登录成功
    String MESSAGE_LOGIN_FAIL="2";//登陆失败
    String MESSAGE_COMM_MES="3";//普通信息
    String MESSAGE_GET_ONLINE_FRIEND="4";//要求返回在线用户列表
    String MESSAGE_RET_ONLINE_FRIEND="5";//返回用户列表
    String MESSAGE_CLIENT_EXIT="6";//客户端请求退出
    String MESSAGE_ALL_MES="7";//群发消息
    String MESSAGE_FILE_MES="8";//发送文件
}
