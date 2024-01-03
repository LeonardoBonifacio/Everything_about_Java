package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;
    private String bestConsumedBefore;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxPrice() {
        System.out.println("Calculation tax price for Tomato");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumedBefore() {
        return this.bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }
}
