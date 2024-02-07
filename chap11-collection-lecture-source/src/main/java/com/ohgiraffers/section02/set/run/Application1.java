package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다*/
//        HashSet<String> hset = new HashSet<>();
        Set<String> hset = new HashSet<>();         // 다형성을 적용한 형태

        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        System.out.println("hset = " + hset);

        hset.add(new String("mariaDB"));
        hset.add(new String("mariaDB1"));

        /*설명. 중복값은 Set에 추가되지 않는다(동등 객체 저장 X, equals와 hashCode 오버라이딩 필요)*/
        /*설명. 중복되는 값은 add 과정에서 Set에 아예 추가되지(덮어쓰지) X */
        System.out.println("hset = " + hset);

        /*설명. 인덱스 개념이 없는 Set은 iterator를 돌리거나 배열로 바꿔야 확인 가능*/
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println();

        Object[] objArr = hset.toArray();
        for(Object obj: objArr) {
            System.out.println((String)obj);
        }

        System.out.println("size(): " + hset.size());
        hset.clear();

        System.out.println("size(): " + hset.size());
        System.out.println("isEmpty(): " + hset.isEmpty());
    }
}
