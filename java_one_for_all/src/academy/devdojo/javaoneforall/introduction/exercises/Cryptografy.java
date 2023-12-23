package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class Cryptografy {
    public static int numberInt;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put a number with four-digits: ");
        numberInt = input.nextInt();
        String numberString = "";

        int firstDigit = numberInt/ 1000;
        int secondDigit = numberInt % 1000 / 100;
        int thirdDigit = numberInt % 100 / 10;
        int fourthDigit = numberInt % 10;
        firstDigit = ReplaceDigitWithAdd7AndMore(firstDigit);
        secondDigit = ReplaceDigitWithAdd7AndMore(secondDigit);
        thirdDigit = ReplaceDigitWithAdd7AndMore(thirdDigit);
        fourthDigit = ReplaceDigitWithAdd7AndMore(fourthDigit);
        numberString  = thirdDigit + "" + fourthDigit + "" + firstDigit + "" + secondDigit;
        numberInt = Integer.parseInt(numberString);
        System.out.println("Here your number Cryptografy: " + numberInt);
        firstDigit = replaceDigitWithSubtract7AndMore(firstDigit);
        secondDigit = replaceDigitWithSubtract7AndMore(secondDigit);
        thirdDigit = replaceDigitWithSubtract7AndMore(thirdDigit);
        fourthDigit = replaceDigitWithSubtract7AndMore(fourthDigit);
        System.out.print("Here you number Descryptografy: ");
        System.out.print(firstDigit);
        System.out.print(secondDigit);
        System.out.print(thirdDigit);
        System.out.print(fourthDigit);
        

    }

    public static int ReplaceDigitWithAdd7AndMore(int digit){
        digit += 7;
        digit = digit % 10;
        return digit;
    }

    public static int replaceDigitWithSubtract7AndMore(int digit) {
        digit = (digit + 3) % 10;
        return digit;
    }
    
}
