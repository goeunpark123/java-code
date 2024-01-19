package com.ohgiraffers.section03.overriding;

public class SuperClass {
    /*수업목표. 오버라이딩(Overriding)에 대해 이해할 수 있다*/
    /*필기.
    *  오버라이딩 성립요건
    *   1. 동일한 메소드 이름
    *   2. 동일한 메소드 반환형(리턴 타입)
    *   3. 동일한 매개변수의 타입, 개수, 순서
    *   4. 부모 클래스의 private 메소드는 자식 클래스가 접근이 불가하므로 오버라이딩 불가
    *   5. final 키워드가 사용된 메소드는 오버라이딩 불가
    *   6. 접근 제어자는 부모 메소드와 같거나 더 넓은 범위
    *   7. 예외 처리는 같거나 더 하위 범위의 예외 처리*/

    public void method(int num) {}
    private void privateMethod() {}
    public final void finalMethod() {}
    protected void protectedMethod() {}

    public Object method2(int num) {return null;}
}
