package com.dynamicProxy.jdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 代理类实现InvocationHandler
public class DogJDKProxy implements InvocationHandler {
    // 被代理对象
    private Object object;
    //初始化被代理对象
    public DogJDKProxy(Object object) {
        this.object = object;
    }
    // 实现代理的具体逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before eat...");
        Object obj = method.invoke(object,args);
        System.out.println("after eat...");
        return obj;
    }
}
