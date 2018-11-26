package com.cheng.singletonpattern;

import java.lang.reflect.Constructor;

/**
 * Created by niecheng on 2018/11/26.
 *
 * 无论懒汉式还是饿汉式都可以通过反射创建多个对象
 */
public class Client {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("com.cheng.singletonpattern.TaskManager1");

        Constructor<?> constructor = clazz.getDeclaredConstructor(null);

        // 跳过检测机制
        constructor.setAccessible(true);

        TaskManager1 tm1 = (TaskManager1) constructor.newInstance();

        TaskManager1 tm2 = (TaskManager1) constructor.newInstance();

        System.out.println(tm1 == tm2);// 结果返回 false
    }
}
