package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 인터페이스(interface)에 대해 이해할 수 있다*/
        /*필기. 인터페이스: 자바의 클래스와 유사한 형태지만 추상 메소드와 상수 필드(public static final)만 가질 수 있는 클래스의 변형체*/
        /*설명. 추상 클래스와 인터페이스의 차이(면접 빈출)*/

//        InterProduct ip1 = new InterProduct();        // 생성자 없는 인터페이스는 객체 생성 불가
        InterProduct ip2 = new Product();               // 타입으로 활용 가능(다형성 가능/타입 은닉)
    }
}
