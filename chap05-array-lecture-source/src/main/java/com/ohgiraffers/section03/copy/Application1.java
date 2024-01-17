package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 배열의 얕은 복사에 대해 이해할 수 있다*/
        /*필기.
        *  얕은 복사(shallow copy): stack의 주소 값만 복사
        *  깊은 복사(deep copy): heap에 위치한 배열에 저장된 값을 복사 */

        int[] originArr = {1, 2, 3};
        int[] copyArr = originArr;          // 참조 주소 값 복사(얕은 복사)

        System.out.println("copyArr = " + Arrays.toString(copyArr));

        copyArr[2] = 100;
        System.out.println("originArr = " + Arrays.toString(originArr));
    }
}

