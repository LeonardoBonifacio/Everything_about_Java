package academy.devdojo.javaoneforall.introduction.exercises;

import java.security.SecureRandom;

public class KnightsProblem {
    public static void main(String[] args) {
        int[][] boardChess = new int[8][8];
        int currentRow = 3;
        int currentColumn = 3;
        int numberOfMoves = 1;
        // movements are {right or left, up or down}
        // expect this two finals which are {up or down, right or left}
        int[][] movements = { { 2, 1 }, { 1, -2 }, { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 }, { 2, 1 }, { 1, 2 } };
        // Right to letf and up or down | Up or down and right to left
        // horizontal 0-7 or -7-0
        // vertical 0-7 -7-0
        while (numberOfMoves < 64) {
            boardChess[currentRow][currentColumn] = numberOfMoves;
            System.out.println();
            displayBoard(boardChess);
            makeAMove(movements, currentColumn, currentRow, boardChess, numberOfMoves);
            numberOfMoves++;
        }
    }

    private static void displayBoard(int[][] boardChess){
        System.out.println("________________________________________");
        for (int row = 0; row < boardChess.length; row++) {
            for (int column = 0; column < boardChess.length; column++) {
                if ((boardChess[row][column] > 9)) {
                    System.out.print(" [" + boardChess[row][column] + "]");
                } else {
                    System.out.print(" [" + boardChess[row][column] + "] ");
                }
            }
            System.out.println();
        }
    }

    private static boolean canMove(int newRow, int newColumn, int[][] boardChess){
        return newRow >= 0 && newRow < 8 && newColumn >= 0 && newColumn < 8 && boardChess[newRow][newColumn] == 0;
    }

    private static void makeAMove(int[][] movements, int currentColumn, int currentRow, int[][] boardChess, int numberOfMoves){
        for (int movement = 0; movement < movements.length; movement++) {
            int newRow = currentRow + movements[movement][0];
            int newColumn = currentColumn + movements[movement][1];

            if (canMove(newRow, newColumn, boardChess)) {
                currentRow = newRow;
                currentColumn = newColumn;
                boardChess[currentRow][currentColumn] = numberOfMoves + 1;
                return;
            }
        }

        // Se nenhum movimento for possível, encerre o programa
        System.out.println("Não há movimentos válidos a partir desta posição!");
        System.exit(0);
    }
}
        // while (true) {
        // boardChess[currentRow][currentColumn] = numberOfMoves;
        // System.out.println();
        // displayBoard(boardChess);
        // System.out.println();
        // displayBoard(boardChess);
        // makeAMove(movements, currentColumn, currentRow, boardChess,numberOfMoves);
        // displayBoard(boardChess);
        // break;
        // }

        // }

        // private static void displayBoard(int[][] boardChess){
        // System.out.println("________________________________________");
        // for (int row = 0; row < boardChess.length; row++) {
        // for (int column = 0; column < boardChess.length; column++) {
        // if ((boardChess[row][column] > 9)) {
        // System.out.print(" [" + boardChess[row][column] + "]");
        // }
        // else{
        // System.out.print(" [" + boardChess[row][column] + "] ");
        // }
        // }
        // System.out.println();
        // }
        // }

        // private static boolean canMove(int currentRow, int currentColumn, int
        // movementH, int movementV, int[][] boardChess){
        // int rowSum = currentRow += movementH;
        // int sumCol = currentColumn += movementV;
        // if (rowSum > 7 || rowSum < 0) {
        // return false;
        // }
        // else if(sumCol > 7 || sumCol < 0){
        // return false;
        // }
        // else if(boardChess[rowSum][sumCol] != 0){
        // return false;
        // }
        // else{
        // return true;
        // }
        // }

        // private static void makeAMove(int[][] movements, int currentColumn, int
        // currentRow, int[][] boardChess, int numberOfMoves){
        // for (int movement = 0; movement < movements.length; movement++) {
        // if (movement < 6) {
        // if(canMove(currentRow, currentColumn, movements[movement][0],
        // movements[movement][1],boardChess)){
        // currentRow += movements[movement][0];
        // currentColumn += movements[movement][1];
        // }
        // else{
        // continue;
        // }
        // }
        // else{
        // if (canMove(currentRow, currentColumn, movements[movement][1],
        // movements[movement][0], boardChess)) {
        // currentRow += movements[movement][1];
        // currentColumn += movements[movement][0];
        // }
        // else{
        // continue;
        // }
        // }
        // numberOfMoves += 1;
        // boardChess[currentRow][currentColumn] = numberOfMoves;
        // }
        // }
