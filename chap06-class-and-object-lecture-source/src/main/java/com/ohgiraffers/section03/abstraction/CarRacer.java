package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    /*설명. Car 객체를 필드로 가진다.*/
    private Car myCar = new Car();

    public void startUp() {
        myCar.startUp();
    }

    public void stepAccelator() {
        myCar.go();
    }

    public void stepBreak() {
        myCar.stop();
    }

    public void turnOff() {
        myCar.turnOff();
    }
}
