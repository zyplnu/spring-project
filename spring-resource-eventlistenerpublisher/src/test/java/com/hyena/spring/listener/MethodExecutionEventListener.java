package com.hyena.spring.listener;

import com.hyena.spring.event.MethodExecutionEvent;

import java.util.EventListener;

public interface MethodExecutionEventListener extends EventListener {

    void onMethodBegin(MethodExecutionEvent methodExecutionEvent);

    void OnMethodEnd(MethodExecutionEvent methodExecutionEvent);


}
