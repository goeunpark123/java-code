package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

    /*수업목표. try-with-resource 구문의 문법을 이해하고 활용할 수 있다*/
        /*설명. finally를 따로 작성할 필요 없이 자동으로 close()*/
        try (BufferedReader br = new BufferedReader(new FileReader("test.dat"))) {
            String s;

            while((s=br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
