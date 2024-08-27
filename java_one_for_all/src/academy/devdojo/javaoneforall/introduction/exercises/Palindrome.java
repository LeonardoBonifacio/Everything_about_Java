package exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fiveInteger;

        while (true) {
            System.out.print("Put a number with five digits: ");
            fiveInteger = scanner.next();
            if (fiveInteger.length() != 5) {
                System.out.println("Please put a number with five numbers only:");
            } else {
                break;
            }
        }
        String integerFive = "";
        for (int i = 4; i >= 0; i--) {
            integerFive += fiveInteger.charAt(i);
        }
        if (fiveInteger.equals(integerFive)) {
            System.out.println("Is a palindrome");
            System.out.println(fiveInteger);
            System.out.println(integerFive);
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}