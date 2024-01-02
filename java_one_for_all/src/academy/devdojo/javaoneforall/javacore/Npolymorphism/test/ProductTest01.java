package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProdutcTaxReportService;

// this class was developed by the MVC design
// M - Model(Taxable, Product, Computer, Tomato)
// V - View(ProducTest01)
// C - Control(ProducTaxReportServices)

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10I7", 1000);
        Tomato tomato = new Tomato("Italian", 5);

        ProdutcTaxReportService.genereteComputerTax(computer);
        System.out.println("------------------------------------");
        ProdutcTaxReportService.genereteTomatoTax(tomato);
    }
}
