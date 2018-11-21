package com.cheng.decoratormodel;

/**
 * Created by niecheng on 2018/11/21.
 *
 * 饮料超类
 */
public abstract class Beverage {
    private String description;
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
