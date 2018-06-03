package com.hyena.spring.singletonBeanFacory;

import org.springframework.beans.factory.FactoryBean;

public class MySingletonFactoryBean implements FactoryBean {

    private static final MySingletonFactoryBean singleton = new MySingletonFactoryBean() ;

    @Override
    public Object getObject() throws Exception {
        return singleton ;
    }

    @Override
    public Class getObjectType() {
        return MySingletonFactoryBean.class ;
    }

    @Override
    public boolean isSingleton() {
        return false ;
    }
}
