package com.hyena.spring;


import com.hyena.spring.config.SpringWiredConfig;
import com.hyena.spring.model.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringWiredConfig.class)
public class SpringJavaConfigTest {


    @Autowired
    private MyService service;


    @Test
    public void doTest() {
        System.out.println(service + " " + service.hashCode());
    }
}
