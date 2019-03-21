package com.dynamicProxy.jdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 代理类实现InvocationHandler
public class DogJDKProxy implements InvocationHandler {
    // 被代理对象
    private Object object;
    //初始化被代理对象
    public DogJDKProxy(Object object) {
        this.object = object;
    }

    /*
    获取被代理对象的实例
    JDK动态代理的代理对象是在内存中的，是JDK根据我们传入的参数生成好的。
    第一个参数是指定代理类的类加载器（我们传入目标类的类加载器）
    第二个参数是代理类需要实现的接口（我们传入被代理类实现的接口，这样生成的代理类和被代理类就实现了相同的接口）
    第三个参数是invocation handler，用来处理方法的调用。这里传入我们自己实现的handler
    */
    public <T> T getProxyInstance(){
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
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
