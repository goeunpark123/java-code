package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {              // 클래스의 접근 제어자: (default) / public

    /*필기. 접근 제어자 private을 활용하여 캡슐화를 적용(같은 클래스가 아닌 곳에서는 접근 불가)*/
    private String name;
    private int hp;

    void setInfo1(String info1) {
        this.name = info1;
    }

    void setInfo2(int info2) {
        this.hp = info2;
    }
}
