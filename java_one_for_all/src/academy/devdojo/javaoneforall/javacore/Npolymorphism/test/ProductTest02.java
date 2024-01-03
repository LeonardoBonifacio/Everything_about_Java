package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        // here we hava a reference variable of one type and one object of one diferent type(even though the object is inherited all
        // of the reference variable(Product))
        // This is call widening cast(when we send a subclass object to a superclass reference variable)
        Product product = new Computer("Ryzen 9 ", 1000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxPrice());

        System.out.println();

        Product product2 = new Tomato("Dutch", 7);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxPrice());


        



        
    }
}
