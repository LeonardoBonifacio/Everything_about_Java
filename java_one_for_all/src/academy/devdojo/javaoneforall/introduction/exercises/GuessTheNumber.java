package exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        SecureRandom numberGenerator = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int numberToGuessed = 1 + numberGenerator.nextInt(1000);
        int tryToGuess = 0;
        int numberOfGuesses = 0;
        while (true) {
            System.out.println("Guess a number Between 1 and 1000");
            System.out.print("-> ");
            tryToGuess = input.nextInt();
            numberOfGuesses++;
            if (tryToGuess == numberToGuessed) {
                System.out.println("CONGRATULATIONS YOU GOT IT RIGHT THE NUMBER -> " + numberToGuessed);
                System.out.println("Do you want to try again?[YES/NO]");
                System.out.print("-> ");
                char tryAgain = input.next().toUpperCase().charAt(0);
                if (tryAgain == 'Y') {
                    numberOfGuesses = 0;
                    numberToGuessed = 1 + numberGenerator.nextInt(1000);
                    continue;
                }
                System.out.println("Finally End");
                if (numberOfGuesses < 10) {
                    System.out.println("Either you Know the secret or you got lucky!");
                }
                else if (numberOfGuesses == 10) {
                    System.out.println("Aha! You Know the Secret!");
                }
                else {
                    System.out.println("You should be able to do better!");
                }
                break;
            }
            else if (tryToGuess < numberToGuessed) {
                System.out.println("TOO LOW");
            }
            else if (tryToGuess > numberToGuessed) {
                System.out.println("TOO HIGH");
            }


            
        }
    }
}
