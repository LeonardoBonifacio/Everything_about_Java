package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.ArrayList;

public class PerfectAndPrimeNumbers {
    public static void main(String[] args) {
        int number = 28;

        perfectNumber(number);

        for (int i = 1; i <= 100000; i++) {
            perfectNumber(i);
        }

    }

    public static void perfectNumber(int number){
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

    public static void primeNumber(int number){
    
    }
}
