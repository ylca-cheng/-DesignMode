package com.cheng.decoratormodel;

/**
 * Created by niecheng on 2018/11/21.
 */
public class Main {
    public static void main(String[] args) {
        // 点一杯咖啡
        Beverage beverage = new HouseBlend();
        // 打印出它的描述和价格
        System.out.println(beverage.getDescription()+ " $" + beverage.cost());

        // 另点一杯咖啡，需要配料
        Beverage beverage1 = new HouseBlend();
        // 添加 Mocha
        beverage1 = new Mocha(beverage1);
        // 添加 Whip
        beverage1 = new Whip(beverage1);
        // 打印出它的描述和价格
        System.out.println(beverage1.getDescription()+ " $" + beverage1.cost());
    }
}
