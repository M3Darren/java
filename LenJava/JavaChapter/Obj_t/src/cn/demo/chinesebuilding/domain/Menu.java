package cn.demo.chinesebuilding.domain;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Menu {
    private Integer id;
    private String mname;
    private String mtype;
    private Double mprice;

    public Menu() {
    }

    public Menu(Integer id, String mname, String mtype, Double mprice) {
        this.id = id;
        this.mname = mname;
        this.mtype = mtype;
        this.mprice = mprice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public Double getMprice() {
        return mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }

    @Override
    public String toString() {
        return
                "\t\t" + id +
                "\t\t" + mname +
                "\t\t" + mtype +
                        "\t\t" + mprice ;
    }
}
