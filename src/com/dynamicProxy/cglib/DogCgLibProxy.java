package com.dynamicProxy.cglib;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class DogCgLibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    // 创建代理对象
    public Object createProxy(Class clazz){
        // 设置公共类和接口
        enhancer.setSuperclass(clazz);
        // 设置回调
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    // 回调方法，实现具体代理的逻辑
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before eat...");
        Object o1 = methodProxy.invokeSuper(o,objects);
        System.out.println("after eat...");
        return o1;
    }
}
