package com.cheng.decoratormodel;

/**
 * Created by niecheng on 2018/11/21.
 *
 * 被装饰者
 * 饮料分支
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 1d;
    }
}
