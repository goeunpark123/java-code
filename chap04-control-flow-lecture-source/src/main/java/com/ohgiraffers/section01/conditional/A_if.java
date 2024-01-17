package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {

        /*수업목표. if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 한 개를 입력하세요.: ");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("짝수");
        }
    }

    public void testNestedIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("양수 하나 입력:");

        int input = sc.nextInt();

        if(input > 0) {
            if(input % 2 != 0) {
                System.out.println("입력받은 값은 양수인 홀수입니다.");
            }
        }

        if(input > 0 && input % 2 != 0) {
                System.out.println("입력받은 값은 양수인 홀수입니다.");

        }
    }
}
