package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /*수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다*/

        for (int i = 2; i < 10; i++) {          // 단수: 2 ~ 9
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {      // 곱해지는 수: 1 ~ 9
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.print("\n");
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /*수업목표. inner for문을 메소드로 모듈화해보자*/
        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "수 출력");
            printGugudanOf(dan);
            System.out.println();
        }
    }

    /*설명. 단수를 넘기면 1 ~ 9까지 곱해서 숫자를 출력*/
    private void printGugudanOf(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    /*설명. 아래와 같은 별 모양 출력
    *      *
    *     **
    *    ***
    *   ****
    *  *****
    * */
    public void printStars() {
        Scanner sc = new Scanner(System.in);

        System.out.println("별의 개수 입력: ");
        int n = sc.nextInt();

//        String stars = " ";
//
//        for (int i = 1; i < n; i++) {
//            stars = " ".repeat(n - i);
//            for (int j = 1; j <= i; j++) {
//                stars += "*";
//            }
//            System.out.println(stars);
//        }

    /*
    *     *
    *    ***
    *   *****
    *    ***
    *     *
    * */

        String stars2 = " ";

        for (int i = 1; i <= n; i++) {
            int gap = Math.abs(((n + 1) / 2) - i);
            stars2 = " ".repeat(gap);
            for (int k = 1; k <= n - 2 * gap; k++) stars2 += "*";

            System.out.println(stars2);
        }
    }
}
