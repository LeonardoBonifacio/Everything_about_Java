package academy.devdojo.javaoneforall.introduction.exercises.KnightsProblem;

import java.util.ArrayList;
import java.util.List;

public class KnightsProblem {
    public static int numberOfMoves = 1;
    public static int[][] boardChess = new int[8][8];
    public static int[] rowMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
    public static int[] colMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static void main(String[] args) {
        displayBoard(boardChess);
        solveKnightsTour(0,0);
        displayBoard(boardChess);
    }

    private static void solveKnightsTour(int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8 || boardChess[row][col] != 0) {
            return;
        }

        boardChess[row][col] = numberOfMoves;
        numberOfMoves += 1;

        for (int moves = 0; moves < 8; moves++) {
            int newRow = row + rowMoves[moves];
            int newCol = col + colMoves[moves];
            solveKnightsTour(newRow, newCol);
        }

    }

    private static void displayBoard(int[][] boardChess) {
        System.out.println("________________________________________");
        for (int row = 0; row < boardChess.length; row++) {
            for (int column = 0; column < boardChess[row].length; column++) {
                if (boardChess[row][column] > 9) {
                    System.out.print("[" + boardChess[row][column] + "] ");    
                }
                else{
                    System.out.print("[" + boardChess[row][column] + " ] ");
                }
            }
            System.out.println();
        }
    }
}
