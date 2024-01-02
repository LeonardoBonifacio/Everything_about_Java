package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxPrice() {
        System.out.println("Calculation tax price for Computer");
        return this.price * TAX_PERCENTAGE;
    }

}
