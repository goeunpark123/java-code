package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표. 표준 입출력을 이해하고 활용할 수 있다*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자열 입력: ");

        try {
            String value = br.readLine();
            System.out.println("value = " + value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        BufferedWriter bw = null;
        OutputStreamWriter osw = null;

        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw!=null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
