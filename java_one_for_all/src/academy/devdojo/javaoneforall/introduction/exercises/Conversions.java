package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put one temperature in celsius to convert to fahrenheit: ");
        double celsius = input.nextDouble();
        System.out.println("This temperature in fahrenheit is: " + fahrenheit(celsius) + "°");

        System.out.print("Now put one temperature in fahrenheit to convert to celsius: ");
        double fahrenheit = input.nextDouble();
        System.out.println("This temperatur in celsius is: " + celsius(fahrenheit) + "°");

    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius){
        return 9.0 / 5.0 * celsius + 32;
    }
}
