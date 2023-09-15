package com.loy.redis.junit5test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JunitTest {
@Test
public void test1(){
    assertEquals(3,   2, "simple math");
}

}
