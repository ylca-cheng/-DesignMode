package com.cheng.jianzaozhemoshi;

/**
 * Created by niecheng on 2018/11/26.
 *
 * 建造者模式
 */
public class Car {
    private Engine engine; // 引擎

    private Tyre tyre; // 轮胎

    private Seat seat; // 座椅

    // 汽车描述
    public void intro() {
        this.engine.intro();
        this.tyre.intro();
        this.seat.intro();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}

class Engine {
    public void intro() {
        System.out.println("开得快");
    }
}

class Tyre {
    public void intro() {
        System.out.println("耐磨防滑");
    }
}

class Seat {
    public void intro() {
        System.out.println("坐得舒适");
    }
}
