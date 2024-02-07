package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. extends 키워드를 사용하여 특정 타입만 제네릭 타입으로 사용하도록 제한할 수 있다*/
        /*설명. Rabbit이거나 Rabbit의 자식 타입인 경우에만 제네릭 타입으로 사용 가능*/
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Snake> farm2 = new RabbitFarm<Snake>();
//        RabbitFarm<Mammal> farm3 = new RabbitFarm<Mammal>();

        /*설명. Rabbit 또는 Rabbit의 자식 타입으로 인스턴스 생성 가능*/
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();
        farm4.setAnimal(new Bunny());       //동적 바인딩에 의해 반환형인 Animal의 cry()가 아닌 Bunny의 cry()가 실행
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }
}
