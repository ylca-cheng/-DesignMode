package com.cheng.xiangyuanmoshi;

/**
 * Created by niecheng on 2018/11/28.
 *
 * 当前角色：具体享元
 */
public class WebSiteA extends WebSite{
    public WebSiteA(String name) {
        this.name = name;
    }

    @Override
    public void show(User user) {
        System.out.println(user.getName() + "的" + this.name);
    }
}
