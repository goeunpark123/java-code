package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 메소드 내부에서 다른 메소드 호출 시, 메소드의 호출 흐름에 대해 이해할 수 있다*/
        /*필기.
        *  메소드: 어떤 특정 작업을 수행하기 위한 명령문의 집합*/

        System.out.println("main() 시작!");
        methodA();
        System.out.println("main() 종료");
    }

    public static void methodA() {
        System.out.println("methodA() 호출");
        methodB();
        System.out.println("methodA() 종료");
    }

    public static void methodB() {
        System.out.println("methodB() 호출");
        methodC();
        System.out.println("methodB() 종료");
    }

    public static void methodC() {
        System.out.println("methodC() 호출");
        System.out.println("methodC() 종료");
    }
}