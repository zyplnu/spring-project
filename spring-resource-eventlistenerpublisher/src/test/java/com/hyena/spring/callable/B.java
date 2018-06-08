package com.hyena.spring.callable;

import java.util.HashMap;
import java.util.Map;

public class B {

    private A a;

    private Map<String, Callable> maps = new HashMap<>();

    public void register(Callable callable) {
        maps.put(String.valueOf(callable.hashCode()), callable);
    }


    public void sing() {
        a.run();
    }

}
