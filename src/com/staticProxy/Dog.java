package com.staticProxy;

public class Dog implements Animal {

    @Override
    public String eat() {
        System.out.println("Static Proxy dog eat ing...");
        return "sss";
    }

}
