package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. java.util.Scanner를 이용하여 다양한 자료형 값 입력*/

//        java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        /*목차 1. 문자열 입력*/
        System.out.println("이름을 입력하세요.: ");
        String name1 = sc.next();                       // 공백 또는 줄 바꿈 전까지만 입력
        String name2 = sc.nextLine();                   // 공백이나 줄 바꿈을 포함한 문자열 하나 모두 입력
        System.out.println("입력하신 이름은 " + name1);
        System.out.println("입력하신 이름은 " + name2);

        /*목차 2. 정수형 입력*/
        System.out.println("나이를 입력하세요.: ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age);

        /*목차 3. 실수형 입력*/
        System.out.println("키를 입력하세요.: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는 " + height);

        /*목차 4. 논리형 입력*/
        System.out.println("true or false: ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 " + isTrue);

        sc.nextLine();                                  // 중간에 버퍼에 남은 공백 및 개행 제거

        /*목차 5. 문자형 입력*/
        System.out.println("문자 하나 입력: ");
//        char answer = sc.next().charAt(0);
        char answer = sc.nextLine().charAt(0);          //메소드 체이닝 방식으로 사용자의 입력값에서 인덱스에 해당하는 문자 반환
        System.out.println("입력하신 문자는 " + answer);
    }
}
