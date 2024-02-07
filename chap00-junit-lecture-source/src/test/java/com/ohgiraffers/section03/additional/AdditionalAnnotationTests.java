package com.ohgiraffers.section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/*설명. Order 어노테이션으로 테스트 메소드 실행 순서 정하기 위해서는 클래스 상단에 추가*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

    /*수업목표. Junit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다*/

    /*필기. 해당 테스트를 무시하는 어노테이션*/
    @Disabled
    @Test
    public void testIgnore() {}

    /*필기. 주어진 시간 안에 메소드 실행 완료 체크*/
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() throws InterruptedException{
        Thread.sleep(1000);
//        Thread.sleep(1001);     // 예외 발생
    }

    @Test
    @Order(1)
    public void testFirst() {}

    @Test
    @Order(3)
    public void testThird() {}

    @Test
    @Order(2)
    public void testSecond() {}

    @RepeatedTest(10)
    public void testRepeat() {}
}
