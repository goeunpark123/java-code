package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{
    /*설명 0. 부모 메소드와 이름, 반환형, 매개변수, 접근 제어자 모두 동일한 경우에 오버라이딩 성립*/
//    @Override
//    public void method(int num) {}

    /*설명 1. 메소드 이름 변경(에러 발생)*/
//    @Override
//    public void method1(int num) {}

    /*설명 2. 메소드 리턴 타입 변경(에러 발생)*/
//    @Override
//    public String method(int num) {return null;}

    /*설명 3. 메소드의 매개변수 변경(에러 발생)*/
//    @Override
//    public void method(int num, int num2) {}

    /*설명 4. 부모 메소드 반환형 자식 타입으로만 반환형 변경 가능*/
    public String method2(int num) {return null;}

    /*설명 5. private 메소드는 오버라이딩 불가*/
//    @Override
//    private void privateMethod() {}

    /*설명 6. final 메소드는 오버라이딩 불가*/
//    @Override
//    public final void finalMethod() {}

    /*설명 7. 부모 타입과 같은 접근 제어자이거나 더 넓은 범위의 접근 제어자로 오버라이딩 가능*/
//    @Override
//    public void protectedMethod() {}
}

//public - protected - (default) - private
//protected: 자식 클래스는 다른 패키지에 위치한 경우에도 접근 가능