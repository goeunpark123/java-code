package com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class A_break {

    /*수업목표. break문 사용에 대한 흐름을 이해하고 적용할 수 있다*/
    /*필기. break는 반복문 안에 사용하여 자신을 포함하고 있는 가장 가까운 반복문 탈출*/
    public void testSimpleBreakStatement() {
        int sum = 0;
        int i = 1;

        while(true) {               // 무한 루프(infinite loop)
            sum += 1;
            System.out.println("sum = " + sum);

            if(i == 10) {
                break;
            }

            i++;
        }
    }


    public void testPrintStarsWithBreakStatement() {

        /*필기. 중첩 반복문을 활용하는 별 출력 예제에서 break를 사용하여 효율적으로 변형*/
        /*설명.
        *  *
        *  **
        *  ***
        *  ****
        *  *****
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("별의 개수 입력: ");

        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print("*");
                if (i == j) break;                  // 현재 행의 수까지만 출력
            }
            System.out.println();
        }
    }
}
