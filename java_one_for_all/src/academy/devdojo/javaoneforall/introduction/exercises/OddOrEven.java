package Exercises.Math;

import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put one number : ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number: " + number + " Is even");
        }
        else{
            System.out.println("The number: " + number + " Is odd");
        }
    }
}
