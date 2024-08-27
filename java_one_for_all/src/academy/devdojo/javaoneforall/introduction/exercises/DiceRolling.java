package exercises;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        SecureRandom numberGenerator = new SecureRandom();
        int dice1;
        int dice2;
        int numberOfRolls = 36_000_000;
        int[] array = new int[13];
        for (int i = 1; i < numberOfRolls; i++) {
            if (i == 1) {
                for (int j = 1; j < 7; j++) {
                    System.out.print("  " + j);
                }
                System.out.println();
                for (int j = 1; j < 7; j++) {
                    System.out.println(j + " " + (j + 1) + "  " + (j + 2) + "  " + (j + 3) + "  " + (j + 4) + "  "
                            + (j + 5) + "  " + (j + 6) );
                    // print here
                }
            }
            dice1 = 1 + numberGenerator.nextInt(6);
            dice2 = 1 + numberGenerator.nextInt(6);
            array[dice1 + dice2]++;

        }
        System.out.println("For playing this dices " + numberOfRolls + " times , you get this information.");
        for (int i = 2; i < array.length; i++) {
            System.out.println("Numbers of Sums wich result in ->  " + i + "  ->  "+ array[i]);
        }
    }
}
