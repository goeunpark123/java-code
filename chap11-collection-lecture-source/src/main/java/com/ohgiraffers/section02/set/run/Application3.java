package com.ohgiraffers.section02.set.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {
    
        /*수업목표. TreeSet에 대해 이해하고 활용할 수 있다*/
        Set<String> tSet = new TreeSet<>();
        
        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("friedEgg");
        tSet.add("soup");

        System.out.println("tSet = " + tSet);

        /*설명. TreeSet 사용하지 않고 중복되지 않는 번호 뽑는 로또 번호 발생기*/
//        Set<Integer> lotto = new TreeSet<>();
//
//        while(lotto.size() < 6) {
//            lotto.add((int) ((Math.random() * 45) + 1));
//        }
//
//        System.out.println("lotto = " + lotto);

        int[] lotto2 = new int[6];

        int cnt = 0;
        boolean flag;

        while(cnt < 6) {
            int number = (int) (Math.random() * 45) + 1;
            flag = false;

            for (int i = 0; i < cnt; i++) {
                if (number == lotto2[i]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                lotto2[cnt] = number;
                cnt += 1;
            }
        }

        Arrays.sort(lotto2);

        System.out.println("lotto2 = " + Arrays.toString(lotto2));
    }
}
