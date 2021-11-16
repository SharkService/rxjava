package com.shark.rxjava;

public abstract class Observable<T> implements ObservableSource<T> {
    @Override
    public void subscribe(Observer<T> observer) {
        //订阅
        subscribeActual(observer);
    }

    //订阅方法
    protected abstract void subscribeActual(Observer<T> observer);

    public static <T> Observable<T> create(ObservableOnSubscribe<T> source) {
        return new ObservableCreate<>(source);
    }

    public <R> ObservableMap<T, R> map(Function<T, R> function) {
        return new ObservableMap<>(this, function);
    }

    public <R> ObservableFlatMap<T, R> flatMap(Function<T, ObservableSource<R>> function) {
        return new ObservableFlatMap<>(this, function);
    }
}
