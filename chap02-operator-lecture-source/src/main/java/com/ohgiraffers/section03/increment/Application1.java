package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 단항 연산자이자 증감 연산자에 대해 이해하고 활용할 수 있다*/
        /*필기.
        *  증감 연산자(피연산자의 앞(전위 연산자)이나 뒤(후위 연산자)에 사용 가능)
        *  '++' : 1 증가
        *  '--' : 1 감소*/

        /*목차 1. 증감 연산자 단독 사용*/
        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        /*목차 2. 다른 연산자와 함께 사용*/
        int firstNum = 20;
        int result = firstNum++ * 3;

        System.out.println("result = " + result);           // 대입이나 출력 이후에 값 증가
        System.out.println("firstNum = " + firstNum);
        System.out.println("firstNum = " + firstNum++);
        System.out.println("firstNum = " + firstNum);
        System.out.println("firstNum = " + ++firstNum);
    }
}
