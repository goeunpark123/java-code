package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main(String[] args) {

        /*수업목표. 변수의 명명 규칙에 대해 이해할 수 있다*/
        /* 필기
        *   변수의 명명 규칙
        *    변수의 이름을 붙이는 경우에는 정해진 규칙이 있다.
        *    이는 반드시 숙지해야 하며 좋은 프로그래밍을 하는 첫 단계이다.*/

        /*목차 1. 컴파일 에러를 발생시키는 규칙*/
        /*  목차 1-1. 동일한 범위 내에서 동일한 변수명 사용 불가*/
        int age = 20;
//        int age = 30;
        age = 30;

        /*  목차 1-2. 예약어는 사용 불가*/
//        int true

        /*  목차 1-3. 대소문자 구분*/
        int aGe = 20;

        /*  목차 1-4. 숫자로 시작할 수 X*/
//        int 1age = 20;
        int age1 = 20;

        /*  목차 1-5. 변수명에 사용할 수 있는 특수기호('_', '$')*/
        int _age = 20;
        int $age = 20;
//        int #age = 20;

        /*목차 2. 컴파일 에러를 발생시키지 않지만 암묵적으로 지켜지는 관례상 규칙*/
        /*  목차 2-1. 길이 제한은 없지만 적당한 길이 권장*/
        /*  목차 2-2. 합성어인 경우, 첫번째 단어는 소문자 두번째 단어는 대문자로 시작(camel case)*/
        int minAge = 20;
        int maxAge = 20;

        /*  목차 2-3. 한글 사용 가능하지만 권장하지 X*/
        int 나이 = 20;

        /*  목차 2-4. 저장될 값을 고려하여 의미있고 명확한 이름*/
        String name;

        /*  목차 2-5. 명사 형태로 작성*/
        /*  목차 2-6. boolean 자료형은 긍정 의문문 형태*/
        boolean isAlive = true;
        boolean isDead = false;
    }
}
