package com.shark.rxjava;

public class Main {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(Emitter<Object> emitter) {
                System.out.println("subscribe");
                emitter.onNext("dsad");
                emitter.onError(new Throwable());
                emitter.onComplete();
            }
        }).subscribe(new Observer<Object>() {
            @Override
            public void onSubscribe() {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onNext: "+o);

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
