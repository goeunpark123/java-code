package com.ohgiraffers.section01.arithmetic;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 산술 연산자에 대해 이해하고 활용할 수 있다*/
        /*필기
        *  산술 연산자: 사칙연산과 관련된 연산자
        *  이항 연산자와 피연산자로 구성*/

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / (double) num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        double divNum = (num1 / (double) num2);
        double resultNum = (int) (divNum * 100) / (double) 100;

        System.out.println("resultNum = " + resultNum);
    }
}
