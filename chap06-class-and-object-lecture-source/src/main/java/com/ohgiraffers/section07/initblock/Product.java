package com.ohgiraffers.section07.initblock;

public class Product {
    private String name;                                                            // - 0
    private int price;
    private static String brand;

    /*설명. 생성자를 통한 객체 생성 전에 알고리즘을 적용해야 할 일이 있다면 초기화 블럭을 활용할 수 있다*/
    {
        System.out.println("초기화 블럭 실행");                                        // - 2
        name = "C";
        brand = "G";
    }

    /*수업목표. static 초기화 블럭은 static 변수만 초기화 가능, 다른 초기화 블럭보다 먼저 실행*/
    static {
        System.out.println("static 초기화 블럭 실행");
        brand = "L";                                                                // - 1
    }

    public Product() {
        System.out.println("Product 기본 생성자 실행");
    }

    public Product(String name) {
        this.name = name;                                                           // - 3
        System.out.println("Product 매개변수 1개 생성자 실행");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand=" + Product.brand +
                '}';
    }
}
