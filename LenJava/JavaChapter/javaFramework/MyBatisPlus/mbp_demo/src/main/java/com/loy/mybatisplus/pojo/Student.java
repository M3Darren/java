package com.loy.mybatisplus.pojo;

import com.loy.mybatisplus.enums.SexEnum;
import lombok.Data;

@Data
public class Student {
    private Long id;
    private String name;
    private SexEnum sex;
}
