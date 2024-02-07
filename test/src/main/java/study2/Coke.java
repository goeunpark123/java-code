package study2;

public class Coke extends Product {
    public Coke() {
    }

    public Coke(int price) {
        super(price);
    }

    @Override
    public void buy() {
        System.out.println("콜라 구매");
    }

    public void drink() {
        System.out.println("콜라 마시기");
    }
}
