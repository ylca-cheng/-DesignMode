package com.cheng.singletonpattern;

import java.util.concurrent.CountDownLatch;

/**
 * Created by niecheng on 2018/11/26.
 *
 *  性能比较
 *
 *  饿汉式：3ms
 *  懒汉式：12ms
 *  综合式：4ms
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        // 线程数
        int num = 10;

        // 计数器
        CountDownLatch cd = new CountDownLatch(num);

        long t1 = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        // 此处替换不同实现方式的单例代码进行测试
                        TaskManager tm = TaskManager.getInstance();
                    }
                    cd.countDown();
                }
            }).start();
        }

        // 主线程等待
        cd.await();

        System.out.println("耗时：" + (System.currentTimeMillis() - t1) + "ms");
    }
}
