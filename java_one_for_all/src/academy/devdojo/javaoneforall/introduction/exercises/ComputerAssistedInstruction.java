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
        int qtdAnswerIncorrect = 0;
        int qtdAnswercorrect = 0;
        boolean isTenResps;
        int result = 0;
        String sinal = " ";
        String[] respsNices = { "Very good!", "Excellent!", "Nice Work!", "Keep up the good Work!" };
        String[] respsBads = { "No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep Trying" };
        int respsRandom = generatorNumber.nextInt(4);
        while (true) {
            System.out.println("Lets play");
            System.out.print("Which dificult? [1] - For Easy [2] - For Hard -> ");
            int dificult = input.nextInt();
            if (dificult == 1) {
                number1 = 1 + generatorNumber.nextInt(11);
                number2 = 1 + generatorNumber.nextInt(11);
            } else {
                number1 = 1 + generatorNumber.nextInt(99);
                number2 = 1 + generatorNumber.nextInt(99);
            }
            System.out.print(
                    "Do you wanna play with: [1] - Addiction [2] - Subtraction [3] - Division [4] - Multiplication -> ");
            int choseArithmeticProblem = input.nextInt();
            if (choseArithmeticProblem == 1) {
                result = number1 + number2;
                sinal = " + ";
            } else if (choseArithmeticProblem == 2) {
                result = number1 - number2;
                sinal = " - ";
            } else if (choseArithmeticProblem == 3) {
                result = number1 / number2;
                sinal = " / ";
            } else if (choseArithmeticProblem == 4) {
                result = number1 * number2;
                sinal = " * ";
            }
            System.out.print("How much is " + number1 + sinal + number2 + " ? ");
            guessUser = input.nextInt();
            if (guessUser != result) {
                qtdAnswerIncorrect++;
                isTenResps = printMessageAfterTenResp(qtdAnswerIncorrect, qtdAnswercorrect);
                if (isTenResps) {
                    qtdAnswerIncorrect = 0;
                    qtdAnswercorrect = 0;
                    continue;
                }

                while (guessUser != result) {
                    System.out.println(respsBads[respsRandom]);
                    System.out.print("How much is " + number1 + sinal + number2 + " ? ");
                    guessUser = input.nextInt();
                    respsRandom = generatorNumber.nextInt(4);
                    qtdAnswerIncorrect++;
                    isTenResps = printMessageAfterTenResp(qtdAnswerIncorrect, qtdAnswercorrect);
                    if (isTenResps) {
                        qtdAnswerIncorrect = 0;
                        qtdAnswercorrect = 0;
                        continue;
                    }
                }
                respsRandom = generatorNumber.nextInt(4);
                System.out.println(respsNices[respsRandom]);
                qtdAnswercorrect++;
                isTenResps = printMessageAfterTenResp(qtdAnswerIncorrect, qtdAnswercorrect);
                if (isTenResps) {
                    qtdAnswerIncorrect = 0;
                    qtdAnswercorrect = 0;
                    continue;
                }

                System.out.print("Do you wanna to play again? [YES/NO]");
                char resp = input.next().toUpperCase().charAt(0);
                if (resp == 'Y') {
                    respsRandom = generatorNumber.nextInt(4);
                    continue;
                }
                break;
            } else {
                respsRandom = generatorNumber.nextInt(4);
                System.out.println(respsNices[respsRandom]);
                qtdAnswercorrect++;
                isTenResps = printMessageAfterTenResp(qtdAnswerIncorrect, qtdAnswercorrect);
                if (isTenResps) {
                    qtdAnswerIncorrect = 0;
                    qtdAnswercorrect = 0;
                    continue;
                }
            }

        }
    }

    public static boolean printMessageAfterTenResp(int qtdAnswerIncorrect, int qtdAnswercorrect) {
        if (qtdAnswerIncorrect + qtdAnswercorrect == 10) {
            if (qtdAnswercorrect >= 7) {
                System.out.println("Congratulations, you are ready to go the next level!");
            }
            if (qtdAnswerIncorrect >= 7) {
                System.out.println("PLease ask your teacher for extra help!");
            }
            return true;
        }
        return false;
    }

}
