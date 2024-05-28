package academy.devdojo.javaoneforall.introduction.exercises;

import java.security.SecureRandom;

public class Craps {
    private static SecureRandom randomNumbers = new SecureRandom();

    private enum Status {
        CONTINUE,
        WON,
        LOST
    };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        int gamesWon = 0;
        int gamesWonOnTheFirstRoll = 0;
        int gamesWonOnTheSecondRollAndAfter = 0;
        int gamesLost = 0;
        int gamesLostOntheFirstRoll = 0;
        int gamesLostOnTheSecondRollAndAfter = 0;
        Status gameStatus;

        for (int i = 1; i <= 100; i++) {
            
            int sumOfDice = rollDice();
    
            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gamesWonOnTheFirstRoll++;
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gamesLostOntheFirstRoll++;
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.println("Your Point is: " + myPoint);
                    break;
            }
    
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
    
                if (sumOfDice == myPoint) {
                    gamesWonOnTheSecondRollAndAfter++;
                    gameStatus = Status.WON;
                } else if (sumOfDice == SEVEN) {
                    gamesLostOnTheSecondRollAndAfter++;
                    gameStatus = Status.LOST;
                }
            }
    
            if (gameStatus == Status.WON) {
                gamesWon++;
                System.out.println("Player Wins");
                System.out.println();
            } else {
                gamesLost++;
                System.out.println("Player loses");
                System.out.println();
            }
        }
        System.out.println("Playing this game 100 times the player wins: " + gamesWon);
        System.out.println("Wins in the first Roll: " + gamesWonOnTheFirstRoll);
        System.out.println("Wins in the second Roll and after: " + gamesWonOnTheSecondRollAndAfter);
        System.out.println("Playing this game 100 tims the player lost: " + gamesLost);
        System.out.println("Lost in the first Roll: " + gamesLostOntheFirstRoll);
        System.out.println("Lost in the second Roll and after: " + gamesLostOnTheSecondRollAndAfter);
        System.out.println("The chances of win this game gone: " + (((double) gamesWon/100) * 10) + "%");
        System.out.println("The chances of lost this game gone: " + (((double) gamesLost/100) * 10) + "%");
        
    }

    public static int rollDice() {
        int dice1 = 1 + randomNumbers.nextInt(6);
        int dice2 = 1 + randomNumbers.nextInt(6);

        int sum = dice1 + dice2;

        System.out.println();
        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
        System.out.println();

        return sum;
    }

}