package cn.demo.chinesebuilding.domain;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 * id int primary key auto_increment,
 * state varchar(20) not null DEFAULT '',#餐桌状态
 * ordername varchar(50) not null DEFAULT '',#预订人
 * ordertel varchar(20) not null DEFAULT ''
 */
public class Diningtable {
  private Integer id;
  private String state;
  private String ordername;
  private String oredertel;

  public Diningtable() {
  }

  public Diningtable(Integer id, String state, String ordername, String oredertel) {
    this.id = id;
    this.state = state;
    this.ordername = ordername;
    this.oredertel = oredertel;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getOrdername() {
    return ordername;
  }

  public void setOrdername(String ordername) {
    this.ordername = ordername;
  }

  public String getOredertel() {
    return oredertel;
  }

  public void setOredertel(String oredertel) {
    this.oredertel = oredertel;
  }

  @Override
  public String toString() {
    return "\t\t" +
            id +
            "\t\t" + state ;
  }
}
