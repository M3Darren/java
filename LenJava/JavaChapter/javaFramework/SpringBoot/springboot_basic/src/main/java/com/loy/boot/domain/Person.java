package com.loy.boot.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {
private Integer id;
private String name;
private String city;
private List<String> hobby;
private Map<String,Object> animal;
}

