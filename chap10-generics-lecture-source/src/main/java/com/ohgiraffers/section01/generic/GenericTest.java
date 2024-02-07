package com.ohgiraffers.section01.generic;

/*필기.
*  제네릭 클래스의 다이아몬드 연산자(<>) 안에 지정할 수 있는 타입 4가지:
*   E: Element  T: Type  K: Key  V: value*/
public class GenericTest<T> {
    private T value;

    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }
 }
