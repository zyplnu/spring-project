package com.hyena.spring.callable;

import jdk.nashorn.internal.codegen.CompilerConstants;
import org.junit.Test;

public class A  implements Callable {
    @Override
    public void callable() {
        System.out.println("A callable");
    }

    public void sing() {
        System.out.println("i am singing");
        // callback
        new B(this).sing();
    }

    public void run() {
        System.out.println("i am running");
    }


    @Test
    public void test() {
        new A().sing();
    }
}
