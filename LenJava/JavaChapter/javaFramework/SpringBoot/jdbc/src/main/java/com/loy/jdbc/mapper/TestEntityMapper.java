package com.loy.jdbc.mapper;

import com.loy.jdbc.domain.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
@Mapper
public interface TestEntityMapper {
    public TestEntity getEntity(Integer id);
}
