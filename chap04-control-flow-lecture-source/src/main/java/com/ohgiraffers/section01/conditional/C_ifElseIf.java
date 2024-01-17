package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼): ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("아무 도끼도 받지 못한다.");
        } else if (answer == 2) {
            System.out.println("아무 도끼도..");
        } else {
            System.out.println("모든 도끼를 다 받는다.");
        }

        System.out.println("산신령이 사라졌다.");
    }

    public void testNestedIfElseIfStatement() {
        /*수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다*/
        /*필기. 학점 계산기
        *  90점 이상 'A', 80점 이상 'B', 70점 이상 'C', 60점 이상 'D', 나머지 'F'*/

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요: ");
        String name = sc.next();

        System.out.println("점수를 입력하세요: ");
        int score = sc.nextInt();

        String grade = null;
        if (score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            if (score % 10 >= 5 && score >= 65) grade += '+';

            System.out.println(name + " 학생의 점수는 " + score + "이고, 등급은 " + grade + "입니다. ");
        }

        else {
            System.out.println("점수 입력 오류");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
