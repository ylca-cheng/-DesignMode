package com.cheng.qiaojiemoshi;

/**
 * Created by niecheng on 2018/11/27.
 *
 * 测试类
 *
 * 本例中，无论是品牌的增加还是电脑类型的增加都是可扩展的，不用去修改原有代码
 */
public class Client {

    public static void main(String[] args) {

        Computer computer = new Desktop(new LenovoBrand());

        computer.info();
    }
}
