package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put on number and i'll give to you your factorial: ");
        int number = input.nextInt();
        int factorial = 1;
        for (int i = number; i != 0; i--) {
            factorial *= i;
        }
        System.out.println("The factorial is: " + factorial);
    }
}
