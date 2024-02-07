package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {

    /*수업목표. 테스트 메소드의 실행 전 후에 동작하는 어노테이션을 사용할 수 있다*/
    /*설명.
       모든 테스트 메소드와 라이프 사이클 관련 메소드는 abstract면 안되고, void 반환형으로 작성
    *  접근 제어자는 사용하지 않아도 되지만(default), private 불가*/

    /*필기. 테스트가 실행되기 전 전체에서 한 번 실행*/
    @BeforeAll
    public static void beforAll() {
        System.out.println("beforeAll");
    }

    /*필기. 테스트 전에 필요한 목업 데이터를 미리 세팅해줄 목적으로 테스트가 실행되기 전 각각 메소드마다 한 번씩 실행*/
    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    /*필기. 주로 단위 테스트들이 수정되고 난 후에 사용한 자원을 반납/해제 목적으로 테스트가 실행된 직후 각각 메소드마다 한 번씩 실행*/
    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    /*필기. 모든 단위 테스트가 완전히 종료된 후에 한 번 실행*/
    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }
}
