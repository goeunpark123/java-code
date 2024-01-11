package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 변수의 사용 목적에 대해 이해할 수 있다*/
        /* 필기
        *   변수의 사용 목적
        *   1. 의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리하다.
        *   2. 변수를 이용하여 코드를 작성하면 값을 변경할 때 보다 간편하게 변경할 수 있다.
        *   3. 변하는 값을 저장하기 위한 공간이다. */

        /*목차 1. 값에 의미를 부여하기 위한 목적 */
        System.out.println("======= 값에 의미 부여 테스트 =======");
        System.out.println("보너스를 포함한 급여: " + (1000000 + 200000) + "원");

        int salary = 1000000;
        int bonus = 200000;

        System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");

        /*목차 2. 한 번 저장해둔 값을 재사용하기 위한 목적 */
        System.out.println("======= 변수 재사용 테스트 =======");

        /*설명. 10명의 고객에게 100 포인트씩 지급하는 내용 출력*/
        System.out.println("1번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("2번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("3번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("4번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("5번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("6번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("7번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("8번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("9번 고객에게 100 포인트 지급하였습니다.");
        System.out.println("10번 고객에게 100 포인트 지급하였습니다.\n");

        /*설명. 위 코드에서 공통적으로 사용되는 값을 변수로 생성하여 코드 개선*/
        int point = 200;
        System.out.println("1번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("6번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("7번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("8번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("9번 고객에게 " + point + " 포인트 지급하였습니다.");
        System.out.println("10번 고객에게 " + point + " 포인트 지급하였습니다.\n");

        /*목차 3. 시간에 따라 변하는 값을 저장하고 사용하기 위한 목적 */
        System.out.println("======= 변수 값 변경 테스트 =======");
        int sum = 0;

        sum = sum + 10;             // 변수는 하나의 리터럴만 저장 가능하므로 기존에 0이던 값이 10으로 덮어씌워짐
        System.out.println("sum에 10을 더하면 현재 sum의 값은 " + sum);

        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        System.out.println("sum에 10을 4번 더하면 현재 sum의 값은 " + sum);

        /*설명. 동일한 변수도 출력 시점에 따라 출력 결과가 달라질 수 있다*/
    }
}
