package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put number 1: ");
        int number1 = input.nextInt();
        System.out.print("Put number 2: ");
        int number2 = input.nextInt();
        System.out.print("Put number 3: ");
        int number3 = input.nextInt();
        int sum = number1 + number2 + number3;
        System.out.println("Your sum is : " + (number1 + number2 + number3) +  " or " + sum);
        System.out.println("The produtc of " + number1 + " x " + number2 + " x " + number3 +  " = " + (number1 * number2 * number3));
        if (sum != 7) {
            System.out.println("The variable sum is not equal to 7");
        }

    }
}