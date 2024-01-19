package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        Scanner input = new Scanner(System.in);
        boolean isPenUp;
        boolean isPenDown;
        int resp = 0;
        while (resp != 9) {
            System.out.println("----- MENU OF TURTLE DRAW -----");
            System.out.println("[1] - Pen up");
            System.out.println("[2] - Pen Down");
            System.out.println("[3] - Turn Right");
            System.out.println("[4] - Turn Left");
            System.out.println("[5] Move some spaces");
            System.out.println("[6] - Display the Draw");
            System.out.println("[9] - End");
            System.out.print("-> ");
            resp = input.nextInt();
            switch (resp) {
                case 1:
                isPenUp = true;
                isPenDown = false;
                    break;
                case 2:
                isPenDown = true;
                isPenUp = false;
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    int spacesToMove = 0;
                    System.out.print("Please put how much spaces do you want move the turtle: ");
                    spacesToMove = input.nextInt();
                case 6:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Option invalid, plese read the Menu carefully");
                    break;
            }
        }
    }
}
