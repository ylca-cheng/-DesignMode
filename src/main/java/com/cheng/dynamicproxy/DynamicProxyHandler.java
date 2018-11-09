package com.cheng.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by niecheng on 2018/11/8.
 *
 * 动态代理类
 */
public class DynamicProxyHandler implements InvocationHandler{
    private Object proxyed;

    public DynamicProxyHandler(Object proxyed){
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始工作了. 方法名：" + method.getName());
        Object object =  method.invoke(proxyed, args);

        System.out.println("代理工作结束了. 方法名：" + method.getName());
        return object;
    }
}
