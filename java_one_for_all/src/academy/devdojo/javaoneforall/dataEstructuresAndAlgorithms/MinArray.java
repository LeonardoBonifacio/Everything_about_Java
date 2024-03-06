package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 3, 15, 1, 2 };
        MinArray ma = new MinArray();
        System.out.println(ma.findMinNumINArray(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    public int findMinNumINArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
