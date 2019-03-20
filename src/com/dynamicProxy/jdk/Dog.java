package com.dynamicProxy.jdk;

// 被代理的类必须实现接口
public class Dog implements Animal {
    // 实现具体的业务逻辑
    @Override
    public String eat(int i,int j) {
        System.out.println("JDK dynamic Proxy dog eat ing..."+i+j);
        return "sss"+i+j;
    }
}
