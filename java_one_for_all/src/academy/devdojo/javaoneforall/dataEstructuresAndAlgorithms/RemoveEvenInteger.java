package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class RemoveEvenInteger {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 7, 10, 6, 5 }; // 3, 7, 5
        printArray(arr);
        printArray(removeEven(arr));
    }

    public static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int[] removeEven(int[] array){
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 ) countOdd++;
        }

        int[] result = new int[countOdd];
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[idx++] = array[i];
            }
        }
        return result;

    }

}
