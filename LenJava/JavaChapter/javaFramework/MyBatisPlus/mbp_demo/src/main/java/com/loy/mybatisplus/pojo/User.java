package com.loy.mybatisplus.pojo;

import lombok.*;

/*@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString*/
//@Data注解与上述所有注解效果相同
@Data
public class User {
    private Integer id;
    private String name;
    private int age;

}
