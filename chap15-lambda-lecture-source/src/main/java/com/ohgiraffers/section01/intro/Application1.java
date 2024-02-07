package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 람다식에 대해 이해하고 활용할 수 있다(FunctionalInterface)*/

        /*목차 1. 인터페이스를 구현한 클래스를 이용한 방식(동적 바인딩 활용)*/
        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합: " + c1.sumTwoNumber(10, 20));

        /*목차 2. 익명 클래스를 활용한 방식(인터페이스의 하위 구현체)*/
        Calculator c2 = new Calculator() {
            @Override
            public int sumTwoNumber(int num1, int num2) {
                return (num1 + num2) * 2;
            }
        };

        System.out.println("10과 20의 합에 2를 곱한 값: " + c2.sumTwoNumber(10, 20));

        /*목차 3. 람다식을 활용한 방식*/
        Calculator c3 = (x, y) -> (x + y) * 3;
//        Calculator c3 = (x, y) -> {return (x + y) * 3;};
        System.out.println("10과 20의 합에 3을 곱한 값: " + c3.sumTwoNumber(10, 20));
    }
}
