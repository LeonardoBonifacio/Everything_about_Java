package exercises;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contNumber = 0;
        int number;
        while (contNumber != 7 - 2) {
            System.out.print("Please put one number between one and thirty: ");
            number = input.nextInt();
            if (number < 0 || number > 30) {
                System.out.print("Please put one number between one and thirty: ");
                number = input.nextInt();
            }
            else{
                contNumber++;
                System.out.println(number);
                for (int i = 1; i <= number; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}