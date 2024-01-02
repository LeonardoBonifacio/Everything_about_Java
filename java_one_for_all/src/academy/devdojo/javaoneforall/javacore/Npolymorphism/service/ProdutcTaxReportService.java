package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProdutcTaxReportService {

    public static void genereteComputerTax(Computer computer){
        System.out.println("Starting the report for computer");
        double  taxPrice = computer.calculateTaxPrice();
        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: " + computer.getprice());
        System.out.println("Tax price: " + taxPrice);
    }

    public static void genereteTomatoTax(Tomato tomato){
        System.out.println("Starting the report for Tomato");
        double  taxPrice = tomato.calculateTaxPrice();
        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Price: " + tomato.getprice());
        System.out.println("Tax price: " + taxPrice);
    }
}
