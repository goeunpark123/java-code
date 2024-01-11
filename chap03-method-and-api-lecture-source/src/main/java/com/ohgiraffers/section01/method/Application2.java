package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. main 메소드에서 순차적으로 여러 메소드 호출 시, 메소드의 호출 흐름에 대해 이해할 수 있다*/
        /*설명. static 키워드를 사용하지 않은 메소드의 호출: 클래스명 변수명 = new 클래스명(); + 접근 연산자(.) 활용*/

        System.out.println("main() 시작!");
        methodA();
        methodB();
        methodC();
        System.out.println("main() 종료");
    }

    public static void methodA() {
        System.out.println("methodA() 호출");
        System.out.println("methodA() 종료");
    }

    public static void methodB() {
        System.out.println("methodB() 호출");
        System.out.println("methodB() 종료");
    }

    public static void methodC() {
        System.out.println("methodC() 호출");
        System.out.println("methodC() 종료");
    }
}
