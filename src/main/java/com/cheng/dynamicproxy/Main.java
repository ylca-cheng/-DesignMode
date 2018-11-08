package com.cheng.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by niecheng on 2018/11/8.
 *
 * 测试动态代理
 */
public class Main {
    public static void main(String[] args) {
        RealObject real = new RealObject();
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                new DynamicProxyHandler(real));

        proxy.doSomething();
        proxy.somethingElse("luoxn28");
    }
}
