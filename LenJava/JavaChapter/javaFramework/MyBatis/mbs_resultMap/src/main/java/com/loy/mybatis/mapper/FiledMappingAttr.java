package com.loy.mybatis.mapper;

import com.loy.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FiledMappingAttr {
//    属性名与字段名不一致
    Employee getEmpById(@Param("id") Integer id);

    Employee getEmp1();

//    查询员工和所在部门

    Employee getEmpInfo(@Param("id") Integer id);

Employee getEmpInfo2(@Param("id") Integer id);



//分步查询
//    第一步：查询员工信息
//    第二步：DeptMapper中
    Employee getEmpStepOne(@Param("id") Integer id);


//    <!--    一对多分布查询第二步-->
List<Employee> getDeptAndEmpStepTwo(@Param("did") Integer did);
}
