package com.cheng.yuanxingmoshi;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by niecheng on 2018/11/26.
 *
 * 原型模式，为浅度克隆，不会调用构造方法
 */
public class Sheep implements Cloneable,Serializable{
    private String name;

    private Date birthday;

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Sheep sheep = (Sheep) obj;
        // 克隆时间
        sheep.birthday = (Date) this.birthday.clone();

        return sheep;
    }
}
