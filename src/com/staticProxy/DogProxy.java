package com.staticProxy;

public class DogProxy implements Animal {
    private Dog dog;
    public DogProxy(Dog dog){
        this.dog = dog;
    }
    @Override
    public String eat() {
        System.out.println("before eat...");
        String s = dog.eat();
        System.out.println("after eat...");
        return s;
    }
}
