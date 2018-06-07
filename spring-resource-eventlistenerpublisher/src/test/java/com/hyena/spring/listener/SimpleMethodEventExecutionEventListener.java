package com.hyena.spring.listener;

import com.hyena.spring.event.MethodExecutionEvent;

public class SimpleMethodEventExecutionEventListener implements MethodExecutionEventListener {

    @Override
    public void onMethodBegin(MethodExecutionEvent methodExecutionEvent) {
        String methodName = methodExecutionEvent.getMethodName();
        System.out.println("start to execute the method " + methodName);

    }

    @Override
    public void OnMethodEnd(MethodExecutionEvent methodExecutionEvent) {
        String methodName = methodExecutionEvent.getMethodName();
        System.out.println("finished to execute the method : " + methodName );
    }
}
