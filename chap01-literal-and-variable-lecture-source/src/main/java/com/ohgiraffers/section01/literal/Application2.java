package com.ohgiraffers.section01.literal;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 값을 직접 연산하여 출력할 수 있다*/

        /*목차 1. 숫자와 숫자의 연산*/
        System.out.println("======= 정수와 정수의 연산 =======");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);               // mod: 나머지 연산

        System.out.println("======= 실수와 실수의 연산 =======");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);             // 실수는 근사값으로 할당

        System.out.println("======= 정수와 실수의 연산 =======");
        /* 필기. 정수가 실수로 변한된 다음 연산되므로 정수와 실수의 연산 결과는 실수 */
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /*목차 2. 문자의 연산*/
        System.out.println("======= 문자와 정수의 연산 =======");
        /* 필기. 문자가 유니코드 기반의 숫자인 정수로 변환되어 연산 */
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("======= 문자와 실수의 연산 =======");
        /* 필기. 정수와 실수의 연산과 동일 */

        /*목차 3. 문자열의 연산*/
        System.out.println("======= 문자열와 문자열의 연산 =======");
        System.out.println("hello" + "world");              // 문자열 이어붙이기
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        System.out.println("======= 문자열과 다른 형태의 값 연산 =======");
        /* 필기. 다른 형태의 값이 문자열로 변환되어 연산 */
        /* 설명. 문자열과 정수의 연산 */
        System.out.println("hello" + 123);

        /* 설명. 문자열과 실수의 연산 */
        System.out.println("hello" + 1.23);

        /* 설명. 문자열과 문자의 연산 */
        System.out.println("hello" + 'a');

        /* 설명. 문자열과 논리값의 연산 */
        System.out.println("hello" + true);

        /* 설명. 좌측에서부터 이항씩 차례로 연산(결과: "126hello1233") */
        System.out.println(123 + 3 + "hello" + 123 + 3);

        /* 설명. 괄호를 사용하여 연산 순서 조정*/
        System.out.println("합계: " + (123 + 456));

        /*목차 4. 논리값의 연산*/
        /* 설명. 논리값과 문자열의 연산을 제외한 대부분의 연산이 적용되지 X */
//        System.out.println(true + 1);
//        System.out.println(true * 1);

        System.out.println("======= 논리값과 문자열의 연산 =======");
        System.out.println(true + "hello");
    }
}
