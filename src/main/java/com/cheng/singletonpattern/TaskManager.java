package com.cheng.singletonpattern;

/**
 * Created by niecheng on 2018/11/26.
 * <p>
 * 单例模式之饿汉式
 * <p>
 * 共同点：将构造方法私有化，并且提供一个公共的方法访问该类的实例对象。
 * <p>
 * 优点：线程安全，不用加同步锁，因此在高并发时调用效率高。
 * <p>
 * 缺点：不能懒加载，如果不使用该类的实例，浪费内存资源。
 */
public class TaskManager {

    private static TaskManager tm = new TaskManager();

    private TaskManager() {

    }

    public static TaskManager getInstance() {
        return tm;
    }
}
