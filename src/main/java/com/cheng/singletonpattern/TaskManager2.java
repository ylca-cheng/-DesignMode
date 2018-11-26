package com.cheng.singletonpattern;

/**
 * Created by niecheng on 2018/11/26.
 *
 * 通过内部类的方式，综合懒汉式和饿汉式的优点
 */
public class TaskManager2 {

    // 构造方法一样私有化
    private TaskManager2(){

    }

    /**
     * 定义私有的静态内部类
     *
     * 静态内部类一开始不会加载，加载的过程也是线程安全的
     */
    private static class InnerTaskManager{
        private static final TaskManager2 tm = new TaskManager2();
    }

    /**
     * 提供共有的访问方法，调用时初始化静态内部类
     * @return
     */
    public static TaskManager2 getInstance(){
        return InnerTaskManager.tm;
    }

}
