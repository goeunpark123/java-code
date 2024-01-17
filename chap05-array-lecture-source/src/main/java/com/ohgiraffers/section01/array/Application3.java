package com.ohgiraffers.section01.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /*수업목표. 배열에 초기화되는 자료형별 기본 값 이해*/
        /*필기. 형태별 기본 값
        *  정수: 0
        *  실수: 0.0
        *  논리: false
        *  문자: \u0000
        *  참조: null*/

        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));

        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        /*설명. 크기 할당과 동시에 초기값 할당*/
        int[] iArr2 = {10, 11, 12, 13, 14};
        int[] iArr3 = new int[]{10, 11, 12, 13, 14};

        /*설명. 문자열도 배열로 저장해 사용 가능*/
        String[] sArr = {"apple", "banana", "grape", "orange"};

        /*설명. 다양한 출력 방법*/
        /*설명 1. 단순 for문 사용*/
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }

        /*설명 2. Arrays.toString() 사용*/
        System.out.println(Arrays.toString(sArr));

        /*설명 3. for-each문 사용(향상된 for문)*/
        for (String str: sArr) {
            System.out.println(str);
        }
    }
}
