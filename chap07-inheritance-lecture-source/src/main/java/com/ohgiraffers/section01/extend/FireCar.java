package com.ohgiraffers.section01.extend;

public class FireCar extends Car{
    public FireCar() {
        super();                // 모든 클래스에 기본으로 작성
                                // 부모 클래스의 기본 생성자 호출
        System.out.println("FireCar 클래스의 기본 생성자 호출");
    }

    @Override
    /*필기.
    *  @Override 어노테이션을 추가하는 이유
    *   1. 메소드 중에 부모로부터 물려받은 메소드인 것을 명시
    *   2. 부모의 메소드를 오버라이딩할 경우의 실수 발생 방지
    *   3. */
    public void soundHorn() {
        System.out.println("빵빵!");
    }

    public void sprayWater() {
        System.out.println("물");
    }


}
