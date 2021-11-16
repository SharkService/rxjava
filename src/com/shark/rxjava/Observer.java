package com.shark.rxjava;

/**
 * 观察者接口
 * @param <T>
 */
public interface Observer<T> {
    void onSubscribe();

    void onNext(T t);

    void onComplete();

    void onError(Throwable throwable);
}
