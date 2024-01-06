package academy.devdojo.javaoneforall.introduction.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generatorNumber = new SecureRandom();
        int number1;
        int number2;
        int guessUser;
        String[] respsNices = { "Very good!", "Excellent!", "Nice Work!", "Keep up the good Work!" };
        String[] respsBads = { "No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep Trying" };
        int respsRandom = generatorNumber.nextInt(4);
        while (true) {
            System.out.println("Lets play with multiplication");
            number1 = 1 + generatorNumber.nextInt(11);
            number2 = 1 + generatorNumber.nextInt(11);
            System.out.print("How much is " + number1 + " x " + number2 + " ? ");
            guessUser = input.nextInt();
            if (guessUser != (number1 * number2)) {
                while (guessUser != (number1 * number2)) {
                    System.out.println(respsBads[respsRandom]);
                    System.out.print("How much is " + number1 + " x " + number2 + " ? ");
                    guessUser = input.nextInt();
                    respsRandom = generatorNumber.nextInt(4);
                }
                System.out.println(respsNices[respsRandom]);
                System.out.print("Do you wanna to play again? [YES/NO]");
                char resp = input.next().toUpperCase().charAt(0);
                if (resp == 'Y') {
                    respsRandom = generatorNumber.nextInt(4);
                    continue;
                }
                break;

            } else {
                System.out.println("Congratulations you do it right");
                System.out.print("Do you wanna to play again? [YES/NO]");
                char resp = input.next().toUpperCase().charAt(0);
                if (resp == 'Y') {
                    continue;
                }
                break;
            }

        }
        input.close();
        ;
    }
}
