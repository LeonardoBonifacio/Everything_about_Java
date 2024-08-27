package exercises;

import java.util.ArrayList;
import java.util.List;

public class PerfectAndPrimeNumbers {
    public static void main(String[] args) {
        int number = 28;

        // perfectNumber(number);

        for (int i = 1; i <= 100000; i++) {
            perfectNumber(i);
        }

        for (int i = 1; i <= 1000; i++) {
            primeNumber(i);
        }

    }

    public static void perfectNumber(int number) {
        int sumDivisors = 0;
        ArrayList<Integer> numbersDivisors = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0 || i == 1) {
                sumDivisors += i;
                numbersDivisors.add(i);
            }
        }
        if (sumDivisors == number) {
            System.out.println();
            System.out.println("This number: " + number + " is a perfect number");
            System.out.println("Here are your factors -> " + numbersDivisors);
            System.out.println();
            return;
        }
        System.out.println("This number " + number + " isn't a perfect number");
    }

    public static void primeNumber(int number) {
        List<Integer> divisors = new ArrayList<>();
        int countDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (i == 1 || number % i == 0) {
                divisors.add(i);
                countDivisors++;
            }
        }
        if (countDivisors == 2) {
            System.out.println();
            System.out.println("This number " + number + " is Prime because he is only divited by -> " + divisors);
            System.out.println();
            return;
        }
        System.out.println("This number " + number + " isn't Prime because he is divited by -> " + divisors);

    }
}
