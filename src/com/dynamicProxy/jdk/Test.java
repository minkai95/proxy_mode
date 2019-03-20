package com.dynamicProxy.jdk;
import java.lang.reflect.Proxy;
// JDK dynamic proxy 测试类
public class Test {
    public static void main(String[] args) {
        // 被代理类的对象
        Animal dog = new Dog();
        // handler类的对象
        DogJDKProxy handler = new DogJDKProxy(dog);
        /*
        JDK动态代理的代理对象是在内存中的，是JDK根据我们传入的参数生成好的。
        第一个参数是指定代理类的类加载器（我们传入当前测试类的类加载器）
        第二个参数是代理类需要实现的接口（我们传入被代理类实现的接口，这样生成的代理类和被代理类就实现了相同的接口）
        第三个参数是invocation handler，用来处理方法的调用。这里传入我们自己实现的handler
        */
        Animal dogProxy = (Animal)Proxy.newProxyInstance(Test.class.getClassLoader(),dog.getClass().getInterfaces(),handler);
        System.out.println(dogProxy.eat(1,2));
    }
}
