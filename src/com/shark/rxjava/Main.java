package com.shark.rxjava;

public class Main {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                System.out.println("subscribe");
                emitter.onNext("123");
                emitter.onError(new Throwable());
                emitter.onComplete();
            }
        }).map(new Function<String, Integer>() {
            @Override
            public Integer apply(String o) {
                return Integer.parseInt(o);
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe() {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Integer o) {
                System.out.println("onNext: " + (o + 1));

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");

            }
        });

    }
}
