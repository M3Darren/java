package com.loy.jdbc;

import com.loy.jdbc.domain.TestEntity;
import com.loy.jdbc.mapper.TestEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TestMapper {
    @Autowired
    TestEntityMapper testEntityMapper;
    @Test
    public void testEntity(){
        TestEntity entity = testEntityMapper.getEntity(1);
        log.info(entity.toString());
    }
}

