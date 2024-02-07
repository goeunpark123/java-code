package study;

public class SingletonTest {
    private static SingletonTest moon = new SingletonTest();

    private SingletonTest() {}

    public static SingletonTest getInstance() {return moon;}
}
