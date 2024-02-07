package com.ohgiraffers.section01.List.dto;

import java.awt.print.Book;

public class BookDTO implements Comparable<BookDTO>{
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /*설명. 가격에 대해 오름차순 기준 설정(Comparable 인터페이스 + compareTo 메소드 오버라이딩)*/
    /*필기.
       선택한 필드의 오름차순 또는 내림차순 가능
       정렬은 compareTo 메소드가 반환하는 int형의 부호에 따라 결정
       오름차순: 매개변수로 넘어온 객체의 필드값을 빼는 형태(String형 제외)
       String은 자체로 오버라이딩된 compareTo 함수 존재*/

//    @Override
//    public int compareTo(Object o) {

        /*설명. 연산이 가능한 자료형에 대해 정렬 기준 설졍*/
//        return this.price - ((BookDTO)o).price;       //오름차순
//        return ((BookDTO)o).price - this.price;       //내림차순
//
        /*설명. 연산이 불가한 자료형에 대해 정렬 기준 설졍*/
//        return this.author.compareTo(((BookDTO) o).author);
//        return -this.author.compareTo(((BookDTO) o).author);
//    }

    /*설명. Comparable 인터페이스에 제네릭을 걸면 다운캐스팅 불필요*/
    @Override
    public int compareTo(BookDTO o) {
        return this.title.compareTo(o.title);
    }
}
