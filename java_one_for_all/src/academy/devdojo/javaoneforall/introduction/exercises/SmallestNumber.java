package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How much number you want analyze? ");
        int qtdNumbers = input.nextInt();
        int numberInAnalize;
        int smallestNumber = 1;
        for (int i = 1; i <= qtdNumbers; i++) {
            System.out.print("Put the " + i + "º number: ");
            numberInAnalize = input.nextInt();
            if (i == 1) {
                smallestNumber = numberInAnalize;   
            }
            else{
                if (numberInAnalize < smallestNumber) {
                    smallestNumber = numberInAnalize;
                }
            }
        }

        System.out.println("The smallest Number is: " + smallestNumber);

        minimun(3,2,1,-12,3,9123,1);

    }

    public static void minimun(int... numbers){
        int smallNumber = numbers[0];
        for (int number : numbers) {
            smallNumber = Math.min(smallNumber, number);
        }
        System.out.println("The small number is: " + smallNumber);
    }
}
