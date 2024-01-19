package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    public SmartPhone() {
        super();
    }


    /*설명. 추상 메소드를 물려받은 자식 클래스는 반드시 Override(강제성 부여)*/
    @Override
    public void abstractMethod() {      // Override 필요
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출");
    }

    /*설명. 추가적인 메소드도 작성 가능*/
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출");
    }

}
