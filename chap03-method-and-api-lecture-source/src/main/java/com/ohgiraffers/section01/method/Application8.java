package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /*수업목표. static 메소드를 호출할 수 있다*/

//        System.out.println("10과 20의 합:" + Application8.sumTwoNumbers(10, 20));
        System.out.println("10과 20의 합:" + sumTwoNumbers(10, 20));   // 같은 클래스의 static 메소드 호출 시, 클래스명 생략 가능
    }

    private static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
