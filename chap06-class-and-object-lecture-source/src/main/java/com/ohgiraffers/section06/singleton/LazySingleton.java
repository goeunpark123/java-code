package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {}

    public static LazySingleton getInstance() {

        if(lazy == null) {                  // static 변수인 lazy에 객체가 생성 및 할당되지 X
            lazy = new LazySingleton();
        }

        return lazy;
    }
}
