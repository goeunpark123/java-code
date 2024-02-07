package study2;

public class Burger extends Product {
    public Burger() {
    }

    public Burger(int price) {
        super(price);
    }

    @Override
    public void buy() {
        System.out.println("버거 구매");;
    }

    public void eat() {
        System.out.println("버거 먹기");
    }
}
