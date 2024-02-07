package study4;

public class Application {

    public static void main(String[] args) {

        Generic<Integer> g1 = new Generic<>();

        g1.setValue(10);

        System.out.println(g1.getValue());
        System.out.println(g1.getValue() instanceof Integer);
    }


}
