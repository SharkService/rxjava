package com.shark.rxjava;

public interface ObservableOnSubscribe<T> {
    void subscribe(Emitter<T> emitter);
}
