package com.hyena.spring;


import com.hyena.spring.model.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 注意：在做ClassPathXmlApplicationContext的时候不用加@Runwith
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class XmlConfigTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Object user = context.getBean("user");
        System.out.println(user instanceof User);
    }
}
