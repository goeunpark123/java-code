package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {

        /*수업목표. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/

        do {
            System.out.println("실행");
        } while (false);

        System.out.println("반복 종료");
    }

    public void testDoWhileExample() {

        /*수업목표. do-while문의 흐름을 이해하고 적용할 수 있다*/
        Scanner sc = new Scanner(System.in);

        String str = "";

        do {
            if(!str.equals("finish") && !str.equals("")) {
                System.out.println("finish 입력..");
            }
            System.out.println("finish 입력:");
            str = sc.nextLine();
            System.out.println("입력된 문자열: " + str);
        } while (!str.equals("finish"));                // 문자열.equals("비교 문자열"): 문자열 비교

        System.out.println("감사합니다!");
    }
}
