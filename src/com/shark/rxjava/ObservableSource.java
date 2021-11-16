package com.shark.rxjava;

/**
 * 被观察者顶层接口
 */
public interface ObservableSource<T> {
    /**
     * add observer订阅
     *
     * @param observer
     */
    void subscribe(Observer<T> observer);
}
