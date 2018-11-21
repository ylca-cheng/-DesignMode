package com.cheng.decoratormodel;

/**
 * Created by niecheng on 2018/11/21.
 *
 * 装饰者
 * 配料类
 */
public class Whip extends Beverage{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2d;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
