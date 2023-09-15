package com.loy.mybatisplus;

import com.loy.mybatisplus.enums.SexEnum;
import com.loy.mybatisplus.mapper.StudentMapper;
import com.loy.mybatisplus.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MbsEnumTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testEnum(){
        Student student = new Student();
        student.setName("张三");
        student.setSex(SexEnum.MALE);
        int insert = studentMapper.insert(student);
        System.out.println(insert);

    }
}
