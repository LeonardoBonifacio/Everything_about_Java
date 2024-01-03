package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

// import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
// import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {

    // this method will receive whatever object which is a Product(because of the
    // inheritance rules)
    public static void generateTaxReport(Product product) {
        System.out.println("Starting the tax report: ");
        double taxValue = product.calculateTaxPrice();
        System.out.println("Product: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Product tax price: " + taxValue);
        // this right here is called narrowing casting(explicitly doing the cast)
        // here we are receiving one object from the superClass Product, and casting
        // this object for the Type of the Class Tomato
        // so that we might access the attribute only inside the objects of class tomato
        if (product instanceof Tomato) {
            // but if we send one object which is not a tomato we are going to receive a
            // CastingError
            // that's why we must testing if the product that us receive is a instaceof of
            // the class we are going to casting
            Tomato tomato = (Tomato) product;
            System.out.println("Best consumed before: " + tomato.getBestConsumedBefore());
            // i can also do this like this
            //System.out.println("Best consumed before: " + ((Tomato) product));
            // whithout creating the instace variable of Tomato
        }
    }

    // public static void genereteComputerTax(Computer computer) {
    // System.out.println("Starting the report for computer");
    // double taxPrice = computer.calculateTaxPrice();
    // System.out.println("Computer: " + computer.getName());
    // System.out.println("Price: " + computer.getPrice());
    // System.out.println("Tax price: " + taxPrice);
    // }

    // public static void genereteTomatoTax(Tomato tomato) {
    // System.out.println("Starting the report for Tomato");
    // double taxPrice = tomato.calculateTaxPrice();
    // System.out.println("Tomato: " + tomato.getName());
    // System.out.println("Price: " + tomato.getPrice());
    // System.out.println("Tax price: " + taxPrice);
    // }

}
