package com.shark.rxjava;

/**
 * 事件发射器
 * @param <T>
 */
public interface Emitter<T> {

    void onNext(T t);

    void onComplete();

    void onError(Throwable throwable);
}
