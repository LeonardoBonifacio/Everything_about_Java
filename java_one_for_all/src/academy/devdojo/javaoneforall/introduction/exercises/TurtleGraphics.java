package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        Scanner input = new Scanner(System.in);
        boolean isPenUp = true;
        boolean isPenDown = false;
        boolean turnRight = false;
        boolean turnLeft = false;
        boolean moveUp = false;
        boolean moveDown = false;
        int turtleRow = 0;
        int turtleColumn = 0;
        int resp = -1;
        while (resp != 0) {
            System.out.println();
            System.out.println("----- MENU OF TURTLE DRAW -----");
            System.out.println("[1] - Pen up");
            System.out.println("[2] - Pen Down");
            System.out.println("[3] - Turn Right");
            System.out.println("[4] - Turn Left");
            System.out.println("[5] - Move Up");
            System.out.println("[6] - Move Down");
            System.out.println("[7] - Move some spaces");
            System.out.println("[8] - Display the Floor");
            System.out.println("[0] - End");
            System.out.print("-> ");
            resp = input.nextInt();
            System.out.println();
            switch (resp) {
                case 1:
                    isPenUp = true;
                    isPenDown = false;
                    System.out.println("The turtle ins't writing in the floor");
                    break;
                case 2:
                    isPenDown = true;
                    isPenUp = false;
                    System.out.println("The turtle is writing int the floor");
                    break;
                case 3:
                    turnRight = true;
                    turnLeft = false;
                    moveUp = false;
                    moveDown = false;
                    System.out.println("The turtle turned side to side Right");
                    break;
                case 4:
                    turnLeft = true;
                    turnRight = false;
                    moveUp = false;
                    moveDown = false;
                    System.out.println("The turtle turned side to side Left");
                    break;
                case 5:
                    moveUp = true;
                    moveDown = false;
                    turnLeft = false;
                    turnRight = false;
                    System.out.println("The turtle turned side to Up");
                    break;
                case 6:
                    moveDown = true;
                    moveUp = false;
                    turnLeft = false;
                    turnRight = false;
                    System.out.println("The turtle turned side to down");
                    break;
                case 7:
                    int spacesToMove = 0;
                    System.out.print("Please put how much spaces do you want move the turtle: ");
                    spacesToMove = input.nextInt();
                    if (isPenDown) {
                        if (turnRight) {
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleColumn++;
                                if (turtleColumn < 20) {
                                    floor[turtleRow][turtleColumn] = 1;
                                }
                                }
                            }
                        
                        else if (turnLeft){
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleColumn--;
                                if(turtleColumn >= 0){
                                    floor[turtleRow][turtleColumn] = 1;
                                }
                            }
                        }
                        else if (moveUp){
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleRow--;
                                if (turtleRow >= 0) {
                                    floor[turtleRow][turtleColumn] = 1;
                                }
                            }
                        }
                        else if (moveDown){
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleRow++;
                                if (turtleRow < 20) {
                                    floor[turtleRow][turtleColumn] = 1;
                                }
                            }
                        }
                        else{
                            System.out.println("Please choose between move up or down and right or left.");
                        }
                    }
                    else if (isPenUp) {
                        if (turnRight) {
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleColumn++;
                                if (turtleColumn >= 20) {
                                    turtleColumn--;
                                    break;
                                }
                                }
                            }
                        
                        else if (turnLeft){
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleColumn--;
                                if(turtleColumn < 0){
                                    turtleColumn++;
                                    break;
                                }
                            }
                        }
                        else if (moveDown){
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleRow++;
                                if (turtleRow > 19) {
                                    turtleRow--;
                                    break;
                                }
                            }
                        }
                        else if (moveUp) {
                            for (int i = 0; i < spacesToMove; i++) {
                                turtleRow--;
                                if (turtleRow < 0) {
                                    turtleRow++;
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Please choose between moveup or down and right or left.");
                        }
                    }
                    break;
                case 8:
                    displayFloor(floor);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Option invalid, please read the Menu carefully");
                    break;
            }
        }

    }

    private static void displayFloor(int[][] floor) {
        for (int row = 0; row < floor.length; row++) {
            for (int column = 0; column < floor.length; column++) {
                if (floor[row][column] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
