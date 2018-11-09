package com.cheng.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by niecheng on 2018/11/9.
 *
 * 观察者
 */
public class Watcher implements Observer{

    public Watcher(Observable o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }
}
