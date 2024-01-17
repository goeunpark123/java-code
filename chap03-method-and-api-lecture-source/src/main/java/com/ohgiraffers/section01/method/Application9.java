package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /*수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다*/

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        /*설명. non-static 메소드 호출*/
        System.out.println("두 수의 합: " + cal.plusTwoNumbers(first, second));

        /*설명. private과 같은 접근 제어자에 따라 접근 가능 여부 결정*/
//        System.out.println("최소값: " + cal.minTwoNumbers(first, second));

        /*설명. static 메소드는 클래스명을 붙여야만 호출 가능*/
        System.out.println("최대값: " + Calculator.maxNumberOf(first, second));
    }
}
