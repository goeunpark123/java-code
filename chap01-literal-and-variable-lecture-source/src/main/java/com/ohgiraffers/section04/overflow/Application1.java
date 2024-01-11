package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 오버플로우에 대해 이해할 수 있다*/
        /*필기.
        *  자료형별 값의 최대 범위를 벗어나는 경우 발생하는
        *  carry를 버리고 sign bit을 반전시켜 최소값으로 변환*/

        /*목차 1. 오버플로우*/
        byte num1 = 127;

        num1++;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        /*목차 2. 언더플로우*/
        byte num2 = -127;

        num2--;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);

        //-128까지 되는 거?

        /*설명.
        *  가장 많이 사용되는 정수형 int의 최대값: 대략 21억
        *  이 범위를 벗어나게 되면 오버플로우 발생*/

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
//        int multi = 1000000 * 700000;             // 변수를 사용하지 않으면 오버플로우 인식

        System.out.println("firstNum * secondNum = " + multi);
    }
}
