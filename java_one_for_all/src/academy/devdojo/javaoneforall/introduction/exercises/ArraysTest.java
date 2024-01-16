package academy.devdojo.javaoneforall.introduction.exercises;

import java.security.SecureRandom;
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

        //SecureRandom random = new SecureRandom();
        // int[] a = new int[20];
        // int[] b = new int[34];
        // Arrays.fill(a, 12);
        // int[] copyA = Arrays.copyOfRange(a, 0, 12);
        // for (int i = 0; i <= 11; i++) {
        //     b[i] = copyA[i];
        // }
        // for (int i : b) {
        //     System.out.println(i);
        // }

        // float[] w =  new float[99];
        // Arrays.fill(w, random.nextFloat(100.90F));
        // float smalest = w[0];
        // float largest = w[0];
        // for (int i = 1; i < w.length; i++) {
        //     if (w[i] > largest) {
        //         largest = w[i];
        //     }
        //     else if (w[i] < smalest){
        //         smalest = w[i];
        //     }
        //     else{
        //         continue;
        //     }
        // }

        // System.out.println("The smallest values is: " + smalest);
        // System.out.println("The largest values is: " + largest);

        // int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // int[] bonus = new int[14];
        // for (int i : bonus) {
        //     i++;
        // }
        int[] bestScores = {1, 2, 3, 4, 7, 8, 9};
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println("Item number -> [" + (i + 1) + "] -> " + bestScores[i]);
        }

    }
}
