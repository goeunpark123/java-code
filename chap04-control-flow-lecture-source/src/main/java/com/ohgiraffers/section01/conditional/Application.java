package com.ohgiraffers.section01.conditional;

/*설명. 실행용 클래스를 구분해서 사용한다(main)*/
public class Application {

    public static void main(String[] args) {

        A_if aClass = new A_if();
        B_ifElse b = new B_ifElse();
        C_ifElseIf cClass = new C_ifElseIf();

        /*필기. 단독 if문 흐름 확인용 메소드*/
//        aClass.testSimpleIfStatement();

        /*필기. 중첩 if문 흐름 확인용 메소드*/
//        aClass.testNestedIfStatement();

        /*필기. 단독 if-else문 흐름 확인용 메소드*/
//        b.testSimpleIfElseStatement();

        /*필기. 중첩 if-else문 흐름 확인용 메소드*/
//        b.testNestedIfElseStatement();

        /*필기. 단독 if-else-if문 흐름 확인용 메소드*/
//        cClass.testSimpleIfElseIfStatement();

        /*필기. 중첩 if-else-if문 흐름 확인용 메소드*/
        /*필기. 중첩 if-else-if문 로직 개선*/
//        cClass.testNestedIfElseIfStatement();

        D_switch dClass = new D_switch();
        dClass.testSimpleSwitchStatement();
    }
}
