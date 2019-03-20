package com.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DogJDKProxy implements InvocationHandler {
    private Object object;
    public DogJDKProxy(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before eat...");
        Object obj = method.invoke(object,args);
        System.out.println("after eat...");
        return obj;
    }
}
