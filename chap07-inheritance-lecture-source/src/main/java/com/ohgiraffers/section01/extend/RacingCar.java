package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{
    @Override
    public void run() {
        System.out.println("레이싱카 주행 시작");
    }

    @Override
    public void soundHorn() {
        System.out.println("경적 X");
    }
}
