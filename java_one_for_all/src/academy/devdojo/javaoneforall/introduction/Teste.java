package academy.devdojo.javaoneforall.introduction;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the square
        System.out.print("Enter the size of the square (between 1 and 20): ");
        int size = scanner.nextInt();

        // Validate input size
        if (size < 1 || size > 20) {
            System.out.println("Invalid size. Please enter a size between 1 and 20.");
        } else {
            // Display hollow square
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            scanner.close();

        }
    }
}