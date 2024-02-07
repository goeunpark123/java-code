package com.ohgiraffers.section02.enumtype;

public enum Subjects {  //필드마다 객체 생성
    JAVA,           // 0
    MARIADB,        // 1
    JDBC,           // 2
    HTML,           // 3
    CSS,            // 4
    JAVASCRIPT      // 5
    ;               // 필드 마지막에 세미콜론 작성하지 않으면 에러 발생

    Subjects() {
        System.out.println("기본 생성자 호출");
    }

//    @Override
//    public String toString() {
//        return "@@@ " + this.name() + " @@@";
//    }
}
