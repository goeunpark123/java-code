package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 스트림의 병렬 처리에 대해 이해할 수 있다*/
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "oracle", "jdbc", "html", "css"));

        /*설명. main 스레드에서 스트림을 사용하지 않고 확인*/
        System.out.println("======= foreach");
        for (String s: stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }

        /*설명. main 스레드에서 스트림을 사용하고 확인*/
        System.out.println("======= normal stream");
        stringList.stream().forEach(Application2::print);
        stringList.forEach(s -> System.out.println(s + Thread.currentThread().getName()));

        /*설명. 병렬 스트림 사용 시 스레드 확인(상대적으로 빠른 속도, main 외에 다른 스레드 활용)*/
        System.out.println("======= parallel stream");
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);

        /*설명. 동기화: CPU 하나로 자원 분배, 병렬: 여러 개의 CPU로 동작*/
    }

    private static void print(String s) {
        System.out.println(s + " : " + Thread.currentThread().getName());
    }

    // 자바 멀티 스레드 지원
}
