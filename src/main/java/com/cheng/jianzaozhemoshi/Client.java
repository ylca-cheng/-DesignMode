package com.cheng.jianzaozhemoshi;

/**
 * Created by niecheng on 2018/11/26.
 *
 * 客户端代码变得简洁了。
 * 因为建造者模式遵循了依赖倒转原则：高层模块不应该依赖底层模块。两个都应该依赖抽象；应该依赖细节抽象不。细节应该依赖抽象。即面向接口编程，而不是面向实现编程，
 * 我们只要将客户端的 Builder 或 Director 替换不同的接口实现类（多态），
 * 就能体现出代码灵活性了
 */
public class Client {

    public static void main(String[] args) {

        CarDirector director = new MyCarDirector(new MyCarBuilder());

        Car car = director.directCar();

        car.intro();

    }
}
