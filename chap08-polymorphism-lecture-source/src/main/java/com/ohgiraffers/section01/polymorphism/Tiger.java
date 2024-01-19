package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 걷습니다");
    }

    @Override
    public void cry() {
        System.out.println("어흥");
    }

    /*설명. 호랑이 클래스 추가적인 메소드*/
    public void bite() {
        System.out.println("호랑이가 물어뜯습니다");
    }
}
