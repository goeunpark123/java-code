package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {

        /*수업목표. time 패키지의 클래스들에 포매팅을 적용하여 출력할 수 있다*/
        String dateNow = "2022-10-12";
        String timeNow = "14:05:10";

        LocalDate localDate = LocalDate.parse(dateNow);
        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        /*설명. 기본 패턴이 아닌 경우*/
        /*설명. time 패키지 자료형에 새로운 패턴 인식*/
        String dateNow2 = "221005";
        String timeNow2 = "14-05-10";

        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));

        System.out.println(localDate2);
        System.out.println(localTime2);

        /*설명. time 패키지가 인식한 날짜 및 시간을 문자열로 반환*/
        String dateFormat = localDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH mm"));

        System.out.println(dateFormat);
        System.out.println(timeFormat);
    }
}
