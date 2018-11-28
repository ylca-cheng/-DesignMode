package com.cheng.xiangyuanmoshi;

/**
 * Created by niecheng on 2018/11/28.
 *
 * 享元模式：又称轻量级模式（这也是其英文名为FlyWeight的原因），
 * 通过共享技术有效地实现了大量细粒度对象的复用。
 * String的字符串常量池就是用的享元模式。
 *
 * 当前角色：外部状态
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
