package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 주석은 항상 위에 한 줄 띄워서 작성
        // 한 줄 주석
        /* 범위
           주석 */

        /*수업목표. 여러 가지 값의 형태를 출력할 수 있다*/

        /*목차 1. 숫자 형태의 값
         *  목차 1-1. 정수 형태의 값 출력*/
        System.out.println(123);

        /*  목차 1-2. 실수 형태의 값 출력*/
        System.out.println(1.23);

        /*목차 2. 문자 형태의 값 출력*/
        System.out.println('a');                // 문자는 single quatation(') 사용
        System.out.println('1');                // single quatation(')을 붙이면 문자
//        System.out.println('ab');             // 컴파일 에러
        System.out.println('\u0000');           //아무 값도 넣지 않는 경우에 사용

        /*목차 3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요?");        // 문자열에는 double quatation(") 사용
        System.out.println("a");
        System.out.println("");

        /*목차 4. 논리 형태의 값 출력*/
        System.out.println(true);
        System.out.println("true");             //문자열
        System.out.println(false);


    }
}
