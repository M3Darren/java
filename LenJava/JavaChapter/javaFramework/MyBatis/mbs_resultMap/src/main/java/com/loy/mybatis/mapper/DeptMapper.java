package com.loy.mybatis.mapper;

import com.loy.mybatis.pojo.Department;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    //分步查询第二步：通过did查询员工对应部门
    Department getDept(@Param("did") Integer did);


//    获取部门和部门所有员工
   Department getDeptAndEmp(@Param("did") Integer did);

//   <!--    分步查询第一步-->
    Department getDEStepOne(@Param("deptName") String deptName);
}
