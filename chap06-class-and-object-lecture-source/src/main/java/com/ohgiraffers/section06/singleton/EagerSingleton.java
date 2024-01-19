package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();     // 유일하게 생성된 객체

    private EagerSingleton() {}                                     // 기본 생성자 외부에서 접근 불가


    public static EagerSingleton getInstance() {                    // 유일하게 접근 가능한 객체 반환 메소드
        return eager;
    }
}
