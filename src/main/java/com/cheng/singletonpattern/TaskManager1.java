package com.cheng.singletonpattern;

/**
 * Created by niecheng on 2018/11/26.
 * <p>
 * 单例模式之懒汉式
 * <p>
 * 共同点：将构造方法私有化，并且提供一个公共的方法访问该类的实例对象。
 * <p>
 * 优点：实现懒加载，合理利用系统资源。
 * <p>
 * 缺点：需要添加同步锁，高并发时调用效率不高。
 */
public class TaskManager1 {
    private static TaskManager1 tm;

    // 构造方法私有化
    private TaskManager1() {

    }

    /**
     * 公有的访问方法
     *
     * @return TaskManager1
     */
    public static synchronized TaskManager1 getInstance() {
        if (null == tm) {
            tm = new TaskManager1();
        }
        return tm;
    }
}
