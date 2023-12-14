package Exercises.Math;


import java.util.Scanner;
public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put number 1: ");
        int number1 = input.nextInt();

        int largestNumber = number1;
        int smallestNumber = number1;
        
        System.out.print("Put number 2: ");
        int number2 = input.nextInt();
        if (number2 > largestNumber) {
            largestNumber = number2;
        }
        if (number2 < smallestNumber) {
            smallestNumber = number2;
        }
        System.out.print("Put number 3: ");
        int number3 = input.nextInt();
        if (number3 > largestNumber) {
            largestNumber = number3;
        }
        if (number3 < smallestNumber) {
            smallestNumber = number3;
        }
        System.out.print("Put number 4: ");
        int number4 = input.nextInt();
        if (number2 > largestNumber) {
            largestNumber = number4;
        }
        if (number4 < smallestNumber) {
            smallestNumber = number4;
        }
        System.out.print("Put number 5: ");
        int number5 = input.nextInt();
        if (number5 > largestNumber) {
            largestNumber = number5;
        }
        if (number5 < smallestNumber) {
            smallestNumber = number5;
        }

        int[] numbers = {number1, number2, number3, number4, number5};

        System.out.println("Among all these numbers: ");
        for(int num : numbers){
           System.out.println(num);
        }
        System.out.println(numbers);
        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The smallest number is: " + smallestNumber);
    }    
}