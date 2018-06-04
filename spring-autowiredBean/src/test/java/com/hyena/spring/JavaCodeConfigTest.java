package com.hyena.spring;


import com.hyena.spring.config.JavaCodeConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaCodeConfig.class)
public class JavaCodeConfigTest {


//    @Autowired
//    private MyService service ;


    /**
     * context.getBeanName(“myservice”)取出来的是一个bean
     * 而将注释去掉后，service和actual不是一个对象
     */
    @Test
    public void test() {
//        Assert.assertNotNull(service);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.hyena");
        Object actual = context.getBean("myservice");
        Object expected = context.getBean("myservice");
        Assert.assertEquals(expected, actual);
    }

}
