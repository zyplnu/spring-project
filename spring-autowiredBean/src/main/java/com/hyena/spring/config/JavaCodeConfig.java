package com.hyena.spring.config;


import com.hyena.spring.model.MyService;
import com.hyena.spring.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class JavaCodeConfig {


    @Bean(name = "myservice")
    @Scope("singleton")
    public MessageService getServiceBean() {
        return new MyService();
    }

}
