package cn.demo.mor_user_network.QQCommon;

import java.io.Serializable;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 定义用户对象
 */
public class User implements Serializable {
  private String UserId;
  private String Pwd;
  private  static  final long serialVersionUID=1L;
  public   User(){}
  public User(String userId, String pwd) {
    UserId = userId;
    Pwd = pwd;
  }

  public String getUserId() {
    return UserId;
  }

  public void setUserId(String userId) {
    UserId = userId;
  }

  public String getPwd() {
    return Pwd;
  }

  public void setPwd(String pwd) {
    Pwd = pwd;
  }
}
