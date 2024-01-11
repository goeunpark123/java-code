package com.ohgiraffers.section02.assignment;

public class Application1 {

    /*수업목표. 대입 연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다*/
    /*필기.
    *  대입 연산자와 산술 복합 대입 연산자
    *  '=' : 오른쪽의 피연산자를 왼쪽의 피연산자에 대입
    *  '+=' : 왼쪽의 피연산자와 오른쪽의 피연산자의 덧셈 결과를 왼쪽의 피연산자에 대입
    *  '-=' : 왼쪽의 피연산자와 오른쪽의 피연산자의 뺄셈 결과를 왼쪽의 피연산자에 대입
    *  '*=' : 왼쪽의 피연산자와 오른쪽의 피연산자의 곱셈 결과를 왼쪽의 피연산자에 대입
    *  '/=' : 왼쪽의 피연산자와 오른쪽의 피연산자의 나눗셈 결과를 왼쪽의 피연산자에 대입
    *  '%=' : 왼쪽의 피연산자와 오른쪽의 피연산자의 나머지 연산 결과를 왼쪽의 피연산자에 대입*/

    public static void main(String[] args) {
        int num = 12;

        num = num + 3;
        System.out.println("num = " + num);

        num += 3;
        System.out.println("num = " + num);             // 더 빠른 처리 속도

        num -= 3;
        System.out.println("num = " + num);

        num *= 3;
        System.out.println("num = " + num);

        num /= 3;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);

        /*주의사항*/
        num =- 5;                                       // -5를 대입
    }
}
