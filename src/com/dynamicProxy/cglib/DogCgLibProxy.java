package com.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DogCgLibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object createProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before eat...");
        Object o1 = methodProxy.invokeSuper(o,objects);
        System.out.println("after eat...");
        return o1;
    }
}
