package com.ohgiraffers.section01.intro;

public interface OuterCalculator {          // 인터페이스 내부에 인터페이스 생성

    @FunctionalInterface
    public interface Sum {
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multiplyTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        int divideTwoNumber(int a, int b);
    }
}
