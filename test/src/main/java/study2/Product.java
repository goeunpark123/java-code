package study2;

public class Product {
    private int price;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void buy() {
        System.out.println("구매");
    }
}
