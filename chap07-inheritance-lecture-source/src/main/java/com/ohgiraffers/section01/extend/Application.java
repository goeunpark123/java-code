package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 상속에 대해 이해할 수 있다*/
        /*필기.
        *  상속은 부모의 멤버를 물려받아 재사용하기 유리하게 만들기 위한 객체지향의 특징이자 문법
        *  단순히 물려받아 재사용하기 보다 부모 클래스의 개념을 확장하는데 의의, 다형성을 적용하기 위한 문법적 토대
        *
        * 필기. 상속의 장점
        *  1. 새로운 클래스를 작성할 시 기존에 작성한 클래스 재사용
        *   1-1. 재사용 시 생산성 크게 향상(생산성 측면)
        *   1-2. 부모 클래스를 수정하면 자식 클래스까지 적용(유지보수 측면)
        *  2. 클래스 간의 계층 관계가 형성되며 다형성의 문법적 토대
        *
        * 필기. 상속의 단점
        *  1. 부모 클래스의 기능 추가/변경 시, 자식 클래스가 정상적으로 작동하게 될지 예측 불가(유지보수에 악영향 가능성)
        *  2. 부모 클래스에서는 중요한 기능이 자식 클래스에서는 무의미할 가능성(불필요한 멤버 자동 추가) */

        /*필기. 메소드 오버라이딩
        *  메소드를 재정의 메소드의 헤드를 그대로 사용하면서 자식 클래스가 정의한 메소드대로 동작하도록 바디를 새롭게 다시 작성
        *  다형성을 적용하면 자식의 오버라이딩된 메소드가 우선적으로 동작(동적 바인딩)*/

        /*필기.
        *  장점과 단점을 고려했을 때, 상속은 오용의 가능성이 있기 때문에 IS-A 관계로 구분되는 경우에만 적용
        *  IS-A 관계 VS HAS-A 관계
        *  자식 클래스 IS-A 부모 클래스*/

        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new FireCar();

        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

        RacingCar racingCar = new RacingCar();

        racingCar.run();
        racingCar.soundHorn();
    }
}
