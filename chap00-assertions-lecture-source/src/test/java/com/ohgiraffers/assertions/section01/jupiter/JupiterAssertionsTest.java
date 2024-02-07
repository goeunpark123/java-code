package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JupiterAssertionsTest {

    /*수업목표. Junit5에서 제공하는 Assertions에서 제공하는 메소드에 대해 이해하고 활용할 수 있다*/

    /*목차 1. assertEquals*/
    /*필기. assertEquals(expected, actual) 메소드는 실제값과 기대값의 일치 여부를 동일성으로 판단*/
    @Test
    public void testAssertEquals() {

        /*설명. given*/
        int firstNum = 10;
        int secondNum = 20;
        int expected = 31;

        /*설명. when*/
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /*설명. then*/
//        Assertions.assertEquals(expected, result);
//        Assertions.assertEquals(expected, result, 1);   // delta: 오차범위
        Assertions.assertEquals(expected, result, "오류 발생");
    }

    /*목차 2. assertNotEquals*/
    /*필기. assertNotEquals(expected, actual) 메소드는 실제값과 기대값의 불일치 여부를 동일성으로 판단*/
    @Test
    @DisplayName("인스턴스 동일성 비교 테스트")
    void testAssertNotEqualsWithInstances() {

        //given
        Object obj1 = new Object();

        //when
        Object obj2 = new Object();

        //then
        Assertions.assertNotEquals(obj1, obj2);

        /*설명. equals와 hashCode()가 오버라이딩 되어있다면 동등 비교로 판단*/
    }

    /*목차 3. assertNull*/
    @Test
    @DisplayName("null 테스트")
    void testAssertNull() {
        String str;
        str = null;

        Assertions.assertNull(str);
    }

    /*목차 4. assertNotNull*/
    @Test
    @DisplayName("not null 테스트")
    void testAssertNotNull() {
        String str;
        str = "java";
        Assertions.assertNotNull(str);
    }

    /*목차 5. 자주 쓰는 나머지 간단한 단정문*/
    /*설명. assertTrue(), assertFalse()*/

    /*목차 6. assertAll*/
    @Test
    @DisplayName("동시에 여러가지 값에 대한 검증을 수행하는 경우 테스트")
    void testAssertAll() {
        // given
        String firstName = "길동";
        String lastName = "홍";

        // when
        Person person = new Person(firstName, lastName);

        // then
        Assertions.assertAll("그룹화된 테스트의 이름(실패 시 보여짐)",
                ()-> Assertions.assertEquals(firstName, person.getFirstName(), () -> "firstName 오류"),
                ()-> Assertions.assertEquals(lastName, person.getLastName(), () -> "lastName 오류"));
    }

    /*목차 7. assertThrows*/
    @Test
    @DisplayName("void 메소드 exception 발생 여부 테스트")
    void testAssertThrosw() {

        int firstNum = 10;
        int secondNum = 0;
        String expecteddErrorMessage = "0으로 나누기 불가";

        PositiveNumberValidator validator = new PositiveNumberValidator();
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> validator.checkDividleNumbers(firstNum, secondNum)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(IllegalArgumentException.class, exception,
                        () -> "예외 타입 불일치"),
        () -> Assertions.assertEquals(expecteddErrorMessage, exception.getMessage(),
                        () -> "예외 타입 일치")
        );

    }
 }
