package com.dynamicProxy.jdk;
// JDK dynamic proxy 测试类
public class Test {
    public static void main(String[] args) {
        // 被代理类的对象
        Animal dog = new Dog();
        // handler类的对象
        DogJDKProxy handler = new DogJDKProxy(dog);
        Animal dogProxy = handler.getProxyInstance();
        System.out.println(dogProxy.eat(1,2));
    }
}
