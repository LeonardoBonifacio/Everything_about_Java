package exercises;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put number 1: ");
        int number1 = input.nextInt();

        System.out.print("Put number 2: ");
        int number2 = input.nextInt();

        if (number1 % number2 == 0) {
            System.out.println("Number 1: " + number1 +" is multiple of number 2: " + number2);
        }
        else{
            System.out.println("Number 1: " + number1 +" is not  multiple of number 2: " + number2);
        }
    }
}
