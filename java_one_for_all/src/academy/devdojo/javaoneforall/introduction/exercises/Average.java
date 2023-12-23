package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Enter the next grade: ");
            total += input.nextDouble();
            gradeCounter++;
        }
        System.out.println("Total of all grades is: " + total);
        total /= 10;
        System.out.println("The average is: " + total);

        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        // Check this site after(https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow)
        // for more understanding of intefer overflow
    }
}
