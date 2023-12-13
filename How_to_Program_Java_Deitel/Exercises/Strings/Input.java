package Exercises.Strings;

import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put number 1: ");
        int number1 = input.nextInt();
        System.out.print("Put number 2: ");
        int number2= input.nextInt();
        int sum = number1 + number2;
        System.out.println("Your sum is : " + (number1 + number2) +  " or " + sum);
    }
}