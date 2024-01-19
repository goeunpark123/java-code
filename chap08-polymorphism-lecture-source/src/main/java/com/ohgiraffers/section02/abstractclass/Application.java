package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 추상 클래스와 추상 메소드에 대해 이해할 수 있다*/
        /*필기.
        *  추상 클래스와 추상 메소드: 추상 메소드를 0개 이상 포함하는 클래스를 추상 클래스라고 한다
        *
        *필기. 추상 클래스는 생성자를 통해 객체 생성이 불가한 불완전한 클래스이다
        *  자식 클래스 객체가 생성 가능할 때에는 내부적으로 생성 가능하다
        *
        *필기. 추상 메소드는 메소드의 헤드만 있고 바디가 없는 메소드이다
        *  추상 메소드를 하나라도 가진 클래스는 추상 클래스가 되어야 한다
        *  ex) public abstract void method(); */


//        SmartPhone smartPhone = new SmartPhone();

        /*설명. abstract 클래스는 객체 생성 불가*/
//        Product product = new Product();

        /*설명. abstract 메소드를 구현한 온전한 자식 클래스는 객체 생성 가능*/
        SmartPhone smartPhone = new SmartPhone();

        Product product = new SmartPhone();             // 다형성 적용
        product.abstractMethod();                       // 동적 바인딩에 의한 자식 클래스의 오버라이딩 메소드 실행
    }
}
