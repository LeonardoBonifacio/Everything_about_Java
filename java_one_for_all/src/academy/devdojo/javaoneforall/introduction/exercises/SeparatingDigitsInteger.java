package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class SeparatingDigitsInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put one number: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 1000 / 100;
        int fourtDigit = number % 10000 / 1000;
        int fiftyDigit = number % 100000 / 10000;
        System.out.println(firstDigit + "" + secondDigit + "" + thirdDigit + "" + fourtDigit + "" + fiftyDigit);
    }
}
