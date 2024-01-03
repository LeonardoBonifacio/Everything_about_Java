package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Television extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxPrice() {
        System.out.println("Calculating Tax Value for Television");
        return this.price * TAX_PERCENTAGE;
    }

}
