package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 11, 5, 10, 7, 8, 12, 14, 18};
        printArray(numbers);
        printArray(reverseArray(numbers, 0, numbers.length - 1));
    }

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}
