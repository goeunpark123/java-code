package com.ohgiraffers.section02.enumtype;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 열거형(Enum)을 이용하여 상수 열거 패턴의 단점을 해결*/
        /*설명 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 한 개임을 보장(인덱스가 아니라 인스턴스)*/
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JAVA;

        if(subject1 == subject2) {
            System.out.println("같은 과목");
        } else {
            System.out.println("다른 과목");
        }

        /*설명 2. 단일 인스턴스임을 보장하기에 == 비교가 가능*/
        if(subject1 == subject3) System.out.println("싱글톤");

        /*설명 3. toString()/name()을 이용하여 필드명을 문자열로 변경 가능(switch 사용 X)*/
        System.out.println(Subjects.JAVA.toString());
        System.out.println(Subjects.JAVA.name());

        /*설명 4. values()를 이용하여 상수값 배열을 반환받고 이를 이용한 연속 처리 가능*/
        Subjects[] subjects = Subjects.values();

        for (Subjects s: subjects) {
            System.out.println(s.toString());
            System.out.println(s.ordinal());
            System.out.println(s.name());
            System.out.println();
        }

        /*설명 5. 타입 안전을 보장*/
        printSubjects(Subjects.JAVA);
    }

    private static void printSubjects(Subjects subjects) {}
}
