package com.ohgiraffers.section02.userexception;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. finally를 활용한 try-catch문 이해하고 활용할 수 있다*/
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(20000, -50000);
        } catch (Exception e) {
            System.out.println("유효성 체크: " + e.getMessage());
        } finally {

            /*설명. try 구문의 예외 발생 여부와 상관 없이 반드시 실행되는 부분*/
            System.out.println("finally 구문 동작 확인");
        }

        System.out.println("프로그램 종료");
    }
}
