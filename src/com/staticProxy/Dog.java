package com.staticProxy;
// 被代理类，实现具体的业务逻辑
public class Dog implements Animal {
    @Override
    public String eat() {
        System.out.println("Static Proxy dog eat ing...");
        return "sss";
    }
}
