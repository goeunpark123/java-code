package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. import에 대해 이해할 수 있다*/

        Calculator cal = new Calculator();

        /*목차 1. non-static 메소드*/
        int sub = cal.subTwoNumbers(80, 21);
        System.out.println("80 - 21 = " + sub);

        /*목차 2. static 메소드*/
        System.out.println("최대값: " + Calculator.maxNumberOf(22, 80));

    }
}
