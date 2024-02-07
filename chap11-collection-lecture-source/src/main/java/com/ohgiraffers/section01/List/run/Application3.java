package com.ohgiraffers.section01.List.run;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        /*수업목표. LinkedList에 대해 이해하고 활용할 수 있다*/
        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size() + "개의 자료");

        /*설명. List 계열 출력하는 4가지 방법*/
        /*목차 1. toString() 활용*/
        System.out.println("LinkedList = " + linkedList);
        System.out.println();

        /*목차 2. for문 활용*/
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println();

        /*목차 3. for-each문(향상된 for문) 활용*/
        for (String str: linkedList) {
            System.out.println(str);
        }
        System.out.println();

        /*목차 4. iterator 활용*/
        /*설명. 반복문 안에서 next()를 두 번 이상 사용하게 되는 경우 유의(변수 활용)*/
        Iterator<String> iter = linkedList.iterator();

        while(iter.hasNext()) {
            String fruit = iter.next();
            System.out.println(fruit);
            System.out.println(fruit);
        }

        /*설명. 1번 인덱스 항목 수정*/
        linkedList.set(1, "pineapple");
        System.out.println(linkedList);

        /*설명. list가 관리하는 요소 전체 제거*/
        linkedList.clear();
        System.out.println(linkedList);

        /*설명. 요소가 없는 list 객체에 대해 boolean값 확인*/
        System.out.println(linkedList.isEmpty());
    }
}
