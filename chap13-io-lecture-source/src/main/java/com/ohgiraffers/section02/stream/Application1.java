package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream을 사용할 수 있다*/
        FileInputStream fin = null;

        try {
            fin = new FileInputStream(
                    "src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            /*필기.
            *  FileInputStream에서 제공하는 read() 메소드를 활용하여 데이터 1byte씩 읽기 가능
            *  read() 메소드가 변환하는 값은 int인데 더 이상 데이터가 존재하지 않으면 EOF(-1)을 반환
            *  반환되는 값은 int이므로 문자로 활용하기 위해서는 char 형변환 필요*/

            int input = 0;

//            while((input = fin.read())!= -1) {
//                System.out.println((char)input);
//            }

            /*설명. 파일로부터 읽어온 값을 ArrayList에 누적*/
            List<Character> arr = new ArrayList<>();

            while((input = fin.read()) != -1) {
                arr.add((char) input);
            }

            for (char ch: arr) {
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일 없음");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
