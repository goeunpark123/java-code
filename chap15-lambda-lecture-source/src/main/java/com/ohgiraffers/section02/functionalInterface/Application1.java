package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다*/
        /*설명. 반환형 없는 메소드 관련 람다식*/
        /*필기.
        *  JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공
        *   1. Consumer: 리턴값이 없는 accept() 메소드를 지니고 있다(소비자 역할)
        *   2. Supplier: 매개변수가 없고 리턴값이 있는 getXXX() 메소드를 지니고 있다(생산자 역할)
        *   3. Function: 매개변수와 리턴값이 있는 applyXXX() 메소드를 지니고 있다(매개변수를 리턴값으로 매핑하는 역할)
        *   4. Operator: Function과 같이 applyXXX() 메소드를 지니고 있다 차이점은 통일된 매개변수 및 반환형의 타입
        *   5. Predicate: 매개변수와 boolean 값을 반환하는 testXXX()를 지니고 있다(매개변수를 활용하여 boolean 반환)
        * */

        Consumer<String> consumer = str -> System.out.println(str + " 입력");
        consumer.accept("Hello?");

        BiConsumer<String, LocalTime> biConsumer = (str, time) -> System.out.println(str + " " + time + "에 입력");
        biConsumer.accept("Hello?", LocalTime.now());

        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println("0부터 " + bound + "까지의 난수 발생: " + random.nextInt(bound + 1));

        objIntConsumer.accept(new Random(), 10);
    }
}
