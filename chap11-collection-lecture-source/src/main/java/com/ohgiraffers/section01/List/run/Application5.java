package com.ohgiraffers.section01.List.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        
        /*수업목표. Queue에 대해 이해하고 사용할 수 있다*/
        /*필기.
        *  Queue: LinkedList를 사용하여 구현하는 선형 메모리 공간에 데이터를 저장하며 순서를 유지하기 위한 선입선출 자료구조*/

//        Queue<String> que = new Queue();                        // 에러 발생
//        Queue<String> que = new LinkedList<>();
        PriorityQueue<String> que = new PriorityQueue<>();      // queue에 최우선 가치의 요소 순서를 가장 앞으로 정렬하는 기능 추가
        
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        System.out.println("peek(): " + que.peek());
        System.out.println("peek(): " + que.peek());

        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());

        System.out.println("que = " + que);
    }
}
