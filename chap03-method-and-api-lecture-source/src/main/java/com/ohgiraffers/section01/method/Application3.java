package com.ohgiraffers.section01.method;

public class Application3 {

    static int global = 10;                                             // 전역변수

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        int global = 20;                                                // 지역변수
        System.out.println("global = " + global);                       // 지역변수가 더 높은 우선 순위
        System.out.println("global = " + Application3.global);
        System.out.println("global = " + app3.global);


        /*수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다*/
        /*필기.
        *  전달 인자(argument)와 매개변수(parameter)을 이용한 메소드 호출*/

        /*필기.
        *  변수의 종류
        *  1. 지역변수(local)
        *  2. 매개변수(parameter)
        *  3. 전역변수(global)
        *  4. 클래스변수(static)*/

        app3.testMethod(24);                                        // testMethod(전달 인자)
        app3.testMethod(20);
        app3.testMethod('a');
        app3.testMethod((int) 12.34);
    }

    /*설명. 정수를 입력하면 나이를 출력하는 메소드(non-static)*/
    public void testMethod(int age) {                                   // int age: 매개변수
        System.out.println("당신의 나이는 " + age + "세입니다.");
    }
}
