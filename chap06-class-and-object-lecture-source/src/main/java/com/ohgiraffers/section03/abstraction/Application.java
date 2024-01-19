package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 객체지향 프로그래밍에 대해 이해하고, 객체와 클래스를 설계하여 프로그래밍할 수 있다.*/
        /*필기.
        *  추상화: 공통된 부분을 추출하고 나머지는 제거, 유연성을 확보하기 위한 목적
        *         유연성을 확보하게 되면 여러 곳에 적용 가능하며 재사용성이 높아진다. */

        /*필기.
        *  프로그램 개요: 카레이서가 자동차를 운전하는 프로그램*/

        /*필기.
        *  시스템 요구사항
        *   1. 카레이서는 시동 걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기 가능
        *   2. 자동차는 시동 걸기, 전진, 정지, 시동 끄기 가능
        *   3. 자동차는 처음에 멈춘 상태로 대기
        *   4. 카레이서는 자동차에 먼저 시동을 건다. 이미 걸려있는 경우 다시 걸 수 없다.
        *   5. 카레이서가 엑셀을 밟으면 시동이 걸린 상태에서 자동차는 시속 10km/h 증가 전진
        *   6. 자동차가 달리는 중에 브레이크를 밟으면 자동차의 시속은 바로 0km/h로 감소 정지
        *   7. 브레이크를 밟을 때 자동차가 달리는 중이 아니면 이미 멈춰있는 상태라고 안내
        *   8. 카레이서가 시동을 끄면 자동차는 더 이상 움직이지 않는다.
        *   9. 자동차가 달리는 중에는 시동 끄기 불가.
        * */

        /*설명. 카레이서 한 명*/
        CarRacer racer = new CarRacer();

        Scanner sc = new Scanner(System.in);

        /*설명. 카레이서에게 명령을 하기 위한 메뉴 출력*/
        while(true) {
            System.out.println();
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");

            System.out.println("메뉴 선택: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: racer.startUp();
                    break;
                case 2: racer.stepAccelator();
                    break;
                case 3: racer.stepBreak();
                    break;
                case 4: racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 입력");
            }

            if(input == 9) break;
        }
    }
}
