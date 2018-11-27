package com.cheng.qiaojiemoshi;

/**
 * Created by niecheng on 2018/11/27.
 *
 * 桥接模式：处理多层继承结构，多维度变化的场景。将各个维度设计成独立的继承结构，使得各个维度可以独立的扩展。
 *
 * 品牌维度
 */
public interface Brand {
    void info();
}

class LenovoBrand implements Brand {

    @Override
    public void info() {
        System.out.println("联想");
    }

}

class AsusBrand implements Brand {

    @Override
    public void info() {
        System.out.println("华硕");
    }

}