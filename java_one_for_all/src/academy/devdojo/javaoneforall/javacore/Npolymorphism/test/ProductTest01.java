package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Television;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

// this class was developed by the MVC design
// M - Model(Taxable, Product, Computer, Tomato)
// V - View(ProducTest01)
// C - Control(ProducTaxReportServices)

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10I7", 1000);
        Tomato tomato = new Tomato("Italian", 5);
        Television television = new Television("Samsung", 700);

        // This is call widening cast(when we send a subclass object to a superclass
        // reference variable), but for one method which receive whatever object of the
        // superclass and subclass
        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("------------------------------------");
        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("--------------------------------------");
        ProductTaxReportService.generateTaxReport(television);
    }
}
