package cn.demo.chinesebuilding.service;

import cn.demo.chinesebuilding.dao.EmployeeDao;
import cn.demo.chinesebuilding.domain.Employee;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 业务层，通过调用EmployeeDao完成对employee表操作
 */
public class EmployeeService {
    private EmployeeDao employeeDao=new EmployeeDao();
    public Employee getEmployeeByIdAndPwd(String id,String pwd){
       return employeeDao.queryString("select * from employee where empid=? and pwd=?",Employee.class,id,pwd);
    }
}
