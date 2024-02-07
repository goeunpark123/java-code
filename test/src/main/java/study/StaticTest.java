package study;

public class StaticTest {
    private static double number;

    public StaticTest() {
    }

    public void setStaticNumber(int n) {StaticTest.number = n;}
    public double getStaticNumber() {return number;}
    public static void increaseNumber() {StaticTest.number++;}

}
