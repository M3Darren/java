package com.loy.mybatis.mapper;

import com.loy.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSql {
//    多条件查询
//    测试where
    List<Employee> getEmpByWhere(Employee employee);
//测试trim
    List<Employee> getEmpByTrim(Employee employee);
//    测试choose、when，otherwise；相当于switch
List<Employee> getEmpByCwo(Employee employee);


//批量删除
    int deleteEmpByForeach(@Param("ids") Integer[] ids);
    //批量添加
    int insertEmpByForeach(@Param("employeeList") List<Employee> employeeList);
}
