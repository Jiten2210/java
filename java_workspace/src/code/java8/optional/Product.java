package code.java8.optional;

public class Product {

    private Double price;

    public Product(final Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }
}