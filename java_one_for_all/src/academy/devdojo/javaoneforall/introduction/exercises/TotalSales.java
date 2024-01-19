package academy.devdojo.javaoneforall.introduction.exercises;

import java.security.SecureRandom;

public class TotalSales {
    public static void main(String[] args) {
        int[][] salesArray = new int[4][5];
        SecureRandom numberGenerator = new SecureRandom();
        for (int i = 0; i < salesArray.length; i++) {
            System.out.println("Person: " + (i + 1));
            int totalSales = 0;
            for (int j = 0; j < salesArray[i].length; j++) {
                salesArray[i][j] = numberGenerator.nextInt(1000);
                totalSales += salesArray[i][j];
                System.out.println("Product number: " + (j + 1));
                System.out.println("This product today sell $" + salesArray[i][j]);
            }
            System.out.println("Total sales of this Seller $" + totalSales);
            System.out.println();
        }
    }
}