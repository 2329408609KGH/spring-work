package com.qfedu.kgh.service.impl;

import com.qfedu.kgh.common.vo.SpCartVO;
import com.qfedu.kgh.mapper.SpCartMapper;
import com.qfedu.kgh.service.SpCartService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig(locations = {"classpath:spring-context.xml", "classpath:spring-mybatis.xml", "classpath:spring-druid.xml"})
class SpCartServiceImplTest {
    @Autowired
    private SpCartService spCartService;
    @Test
    void list() {
        SpCartVO list = spCartService.list( 1L);
        System.out.println(list);
    }
}