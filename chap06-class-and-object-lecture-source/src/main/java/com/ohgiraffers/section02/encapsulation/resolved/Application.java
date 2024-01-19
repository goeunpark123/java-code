package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 접근 제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다*/
        Monster monster = new Monster();

//        monster.name = "드라큘라";
//        monster.hp = 1000;

        /*설명. 필드에 직접 접근하지 않고 메소드를 통해 우회하여 접근*/
        monster.setInfo1("드라큘라");
        monster.setInfo2(1000);

        /*필기.
        *  캡슐화(Encapsulation): 유지보수를 증가시키기 위해 필드의 직접 접근을 제한하고 public 메소드를 통해 간접적으로 접근
        *                        클래스 작성 시, 특별한 목적 외에는 캡슐화 적용이 원칙*/
    }
}
