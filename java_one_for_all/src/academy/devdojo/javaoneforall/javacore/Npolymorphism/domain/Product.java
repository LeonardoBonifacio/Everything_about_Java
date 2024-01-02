package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public abstract class Product implements Taxable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getprice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
