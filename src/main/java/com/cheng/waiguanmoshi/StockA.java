package com.cheng.waiguanmoshi;

/**
 * Created by niecheng on 2018/11/28.
 * <p>
 * 2.2 参与角色
 * <p>
 * Facade：调用方定义简单的调用接口。
 * <p>
 * Subsystemclasses：功能提供者。指提供功能的类群（模块或子系统）。
 *
 * 当前角色：Subsystemclasses  股票A
 */
public class StockA {

    public void buy() {
        System.out.println("买入股票A");
    }

    public void sell() {
        System.out.println("卖出股票A");
    }
}
