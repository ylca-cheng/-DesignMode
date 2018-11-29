package com.cheng.dynamicproxy;

/**
 * Created by niecheng on 2018/11/28.
 */
public class Student implements Person,Interface{
    @Override
    public void study() {
        System.out.println("搞学习!");
    }

    @Override
    public void doSomething() {
        System.out.println("学生dosomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("学生dosomethingelse");
    }
}
