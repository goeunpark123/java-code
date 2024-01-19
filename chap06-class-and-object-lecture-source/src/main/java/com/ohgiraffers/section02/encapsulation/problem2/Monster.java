package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

    /*설명. 필드의 변수명이 변경되는 경우*/
    String kinds;
    int mp;

    public void setInfo1(String info1) {
        this.kinds = info1;
    }

    public void setInfo2(int info2) {
        this.mp = info2;
    }
}
