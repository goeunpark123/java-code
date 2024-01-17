package com.ohgiraffers.section01.array;

public class Application2 {

    public static void main(String[] args) {
        /*수업목표. 배열을 사용할 수 있다*/
        /*필기.
        *  배열의 사용 방법
        *  1. 배열의 선언
        *  2. 배열의 할당
        *  3. 배열의 인덱스 공간에 값 대입*/

        int[] iArr;
//        char cArr[];                // 가능한 형태이지만 권장 X

//        iArr = new int[];           // 크기 할당 필요
        iArr = new int[10];

        char[] cArr = new char[5];

        /*필기. 참조 자료형 변수 출력 결과*/
        System.out.println("iArr = " + iArr);
        System.out.println("cArr = " + cArr);

        /*필기. hashCode()를 통해 10진수 주소값 확인*/
        System.out.println("iArr = " + iArr.hashCode());
        System.out.println("cArr = " + cArr.hashCode());

        /*필기. null 값을 지닌 참조 자료형 변수 접근 시 발생하는 에러*/
//        cArr = null;
//        System.out.println("cArr = " + cArr.hashCode());
    }
}
