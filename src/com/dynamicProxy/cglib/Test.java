package com.dynamicProxy.cglib;

public class Test {

    public static void main(String[] args) {
        DogCgLibProxy dogProxy = new DogCgLibProxy();
        Dog dog = (Dog) dogProxy.createProxy(Dog.class);
        dog.eat();
        dog.sleep(1,"sss");
    }

}
