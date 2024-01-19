package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드까지 모두 초기화하는 생성자 호출");
    }

//    @Override
//    public String toString() {
////        return "Computer{" +
////                "cpu='" + cpu + '\'' +
////                ", hdd=" + hdd +
////                ", ram=" + ram +
////                ", operationSystem='" + operationSystem + '\'' +
////                "} " + super.toString();
//
//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operationSystem='" + operationSystem + '\'' +
//                "} " + "Product{" +
//                "code='" + super.getCode() + '\'' +
//                ", brand='" + super.getBrand() + '\'' +
//                ", name='" + this.getName() + '\'' +
//                ", price=" + this.getPrice() +
//                ", manufacturingDate=" + this.getManufacturingDate() +
//                '}';
//    }
}
