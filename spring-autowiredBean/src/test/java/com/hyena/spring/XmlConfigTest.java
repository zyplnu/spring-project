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
                // com/hyena/spring/xmlconfig/beans.xml是classpath
                new ClassPathXmlApplicationContext("com/hyena/spring/xmlconfig/beans.xml");
        // getBean方法首先查看Bean标签的name属性，如果没有则查看id属性----下面的首先查看name属性为user的，其次查看id属性为user的

        Object user = context.getBean("user");
        System.out.println(user instanceof User);
    }
}
