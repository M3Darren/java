package com.loy.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
     private Long id;
     private String name;
     private BigDecimal price;
     @Version
     private Integer version;
}
