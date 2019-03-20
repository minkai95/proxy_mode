package com.dynamicProxy.jdk;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog();
        DogJDKProxy handler = new DogJDKProxy(dog);
        Animal dogProxy = (Animal)Proxy.newProxyInstance(Test.class.getClassLoader(),dog.getClass().getInterfaces(),handler);
        System.out.println(dogProxy.eat(1,2));
    }

}
