package com.ohgiraffers.section01.intenum;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 정수 열거 패턴과 단점을 이해할 수 있다 (enum(열거형)이 아닌 경우)*/
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        /*설명 1. 둘 다 상수이자 숫자인데 같은 숫자일 경우를 구분할 수 없다*/
        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목");
        }

        /*설명 2. 이름 충돌 방지를 위해서는 접두어 사용 필요(이름과 값이 같은 경우)*/
        /*설명 3. 변수명에 쓰인 이름/문자열 출력 어려움(switch)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호 입력");

        int fieldNo = sc.nextInt();
        String subName = "";

        switch (fieldNo) {
            case Subjects.JAVA : subName = "JAVA"; break;
            case Subjects.MARIADB : subName = "MARIADB"; break;
            case Subjects.JDBC : subName = "JDBC"; break;
        }

        System.out.println("선택한 과목명은 " + subName + "입니다." );

        /*설명 4. 같은 클래스에 속한 상수들은 순회(반복문 사용) 불가(전체 필드 수도 알 수 없음)*/
        /*설명 5. 타입 안전성을 보장할 수 없다(Subject.JAVA는 단순 정수값과 구분이 되지 X)*/
        printSubject(Subjects.JAVA);
        printSubject(0);                // 아무 int 값이나 전달해도 해당 메소드 문제 없이 실행
    }

    private static void printSubject(int java) {
    }
}
