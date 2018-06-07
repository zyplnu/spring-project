package com.hyena.spring.test;

import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.test.context.TestPropertySource;

import java.io.IOException;

public class SpringResourceTest {


    @Test
    public void springResourceFindTest() throws IOException {
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        Resource resource = defaultResourceLoader.getResource("http://www.baidu.com");
        System.out.println("description : " + resource.getDescription() + " exists: " + resource.exists());
        System.out.println(resource.contentLength());
    }
}
