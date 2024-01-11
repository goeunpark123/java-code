package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다*/
        /* 필기
            변수 사용법
        *   1. 선언
            2. 값 대입
            3. 사용
        *  */

        /*목차 1. 변수 선언*/

        /*설명. 자료형
        *  어느 정도의 크기로 변수를 설정할지 compiler와 약속한 키워드
        *  구분: 기본 자료형(primitive type)/참조 자료형(reference type)*/

        /*설명. 기본 자료형*/
        /*설명.  정수를 취급하는 자료형*/
        byte bnum;          // 1 byte
        short snum;         // 2 byte
        int inum;           // 4 byte
        long lnum;          // 8 byte

        /*설명. 실수를 취급하는 자료형*/
        float fnum;         // 4 byte
        double dnum;        // 8 byte

        /*설명. 문자를 취급하는 자료형*/
        char ch;            // 2 byte

        /*설명. 논리값을 취급하는 자료형*/
        boolean isTrue;     // 1 byte

        /*설명. 문자열은 참조 자료형*/
        String str;         // 4 byte

        /*목차 2. 변수 값 대입 */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;          // L 안붙이면 정수 기본형인 int로 인식

        fnum = 4.8f;        // f 안붙이면 실수 기본형인 double로 인식
        dnum = 8.0;

        ch = 'a';
        ch = 97;            // 문자를 숫자로 취급
//        ch = -97;         // 0부터 양수만 저장 가능
        isTrue = true;

        /*목차 3. 변수 사용 */
        System.out.println("isTrue = " + isTrue);
        System.out.println("lnum + inum = " + (lnum + inum));

        /*설명. 변수 선언 및 초기화*/
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        double avg = sum / 3;           // 연산에 사용된 값의 자료형에 따라 결과 자료형 결정
        avg = sum / 3.0;                // 두 값 중 하나는 double이어야 결과가 double로 연산

        float avg2 = sum / 3.0f;
        System.out.println(avg2);

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
