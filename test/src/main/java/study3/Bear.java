package study3;

public class Bear implements Animal{
    @Override
    public void eat() {
        System.out.println("bear eats");
    }

    @Override
    public void move() {
        System.out.println("bear moves");
    }
}
