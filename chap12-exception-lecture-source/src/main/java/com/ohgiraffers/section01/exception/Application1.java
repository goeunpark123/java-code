package com.ohgiraffers.section01.exception;

public class Application1 {

    public static void main(String[] args) {   // JVM이 처리

        /*수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다*/
        /*필기. 예외 처리 방식 2가지
        *  1. throws를 통한 위임
        *  2. try-catch를 통한 처리*/

        ExceptionTest et = new ExceptionTest();

        /*설명. try-catch 구문을 통해 프로그램이 종료되지 않게 처리*/
        try {
            /*설명. catch 구문으로 처리할 예외가 발생하는 부분을 try 구문으로 범위 지정(관련된 부분만 포함)*/
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000, 10000);
            System.out.println("try 실행 안되는 부분");
        } catch (Exception e) {

            /*설명. try 구문에서 발생한 예외를 처리하기 위한 구문으로 예외 처리 방식을 직접 작성할 수 있다
               단순 출력 또는 예외 타입에서 제공하는 메소드를 활용한 처리 모두 가능
               catch 구문에 처리 구문을 작성하지 않으면 예외 발생 여부 파악이 힘드므로 간단한 처리라도 작성 필요*/
            System.out.println("잔액 부족");
            System.out.println(e.getClass());
            System.out.println("예외 발생 시의 메세지: " + e.getMessage());

            /*설명. try 구문에서 발생한 예외 타입을 받아 jvm이 처리하는 방식 확인*/
            e.printStackTrace();

            /*설명. 내가 원하는 시점에 프로그램 종료*/
//            System.exit(0);
        }

        System.out.println("프로그램 종료");
    }
}
