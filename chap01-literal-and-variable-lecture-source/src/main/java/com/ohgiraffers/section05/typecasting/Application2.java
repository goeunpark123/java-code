package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. 강제 형변환 규칙에 대해 이해할 수 있다*/
        /*필기.
        *  강제 형변환: 변활할 자료형을 선택하여 캐스트 연산자를 통해 형변환*/

        long lnum = 8L;
//        long lnum = 80000000000L;             // 오버플로우 발생으로 데이터 손실 주의!
        int inum = (int)lnum;

        System.out.println("inum = " + inum);

        float avg = 54.321f;                    //  실수에서 정수로 강제 형변환 시에는 소수점 이하 숫자 제거
        int floorNum = (int)avg;

        System.out.println("floorNum = " + floorNum);
    }
}
