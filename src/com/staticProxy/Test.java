package com.staticProxy;
// static proxy 测试类
public class Test {
    public static void main(String[] args) {
        Animal dog = new DogProxy(new Dog());
        System.out.println(dog.eat());
    }
}
