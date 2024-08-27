package exercises;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please put any number: ");
        double number = input.nextDouble();

        System.out.println("Here your number: " + number);
        roundToInteger(number);
    }

    public static void roundToInteger(double number) {
        number = Math.floor(number + 0.5);
        System.out.println("Here your number roundToInteger " + number);
    }

    public static void roundToTenths(double number) {
        number = Math.floor(number * 10 + 0.5) / 10;
        System.out.println("Here your number roundToTenths " + number);
    }

    public static void roundToHundredths(double number) {
        number = Math.floor(number * 10 + 0.5) / 100;
        System.out.println("Here your number roundToHundredths " + number);
    }

    public static void roundToThousandths(double number) {
        number = Math.floor(number * 10 + 0.5) / 1000;
        System.out.println("Here your number roundToThousandths " + number);
    }
}
