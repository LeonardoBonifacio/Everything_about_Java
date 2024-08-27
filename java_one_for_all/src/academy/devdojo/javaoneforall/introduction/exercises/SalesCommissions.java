package exercises;

import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        double receiveBasis = 200D;
        double grossSales;
        double percentOfPayment = 0.09D;
        int[] counterRange = new int[11];
        Scanner input = new Scanner(System.in);
        double totalPayment;
        while (true) {
            System.out.print("Please put how much do you sell this week for receive your payment -> R$ ");
            grossSales = input.nextDouble();
            if (grossSales <= 0) {
                System.out.println("I will understand that you wont sell nothing this week, so your payment is only R$"
                        + receiveBasis);
                break;
            }
            totalPayment = receiveBasis + (grossSales * percentOfPayment);
            System.out.println("Your total payment is: R$" + totalPayment);
            if(totalPayment <= 999){
                ++counterRange[(int) totalPayment / 100];
            }
            else{
                ++counterRange[10];
            }
            System.out.println("Do you want to continue input values of other coworkers ?");
            char resp = input.next().toUpperCase().charAt(0);
            if (resp == 'N') {
                break;
            }
        }
        for (int barLenght = 0; barLenght < 11; barLenght++) {
            if (barLenght == 10) {
                System.out.printf("%5d: ", 1000);
            }
            else{
                System.out.printf("%02d-%02d: ", barLenght * 100, barLenght * 100 + 99);
            }

            for (int stars = 0; stars < counterRange[barLenght]; stars++) {
                System.out.print("*");
             } 
             System.out.println(); 
        } 
        input.close();
    }
}
