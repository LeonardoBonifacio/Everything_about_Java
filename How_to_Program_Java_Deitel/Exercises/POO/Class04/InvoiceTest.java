package Exercises.POO.Class04;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice computer = new Invoice("2", "Peças restantes do meu pc gamer", 2, 843.00);
        double invoiceAmount;

        computer.printAll();
        invoiceAmount = computer.getInvoiceAmount();
        System.out.println("The full price of all is: "+ invoiceAmount);
    }
}
