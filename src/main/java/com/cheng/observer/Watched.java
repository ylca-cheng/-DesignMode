package com.cheng.observer;

import javafx.beans.InvalidationListener;

import java.util.Observable;

/**
 * Created by niecheng on 2018/11/9.
 *
 * 被观察者
 */
public class Watched extends Observable {
    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
