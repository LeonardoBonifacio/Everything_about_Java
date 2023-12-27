package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productNumber;
        double total = 0;
        while (true) {
            System.out.println("Please choose as much products you want: ");
            System.out.println("[1] - Product number   - > Price $ 2.98");
            System.out.println("[2] - Product number   - > Price $ 4.49");
            System.out.println("[3] - Product number   - > Price $ 9.98");
            System.out.println("[4] - Product number   - > Price $ 4.99");
            System.out.println("[5] - Product number   - > Price $ 7.89");
            System.out.print("-> ");
            productNumber = input.nextInt();
            if (productNumber < 1 || productNumber > 5) {
                System.out.println("Please choose one correct product: ");
                System.out.print("-> ");
                productNumber = input.nextInt();
            } else {
                switch (productNumber) {
                    case 1:
                        total += 2.98;
                        break;
                    case 2:
                        total += 4.49;
                        break;
                    case 3:
                        total += 9.98;
                        break;
                    case 4:
                        total += 4.99;
                        break;
                    case 5:
                        total += 7.89;
                        break;
                }
                char skipOrNot;
                System.out.println("Do you want continue to buy some more products? [S] - Sim [N] - Não");
                System.out.print("-> ");
                skipOrNot = input.next().toUpperCase().charAt(0);
                if (skipOrNot == 'N') {
                    System.out.println("Program finished");
                    System.out.println("You must pay $" + total + " for your buys");
                    break;
                }
            }

        }
    }
}
