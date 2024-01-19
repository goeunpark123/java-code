package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

/*필기.
 *  객체지향프로그래밍(Object Oriented Programming language):
 *  추상화, 캡슐화, 상속, 다형성을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은 객체 위주의 개발 방식을 적용한 프로그래밍*/

/*필기.
 *  객체 지향의 특징(4가지 - 추상화를 제외하면 3가지)
 *  추상화(Abstraction):
 *  캡슐화(Encapsulation):
 *  상속(Inheritance):
 *  다형성(Polymorphism):
 * */

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다*/
        /*설명. 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 취급*/

        /*목차 1. 변수를 활용한 회원 데이터 관리*/
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = " + Arrays.toString(hobby));

        /*필기.
           변수들로만 관리하는 경우의 문제점
           1. 많은 변수명들을 관리하기 힘들 수 있다.
           2. 전달 인자 값이 많아 기능 호출 시에 매개변수가 많아진다.
           3. 메소드의 반환형으로 회원이라는 개념 반환 불가(메소드의 반환형은 하나)
        */

        Member member = new Member();
        Member member2 = new Member();

        System.out.println("member = " + member);
        System.out.println("member2 = " + member2);

        member.name = "김철수";
        member2.name = "김영희";

        System.out.println(member.name);
        System.out.println(member2.name);

        member.age = 30;
        member.gender = '남';
        member.hobby = new String[]{"볼링", "하키"};
        member.id = "user03";
        member.pwd = "pwd03";

        /*설명. 회원 정보를 하나의 전달 인자로 전달하고 하나의 매개변수로 사용 가능*/
        System.out.println(printMember(member).name);

        /*설명. 메소드의 반환형으로 한 번에 반환 가능하고 받은 곳에서 접근도 가능*/
        Member renameMember = printMember(member);
        System.out.println(renameMember.age);
        System.out.println(Arrays.toString(renameMember.hobby));
    }

    private static Member printMember(Member member) {
        System.out.println("개명 시작");
        member.name = "박길동";

        return member;
    }
}
