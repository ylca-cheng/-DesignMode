package com.cheng.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by niecheng on 2018/11/8.
 *
 * 测试动态代理
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("测试单接口------------------------------");
        RealObject real = new RealObject();
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                new DynamicProxyHandler(real));

        proxy.doSomething();
        proxy.somethingElse("luoxn28");

        System.out.println("测试多接口------------------------------");
        Student stu = new Student();
        Interface proxy1 = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Person.class,Interface.class},
                new DynamicProxyHandler(stu));
        proxy1.doSomething();

        System.out.println("测试cglib动态代理------------------------------");
        Person person = new Student();
        Person proxy2 = (Person) new ProxyFactory(person).getProxyInstance();
        proxy2.study();
    }
}
