package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*수업목표. 비교 연산자에 대해 이해하고 활용할 수 있다*/
        /*필기.
         *  비교 연산자: 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환
         *  삼항 연산자의 조건식이나 조건문에 주로 사용*/

        /*목차 1. 숫자 값 비교*/
        int str1 = 10;
        int str2 = 20;

        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
        System.out.println(str1 > str2);
        System.out.println(str1 >= str2);
        System.out.println(str1 < str2);
        System.out.println(str1 <= str2);

        /*목차 2. 문자 값 비교*/
        char ch1 = 'A';
        char ch2 = 'a';

        System.out.println((int) ch2);                      // 문자의 유니코드 값 확인
        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 <= ch2);

        /*목차 3. 논리값 비교*/
        boolean isNumber1 = true;
        boolean isNumber2 = false;

        System.out.println(isNumber1 == isNumber2);
        System.out.println(isNumber1 != isNumber2);
//        System.out.println(isNumber1 > isNumber2);        // 대소 비교 불가
//        System.out.println(isNumber1 >= isNumber2);
//        System.out.println(isNumber1 < isNumber2);
//        System.out.println(isNumber1 <= isNumber2);

        /*목차 4. 문자열 값 비교*/
        String str3 = "java";
        String str4 = "java";

        System.out.println(str3 == str4);
        System.out.println(str3 != str4);
//        System.out.println(str3 > str4);                  // 대소 비교 불가
//        System.out.println(str3 >= str4);
//        System.out.println(str3 < str4);
//        System.out.println(str3 <= str4);
    }
}