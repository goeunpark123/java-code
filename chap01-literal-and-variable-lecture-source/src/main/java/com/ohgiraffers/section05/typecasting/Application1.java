package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 자동 형변환(implicit coercion) 규칙에 대해 이해할 수 있다*/
        
        /*설명. 더 큰 자료형으로 데이터를 대입하면 자동 형변환*/
        byte bnum = 1;              // 리터럴이 정수인 경우에는 항상 int로 인식하지만 int보다 작은 자료형
        short snum = bnum;          // int -> byte, int -> short으로 자동 형변환
        int inum = snum;
        long lnum = inum;
        
        /*설명. 연산 시 피연산자 중 더 큰 자료형에 맞춰서 자동 형변환*/
        int num1 = 10;
        long num2 = 20L;
        
        long result = num1 + num2;

        System.out.println("result = " + result);
        
        /*설명. 문자형은 int로 자동 형변환(반대의 경우도 가능)*/
        int ch1 = 'a';
        int charNum = ch1;
        System.out.println("charNum = " + charNum);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
    }
}
