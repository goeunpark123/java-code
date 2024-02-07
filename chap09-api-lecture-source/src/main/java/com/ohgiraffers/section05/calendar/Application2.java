package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다*/
        /*필기.
         *  Date형 대비 개선점
         *   1. timezone과 관련된 기능 추가
         *   2. 윤년 관련 기능이 내부적으로 추가
         *   3. 날짜 및 시간 필드 개념을 추가해 불필요한 메소드 제거*/

        /*설명. Calendar 자료형은 생성자를 통해 객체 생성 불가*/
        Calendar cal = Calendar.getInstance();      // 싱글톤 패턴
        System.out.println("cal = " + cal);

        Calendar cal2 = new GregorianCalendar();
        System.out.println("cal2 = " + cal2);

        int year = 2000;
        int month = 0;                              // 인덱스 고려하여 -1
        int dayOfMonth = 21;
        int hour = 13;
        int min = 40;
        int second = 0;

        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println("birthDay = " + birthDay);

        /*설명. GregorianCalendar 객체가 가진 값 확인*/
        System.out.println("태어난 해: " + birthDay.get(1));
        System.out.println(birthDay.get(Calendar.YEAR));

        System.out.println("태어난 월: " + (birthDay.get(2) + 1));      // get() 메소드로 반환받은 값에 +1
        System.out.println(birthDay.get((Calendar.MONTH) + 1));

        System.out.println("태어난 일: " + birthDay.get(5));
        System.out.println(birthDay.get(Calendar.DAY_OF_MONTH));

        /*설명. 요일*/
        String day = "";

        switch (birthDay.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: day = "일"; break;
            case Calendar.MONDAY: day = "월"; break;
            case Calendar.TUESDAY: day = "화"; break;
            case Calendar.WEDNESDAY: day = "수"; break;
            case Calendar.THURSDAY: day = "목"; break;
            case Calendar.FRIDAY: day = "금"; break;
            case Calendar.SATURDAY: day = "토"; break;
        }

        System.out.println("내 생일은 " + day + "요일");

        /*설명. 하나씩*/
        System.out.println("AM/PM: " + birthDay.get(Calendar.AM_PM));       // AM: 0 PM: 1
        System.out.println("hourOfDay: " + birthDay.get(Calendar.HOUR_OF_DAY));     // 24시간 체계
        System.out.println("hour: " + birthDay.get(Calendar.HOUR));         // 12시간 체계
        System.out.println("min: " + birthDay.get(Calendar.MINUTE));
        System.out.println("sec: " + birthDay.get(Calendar.SECOND));

        /*설명. SimpleDateFormat 활용(java.util.Date형으로 변환 후 활용)*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));

        System.out.println("birthDayString = " + birthDayString);

    }
}
