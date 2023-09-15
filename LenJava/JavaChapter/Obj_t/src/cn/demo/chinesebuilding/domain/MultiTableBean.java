package cn.demo.chinesebuilding.domain;

import java.util.Date;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 多表的javabean文件
 */
public class MultiTableBean {
    //来自bill表的字段
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer nums;
    private Double money;
    private Integer diningtableId;
    private Date billDate;
    private String state;
    //增加来自menu表的字段
    private String name;


    public MultiTableBean() {
    }

    public MultiTableBean(Integer id, String billId, Integer menuId, Integer nums, Double money, Integer diningtableId, Date billDate, String state, String name) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.nums = nums;
        this.money = money;
        this.diningtableId = diningtableId;
        this.billDate = billDate;
        this.state = state;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                 billId +
                "\t" + menuId +
                "\t" + nums +
                "\t" + money +
                "\t" + diningtableId +
                "\t" + billDate +
                "\t" + state  +
                "\t" + name ;
    }
}
