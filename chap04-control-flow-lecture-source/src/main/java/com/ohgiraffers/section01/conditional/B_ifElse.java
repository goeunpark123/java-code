package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {

        /*수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        if(input % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }
    }

    public void testNestedIfElseStatement() {
        /*수업목표. 중첩된 if-else문의 흐름을 이해하고 적용할 수 있다*/
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        /*설명. 입력받은 정수 하나를 양수와 음수로 구분하고 양수인 경우에 짝수인지 아닌지 판별*/
        if(input > 0) {                     // 양수
            System.out.println("양수");

            if(input % 2 == 0) {            // 양수면서 짝수
                System.out.println("양수면서 짝수");
            } else {                        // 양수면서 홀수
                System.out.println("양수면서 홀수");
            }
        } else {                            // 0 또는 음수
            System.out.println("0 또는 음수");
        }
    }
}
