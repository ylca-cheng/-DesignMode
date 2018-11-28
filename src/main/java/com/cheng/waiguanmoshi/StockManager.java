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
 * 当前角色：Facade  职业经理
 */
public class StockManager {
    private StockA stockA;

    private StockB stockB;

    public StockManager() {
        stockA = new StockA();
        stockB = new StockB();
    }

    public void buyStock() {
        this.stockA.buy();
        this.stockB.buy();
    }

    public void sellStock() {
        this.stockA.sell();
        this.stockB.sell();
    }
}
