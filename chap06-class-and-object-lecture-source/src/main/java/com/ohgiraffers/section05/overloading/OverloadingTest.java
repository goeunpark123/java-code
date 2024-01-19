package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /*수업목표. 오버로딩(overloading)에 대해 이해할 수 있다*/
    /*필기. 시그니처(signature): public void method(int num) {}에서 메소드의 이름과 파라미터 선언부 -> method(int num)*/
    /*필기. 오버로딩(overloading): 동일한 메소드 이름으로 다양한 종류의 매개변수에 따라 처리하는 경우에 적용하는 기술*/
    /*필기. 오버로딩의 조건
    *      매개변수의 타입, 갯수, 순서를 다르게 하여 하나의 클래스 내에 동일한 이름의 메소드 여러 개 작성 가능
    *      시그니처를 제외한 부분이 다른 메소드끼리는 동일한 메소드 취급 */

    public void test() {}
//    private String test() {}                          // 시그니처를 제외한 나머지 부분은 무관

    public void test(int num) {}

    /*설명. 매개변수의 개수 차이*/
    public void test(int num1, int num2) {}
//    public void test(int num2, int num1) {}           // 변수명이 다른 것은 무관

    /*설명. 매개변수의 타입 차이*/
    public void test(int num, String str) {}

    /*설명. 매개변수의 순서 차이*/
    public void test(String str, int num) {}
}
