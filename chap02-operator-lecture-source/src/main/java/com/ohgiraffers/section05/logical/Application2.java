package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /*목차 1. 1부터 100 사이 값 확인*/
        int num1 = 55;
        int num2 = 101;
        System.out.println((num1 >= 1) && (num1 <=100));
        System.out.println((num2 >= 1) && (num2 <=100));

        /*목차 2. 알파벳 대문자 확인*/
        char ch1 = 'G';
        char ch2 = 'g';
        System.out.println(ch1 >= 'A' && ch1 <= 'Z');
        System.out.println(ch1 >= 65 && ch1 <= 98);
        System.out.println(ch2 >= 65 && ch2 <= 90);

        /*목차 3. 대소문자 상관 없이 알파벳 'y'인지 확인*/
        char ch3 = 'y';
        char ch4 = 'Y';
        System.out.println(ch3 == 'y' || ch3 == 'Y');
        System.out.println(ch4 == 'y' || ch4 == 'Y');

        /*목차 4. 알파벳인지 확인*/
        char ch5 = 'o';
        char ch6 = '`';
        System.out.println(((ch5 >= 'a') && (ch5 <= 'z')) || ((ch5 >= 'A') && (ch5 <= 'Z')));
        System.out.println(((ch6 >= 'a') && (ch6 <= 'z')) || ((ch6 >= 'A') && (ch6 <= 'Z')));
        // 알파벳 대문자 아스키 코드번호와 소문자 아스키 코드번호 사이에 특수문자 존재

    }
}
