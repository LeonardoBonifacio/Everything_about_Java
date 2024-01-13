package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Arrays;

public class ArraysTest {
    // public static final int ARRAY_SIZE = 3;
    public static void main(String[] args) {
        // int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array.length; j++) {
        //         array[i][j] = i + j;
        //         System.out.println("Indice of array element: [" + i + "]" + "[" + j + "] Element -> " + array[i][j]);
        //     }
        // }

        int[] a = new int[20];
        int[] b = new int[34];
        Arrays.fill(a, 12);
        int[] copyA = Arrays.copyOfRange(a, 0, 12);
        for (int i = 0; i <= 11; i++) {
            b[i] = copyA[i];
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
}
