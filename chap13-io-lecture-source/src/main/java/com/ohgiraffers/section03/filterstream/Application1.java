package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        /*수업목표. BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다*/
        /*필기.
        *  내부적으로 버퍼를 활용해서 입출력 성능 향상
        *  추가적인 메소드 제공*/

        /*설명. BufferedWriter를 활용해 한 줄씩 출력*/
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw.write("제목: 세종대왕\n");
            bw.write("문자열 작성 가능!!");

            /*필기.
            *  버퍼를 이용한 출력 시에 버퍼 공간이 가득 차지 않으면 내보내기(출력) X
            *  버퍼에 담긴 내용을 강제로 내보내기 위해서는 flush() 활용
            *  stream을 close()하면 내부적으로 flush() 호출*/

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            /*설명. BufferedReader를 활용해 한 줄(개행 문자 전까지)씩 입력*/
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
                String str = "";
                while((str = br.readLine()) != null) {
                    System.out.println(str);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
