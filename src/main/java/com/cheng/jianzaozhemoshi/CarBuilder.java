package com.cheng.jianzaozhemoshi;

/**
 * Created by niecheng on 2018/11/26.
 *
 * 建造者模式
 * 汽车建造接口
 */
public interface CarBuilder {

    Engine buildEngine();

    Tyre buildTyre();

    Seat buildSeat();
}

class MyCarBuilder implements CarBuilder {

    @Override
    public Engine buildEngine() {
        return new Engine();
    }

    @Override
    public Tyre buildTyre() {
        return new Tyre();
    }

    @Override
    public Seat buildSeat() {
        return new Seat();
    }

}
