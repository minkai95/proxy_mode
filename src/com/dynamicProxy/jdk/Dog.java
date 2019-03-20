package com.dynamicProxy.jdk;

public class Dog implements Animal {
    @Override
    public String eat(int i,int j) {
        System.out.println("JDK dynamic Proxy dog eat ing..."+i+j);
        return "sss"+i+j;
    }
}
