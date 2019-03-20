package com.dynamicProxy.cglib;

// 被代理类实现具体的业务逻辑(不能为final类)，可以实现接口也可以不实现
public class Dog {
    // eat方法为非final方法可以被代理
    public void eat(){
        System.out.println("cjLib dynamic Proxy dog eat ing...");
    }
    // sleep方法为final方法不能被代理
    public final void sleep(int i,String j){
        System.out.println("cjLib dynamic Proxy dog sleep ing..."+i+j);
    }

}
