package com.ohgiraffers.section01.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*필기. 테스트 클래스들은 클래스명 끝에 'Tests'*/

public class TestAnnotationTests {

    /*수업목표 .Junit5의 기본 어노테이션을 사용할 수 있다*/
    /*필기.
    *  단위 테스트: layered architecture에서 각 계층마다 단위 메소드를 테스트
    *  통합 테스트: layer 단위가 아닌 전체 기능 동작에 대해 테스트
    *  테스트 케이스: 테스트 대상이 되는 기능에 대해 시나리오별 테스트 정의*/

    /*설명. @Test는 기본적인 테스트 메소드에 사용되는 어노테이션*/
    @Test       // 이 함수만 실행 가능

    /*설명. DisplayName은 해당 테스트 메소드로 테스트하는 테스트 케이스에 대해 작성*/
    @DisplayName("테스트 메소드1 통과하는지 확인")
    public void testsMethod1() {

    }

    /*설명. 과거에는 공백 문자를 언더 스코어로 표기한 한글 메소드 형태로 테스트 메소드 작성*/
    @Test
    @DisplayName("우선 순위가 높음")
    public void 매개변수로_1과_3을_넘겼을_경우_합계를_잘_반환하는지_확인() {

    }
}
