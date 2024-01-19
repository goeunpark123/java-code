package com.ohgiraffers.section01.extend;

public class Car {

    /*설명. 자동차의 속성과 기능을 나열*/
    private boolean runningStatus;

    public Car() {
        // 모든 부모 클래스도 Object 클래스 상속 받아 기본 메소드 제공(super() 생략)
        System.out.println("Car 클래스의 기본 생성자 호출");
    }

    public void run() {
        runningStatus = true;
        System.out.println("주행 시작");
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵빵");
        } else {
            System.out.println("주행 중이 아닌 경우에는 경적 불가");
        }
    }

    public boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("주행 종료");
    }
}
