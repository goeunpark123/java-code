package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false;
    private int speed;

    public void startUp() {
        if(isOn) {          // 시동이 걸린 상태
            System.out.println("이미 시동이 걸린 상태입니다.");
        } else {
            this.isOn = true;   // isOn 앞의 this. 생략 가능
            System.out.println("시동을 걸었습니다.");
        }
    }

    public void go() {
        if(isOn) {          //시동이 켜져있는 상태, 전진 가능
            System.out.println("전진");
            speed += 10;
            System.out.println("시속 " + speed + "km/h");
        } else {
            System.out.println("시동이 걸려있지 않은 상태입니다.");
        }
    }

    public void stop() {
        if(isOn) {
            if(speed > 0) {
                speed = 0;
                System.out.println("정지");
            } else {
                System.out.println("정차되어 있는 상태입니다.");
            }
        } else {
            System.out.println("시동이 걸려있지 않은 상태입니다.");
        }
    }


    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다.");
            } else {
                isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("시동이 꺼져있는 상태입니다.");
        }
    }
}
