package com.staticProxy;

public class DogProxy implements Animal {
    // 被代理对象
    private Dog dog;
    // 构造被代理对象
    public DogProxy(Dog dog){
        this.dog = dog;
    }
    // 具体的代理逻辑(前后置处理等)
    @Override
    public String eat() {
        System.out.println("before eat...");
        String s = dog.eat();
        System.out.println("after eat...");
        return s;
    }
}
