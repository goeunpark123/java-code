package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /*수업목표. 반환하는 값이 있는 메소드 테스트*/

        System.out.println("main() 시작");
        
        Application6 app6 = new Application6();

        String returnNext = app6.testMethod();
        System.out.println("returnNext = " + returnNext);

        /*설명. 한 번만 사용하는 경우에는 변수에 저장할 필요 없이 표현식 활용*/
//        System.out.println("returnNext = " + app6.testMethod());              // 표현식: 하나의 리터럴로 치환된 식

        System.out.println("main() 종료");
    }

    private String testMethod() {
        System.out.println("testMethod() 시작");
        
        return "test";
    }
}
