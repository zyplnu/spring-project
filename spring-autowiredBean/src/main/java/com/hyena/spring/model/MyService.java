package com.hyena.spring.model;

import com.hyena.spring.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MyService implements MessageService {

    @Override
    public void service() {
        System.out.println("do service");
    }
}
