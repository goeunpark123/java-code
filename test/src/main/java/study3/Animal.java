package study3;

public interface Animal {
    public static final String name = "동물";
    int MAX_NUM = 1000;

    public abstract void eat();
    public abstract void move();

    public static void cry() {
        System.out.println("bear cries");
    }
}
