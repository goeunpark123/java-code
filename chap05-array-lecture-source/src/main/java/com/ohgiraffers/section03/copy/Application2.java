package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 깊은 복사에 대해 이해할 수 있다*/
        /*필기.
        *  깊은 복사를 하는 4가지 방법
        *  1. for문을 이용한 복사
        *  2. Object의 clone()을 이용한 복사(가장 많이 사용하는 방법)
        *  3. System의 arraycopy()를 이용한 복사
        *  4. Array의 copyOf()를 이용한 복사
        * */

        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        /*목차 1. for문 활용*/
        int[] copyArr1 = new int[originArr.length];

        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1, "for문을 사용한 복사본");

        /*목차 2. clone() 활용*/
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 사용한 복사본");

        /*목차 3. arraycopy() 활용*/
        int[] copyArr3 = new int[originArr.length + 3];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        print(copyArr3, "arraycopy()를 사용한 복사본");

        /*목차 4. copyOf() 활용*/
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);   // 원하는 길이만큼 복사 가능
        print(copyArr4, "copyOf()를 사용한 복사본");
    }

    private static void print(int[] arr, String desc) {          // 변수에서 매개변수로 얕은 복사 실행
        System.out.println("======= " + desc + " =======");

        /*설명. 전달받은 배열의 주소 값*/
        System.out.println("배열의 hashCode: " + arr.hashCode());

        /*설명. 전달받은 배열의 값*/
        System.out.println(Arrays.toString(arr));
    }
}
