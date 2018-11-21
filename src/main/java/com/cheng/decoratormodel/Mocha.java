package com.cheng.decoratormodel;

/**
 * Created by niecheng on 2018/11/21.
 *
 * 装饰者
 * 配料类
 */
public class Mocha extends Beverage{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3d;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
