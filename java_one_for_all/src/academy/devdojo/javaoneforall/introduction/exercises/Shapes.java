package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        System.out.println("*********     ***       *        **");
        System.out.println("*       *    *   *     ***      *  *");
        System.out.println("*       *   *     *   *****    *    *");
        System.out.println("*       *   *     *     *     *      *");
        System.out.println("*       *   *     *     *    *        *");
        System.out.println("*       *   *     *     *   *          *");
        System.out.println("*       *   *     *     *    *        *");
        System.out.println("*       *   *     *     *     *      *");
        System.out.println("*       *    *   *      *       *   *");
        System.out.println("*********      *        *         *");

        System.out.println();
        System.out.println();


        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");


        System.out.println();
        System.out.println();



        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");
        

        System.out.println();
        System.err.println();


        String pattern = "********";
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + pattern);
                continue;
            }
            System.out.println(pattern);
        }

        System.out.println();
        System.out.println();


        Scanner input = new Scanner(System.in);
        int oddNumber;
        while (true) {
            System.out.print("Put a number of row to the diamond(between 1 and 19 and odd): ");
            oddNumber = input.nextInt();
            if ((oddNumber >= 1 && oddNumber <= 19) && oddNumber % 2 != 0) {
                break;
            }
            System.out.print("This number must be in range 1 to 19 and be and odd number, put again:  ");
            oddNumber = input.nextInt();
        }


    
        String[] patters = {"*", "*", "*", "*", "*", "*", "*", "*","*","*","*","*","*","*","*","*","*","*","*"};
        
        for (int i = 0; i <= oddNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(patters[j]);
            }
            System.out.println();
        }
        for (int i = oddNumber; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(patters[j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();



        displayinSquareOfAnyCharacter(7, "!");

    }

    public static void displayinSquareOfAnyCharacter(int size, String character){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
