package com.cheng.qiaojiemoshi;

/**
 * Created by niecheng on 2018/11/27.
 *
 * 桥接模式：处理多层继承结构，多维度变化的场景。将各个维度设计成独立的继承结构，使得各个维度可以独立的扩展。
 *
 * 类型维度
 */
public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        this.brand.info();
    }
}

class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    public void info() {
        super.info();
        System.out.println("台式电脑");
    }

}

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    public void info() {
        super.info();
        System.out.println("笔记本电脑");
    }

}