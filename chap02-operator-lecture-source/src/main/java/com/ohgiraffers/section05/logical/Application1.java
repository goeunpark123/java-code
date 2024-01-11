package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 논리 연산자에 대해 이해하고 활용할 수 있다*/
        /*필기.
        *  논리 연산자: 논리값(true/false)을 취급하는 연산자*/

        /*필기.
        *  논리 연산자의 종류
        *  1. 논리 연결 연산자: 두 개의 피연산자를 가지는 이항 연산자, 두 논리식의 판단 결과
        *    1-1. &&: 두 논리식 모두 참일 경우에만 참을 반환(우선 순위)
        *    1-2. ||: 두 논리식 모두 거짓일 경우에만 거짓을 반환
        *  2. 논리 부정 연산자: 피연산자가 하나인 단항 연산자, 피연산자와 왼쪽에서 오른쪽으로 결합
        *    2-1. !: 논리식의 결과를 반대로 반환*/

        /*목차 1. 논리 연산과 결과값 확인*/
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();

        System.out.println(!true);
        System.out.println(!false);
        System.out.println();

        /*목차 2. 논리식에 논리 연산자 활용*/
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println(num1 < num2 && num3 < num4);
        System.out.println(num1 < num2 && num3 > num4);
        System.out.println(num1 > num2 && num3 < num4);
        System.out.println(num1 > num2 && num3 > num4);
        System.out.println();

        System.out.println(num1 < num2 || num3 < num4);
        System.out.println(num1 < num2 || num3 > num4);
        System.out.println(num1 > num2 || num3 < num4);
        System.out.println(num1 > num2 || num3 > num4);
    }
}