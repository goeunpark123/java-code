package study2;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(5000);
        Burger burger = new Burger(6000);
        Coke coke = new Coke(7000);

        product.buy();
        burger.buy();
        coke.buy();
        System.out.println();

        Product pr1 = new Product();
        Product pr2 = new Burger();
        Product pr3 = new Coke();

        pr1.buy();
        pr2.buy();
        pr3.buy();
        System.out.println();

        if(pr2 instanceof Burger) ((Burger)pr2).eat();
        if(pr3 instanceof Coke) ((Coke)pr3).drink();

        Product pr4 = new Burger();
        Coke coke2 = (Coke)pr3;

        Product[] products = new Product[5];

        products[0] = new Burger();
        products[1] = new Coke();
        products[2] = new Burger();
        products[3] = new Coke();
        products[4] = new Product();

        for(Product product4 : products) {
            product4.buy();

            if (product4 instanceof Burger) {
                ((Burger) product4).eat();
            }
            if (product4 instanceof Coke) {
                ((Coke) product4).drink();
            }
        }

        Main m = new Main();

        m.buy(new Burger());
        m.buy(new Coke());

        Product product5 = m.getRandomProduct();
        product5.buy();
    }

    private void buy(Product product) {product.buy();}

    private Product getRandomProduct() {
        int random = (int)(Math.random() * 2);

        return random == 0 ? new Burger() : new Coke();
    }
}
