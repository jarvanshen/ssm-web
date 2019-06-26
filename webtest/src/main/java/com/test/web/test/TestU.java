package com.test.web.test;

import com.test.web.config.WebtestPropertiesConfigure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
public class TestU {
    @Test
    public  void test() {
        WebtestPropertiesConfigure.loadProps();
    }
}
