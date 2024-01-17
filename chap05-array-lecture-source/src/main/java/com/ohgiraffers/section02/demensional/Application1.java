package com.ohgiraffers.section02.demensional;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다*/
        /*필기. 다차원 배열: 2차원 이상의 배열(일반적으로는 3차원 정도 고려)*/

        int[][] iArr1;
        int[] iArr2[];              // 권장하지 않는 형태
        int iArr3[][];              // 권장하지 않는 형태

        iArr1 = new int[3][2];      // 정변 배열
        iArr2 = new int[3][];       // 가변 배열: 1차원 배열의 길이가 동일하지 X
//        iArr3 = new int[][];        // 컴파일 에러 발생


        /*설명. 정변 배열은 이미 1차원 배열들이 생성된 상태*/
        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {            // 1차원 배열을 고르는 for문
            for (int j = 0; j < iArr1[i].length; j++) {     // 선택된 1차원 배열의 길이만큼 반복하는 for문
                iArr1[i][j] = num++;
            }

            System.out.println(Arrays.toString(iArr1[i]));
        }

        /*설명. 가변 배열은 아직 생성되지 않은 상태*/
        int length = 0;
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = new int[++length];

            for (int j = 0; j < iArr2[i].length; j++) {
                iArr2[i][j] = num++;
            }

            System.out.println(Arrays.toString(iArr2[i]));
        }
    }
}
