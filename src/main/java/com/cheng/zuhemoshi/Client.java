package com.cheng.zuhemoshi;

/**
 * Created by niecheng on 2018/11/27.
 *
 * 测试类
 */
public class Client {

    public static void main(String[] args) {

        Employee p1 = new Programmer("小白");
        Employee p2 = new Programmer("小黑");

        Employee projectManager = new ProjectManager("老阎");
        projectManager.add(p1);
        projectManager.add(p2);

        projectManager.report();
    }
}
