package com.hyena.spring.beanFactory;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return new MyFactoryBean() ;
    }

    @Override
    public Class getObjectType() {
        return MyFactoryBean.class ;
    }

    @Override
    public boolean isSingleton() {
        return false ;
    }
}
