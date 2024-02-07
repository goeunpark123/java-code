package com.ohgiraffers.section02.extend.vo;

public class RabbitFarm <T extends Rabbit> {    // Rabbit이나 Rabbit의 하위 클래스만 가능
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
