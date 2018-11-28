package com.cheng.xiangyuanmoshi;

/**
 * Created by niecheng on 2018/11/28.
 *
 * 当前角色：抽象享元
 */
public abstract class WebSite {
    // 内部状态
    protected String name;

    public abstract void show(User user);
}
