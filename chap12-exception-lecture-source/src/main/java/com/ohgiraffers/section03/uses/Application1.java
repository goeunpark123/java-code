package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표. 예외 처리를 많이 사용하는 io 패키지에서 예외 처리를 사용하는 구문을 이해할 수 있다*/
        /*설명. 예외 처리를 가장 많이 사용하게 되는 상황(호출 흐름)*/

        System.out.println(new File("test.dat").getAbsoluteFile());

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("test1.dat"));

            String s = "";
            System.out.println(br.readLine());

            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일 X");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            /*필기.
            *  예외 처리 구문과 상관 없이 반드시 수행해야 하는 경우 finally에 작성하며 보통 사용한 자원을 반납하는 목적으로 사용*/
            try {
                /*설명.
                *  스트림이 생성되지 않았을 경우에 접근해서 close()를 호출하게 되면 NullPointException이 발생 -> 방지를 위해 if문 활용*/
                if(br!=null) {
                    /*설명. 입출력에서 사용한 스트림을 닫는 메소드, API 에서 확인해보면 IOException을 throws하는 메소드이므로
                    *  finally 블럭 안이라도 예외 처리를 중첩으로 작성*/
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
