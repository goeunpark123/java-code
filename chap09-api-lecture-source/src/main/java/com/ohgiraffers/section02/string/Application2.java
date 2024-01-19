package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 문자열 객체를 생성하는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다*/
        /*필기. 문자열 객체 생성 방법
        *  "" 리터럴 형태: 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리(singleton)
        *  new String(""): 매번 새로운 인스턴스 생성(주소값은 동일하지 X)
        * */

        String str1 = "java";           //                  equals, hashCode
        String str2 = "java";           // constant pool에 동등 비교해서 중복된 리터럴 저장하지 X
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str3 == str4: " + (str3 == str4));

        /*필기.
        *  String 객체는 리터럴로 생성되는 경우에는 heap 영역의 constant pool에 생성
        *  constant pool은 동등한 String 객체를 하나만 저장하는 공간으로 동일한 String 변수를 효율적으로 사용할 수 있도록 제공
        *  String의 equals()와 hashCode()를 통해 적용*/

        /*설명. 위의 4가지 모두 동등한 String 객체이므로, equals는 true, hashCode는 같은 값*/
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.hashCode() == str3.hashCode(): " + (str1.hashCode() == str3.hashCode()));

        /*필기.
        *  String은 불변 객체(immutable class)*/

        String str = "apple";
        str += ", banana";

        System.out.println("fruits: " + str);
    }
}
