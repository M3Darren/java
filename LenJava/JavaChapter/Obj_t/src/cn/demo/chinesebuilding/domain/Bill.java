package cn.demo.chinesebuilding.domain;

import java.util.Date;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 * id int primary key auto_increment,
 * billId varchar(20),#账单号
 * menuId int,#菜品号
 * nums int DEFAULT 0,#数量
 * money double,#单价
 * diningtableId int,#餐桌号
 * billDate datetime,#订单日期
 * state varchar(10)#订单状态：已结账，未结账，挂单
 */
public class Bill {
   private Integer id;
   private String billId;
   private Integer menuId;
   private Integer nums;
   private Double money;
   private Integer diningtableId;
   private Date billDate;
   private String state;

    public Bill(Integer id, String billId, Integer menuId, Integer nums, Double money, Integer diningtableId, Date billDate, String state) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.nums = nums;
        this.money = money;
        this.diningtableId = diningtableId;
        this.billDate = billDate;
        this.state = state;
    }

    public Bill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getDiningtableId() {
        return diningtableId;
    }

    public void setDiningtableId(Integer diningtableId) {
        this.diningtableId = diningtableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return

                "\t" + billId +
                "\t" + menuId +
                "\t" + nums +
                "\t" + money +
                "\t" + billDate +
                "\t" + state  ;
    }
}
