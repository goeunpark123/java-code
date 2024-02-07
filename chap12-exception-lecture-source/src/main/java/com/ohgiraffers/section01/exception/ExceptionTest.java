package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("money = " + money);
        if (money >= price) {
            System.out.println("구입 가능: " + price);
        }

        else {              // 예외 상황
            throw new Exception("XD");
        }
    }
}
