package com.staticProxy;

public class Test {

    public static void main(String[] args) {
        Animal dog = new DogProxy(new Dog());
        System.out.println(dog.eat());
    }
}
