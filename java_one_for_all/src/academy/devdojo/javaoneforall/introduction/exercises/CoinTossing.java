package exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    
    public enum Coin {
        HEADS(1),
        TAILS(2);

        private int side;

        Coin(int side) {
            this.side = side;
            this.side = side;
        }
    }

    private static int numberBetween1And2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom numberGenerator = new SecureRandom();

        while (true) {
            System.out.println("----------------MENU--------------------");
            System.out.println("[1] --- TOSS A COIN");
            System.out.println("[2] --- QUIT");
            System.out.print("OPTION -> ");
            int option = input.nextInt();
            if (option == 1) {
                numberBetween1And2 = 1 + numberGenerator.nextInt(2);
                System.out.println("Your coin tossing is " + tossCoin());
            } else {
                System.out.println("QUITING FROM THE GAME");
                break;
            }
        }
    }

    public static Coin tossCoin() {
        if (CoinTossing.numberBetween1And2 == 1) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}
