package com.loy.mybatisplus.service.impl;

import com.loy.mybatisplus.entity.Employee;
import com.loy.mybatisplus.mapper.EmployeeMapper;
import com.loy.mybatisplus.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author loy
 * @since 2023-08-09
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
