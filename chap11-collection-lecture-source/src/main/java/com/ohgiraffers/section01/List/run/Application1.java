package com.ohgiraffers.section01.List.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 컬렉션 프레임 워크에 대해 이해할 수 있다*/
        ArrayList aList = new ArrayList();
//        ArrayList<Objects> aList = new ArrayList<Objects>();    // 다이아몬드 연산자 없는 제네릭 클래스는 <Object>가 디폴트

        List list = new ArrayList();                            // 컬렉션은 다형성을 적용한 형태를 주로 사용
//        list = new Vector();
//        Collection col = new ArrayList();

        aList.add("apple");
        aList.add("125");
        aList.add(45.67);
        aList.add(new java.util.Date());

        System.out.println("aList = " + aList);
        System.out.println(aList.get(0));
        System.out.println(aList.get(1));
        System.out.println("aList에 담긴 데이터의 크기: " + aList.size());   // ArrayList에 추가한 값의 크기

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));           // toString() 동적 바인딩
        }

        /*필기. ArrayList의 장점
        *  1. 크기 할당 생략 가능
        *  2. 중간에 값 삽입 및 삭제 용이 */

        /*설명. 배열을 활용하여 각각 원하는 인덱스에 값 삽입*/
        int[] intArr = new int[5];
        int num = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ++num;
        }

        System.out.println(Arrays.toString(intArr));

        int[] newArr = new int[intArr.length + 1];

        System.arraycopy(intArr, 0, newArr, 0, intArr.length);
        System.out.println(Arrays.toString(newArr));

        for (int i = newArr.length - 2; i > 1; i--) {
//            for (int i = 2; i < newArr.length - 1; i++)     // 값 전체를 뒤로 옮길 때 앞 인덱스부터 이동하면 X -> 같은 값 계속 복사
            newArr[i + 1] = newArr[i];
        }

        System.out.println(Arrays.toString(newArr));

        newArr[2] = 7;

        System.out.println(Arrays.toString(newArr));

        /*설명. ArrayList에서 제공하는 add 메소드 사용*/

        ArrayList<Integer> intArrList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            intArrList.add(i + 1);
        }

        System.out.println(intArrList);
        intArrList.add(2, 7);

        System.out.println(intArrList);

        /*설명. ArrayList는 중복 저장 허용*/
        System.out.println(aList);

        aList.add(123);
        aList.add("apple");

        System.out.println(aList);

        /*설명. set() 메소드로 인덱스 선택하여 값 변경*/
        aList.set(1, 777);
        System.out.println(aList);

        /*설명. remove() 메소드로 인덱스 선택하여 값 삭제 (크기도 -1)*/
        aList.remove(1);
        System.out.println(aList);

        // ArrayList에는 기본 자료형을 저장할 수 없다. (auto-boxing 일어난 참조 자료형만 저장 가능)
        
        
        /*설명. ArrayList를 활용한 정렬*/
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList = " + stringList);

        /*설명. Collections의 sort()를 활용한 정렬*/
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);
//        stringList.sort();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(20);
        integerList.add(5);
        integerList.add(8);
        integerList.add(14);

        System.out.println("integerList = " + integerList);

        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);

        stringList = new LinkedList<>(stringList);

        /*설명. 내림차순으로 바꾸기 위해 ArrayList에서 LinkedList로 교체*/
        stringList = new LinkedList<>(stringList);
        Iterator<String> iter = ((LinkedList<String>)stringList).descendingIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
