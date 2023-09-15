package cn.demo.chinesebuilding.domain;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 映射数据库的employee表
 * id int primary key auto_increment,
 * empid varchar(20),
 * empname varchar(20),
 * pwd varchar(30),
 * job varchar(20)
 */
public class Employee {
     private Integer id;
     private String empid;
     private  String pwd;
     private String empname;
     private String job;

    public Employee() {
    }

    public Employee(Integer id, String empid, String pwd, String empname, String job) {
        this.id = id;
        this.empid = empid;
        this.pwd = pwd;
        this.empname = empname;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
