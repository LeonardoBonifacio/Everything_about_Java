package exercises;

import java.util.Scanner;

public class NegativePositiveZeroValues {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Put number 1: ");
    int number1 = input.nextInt();

    System.out.print("Put number 2: ");
    int number2 = input.nextInt();

    System.out.print("Put number 3: ");
    int number3 = input.nextInt();

    System.out.print("Put number 4: ");
    int number4 = input.nextInt();

    System.out.print("Put number 5: ");
    int number5 = input.nextInt();

    int[] numbers = {number1, number2, number3, number4, number5};
    int quantidyPositives = 0;
    int quantidyNegatives = 0;
    int quantidyZeros = 0;
    for (int number : numbers) {
        if (number > 0) {
            quantidyPositives++;
        }
        else if (number < 0) {
            quantidyNegatives++;
        }
        else{
            quantidyZeros++;
        } 
    }
    
    System.out.println("Qtd numbers positives: " + quantidyPositives);
    System.out.println("Qtd numbers negatives: " + quantidyNegatives);
    System.out.println("Qtd numbers zeros: " + quantidyZeros);
    }
}
