package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros arrayUtil = new MoveZeros();
        arrayUtil.arrayDemo();
    }

    public void printArray(int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] array = { 8, 1, 0, 2, 1, 0, 3 };
        printArray(array);
        moveZeros(array, array.length);
        printArray(array);
    }

    public void moveZeros(int[] array, int n) {
        int j = 0; // focus in zero elements
        for (int i = 0; i < n; i++) {// will focus in non zero elements
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            if (array[j] != 0) {
                j++;
            }
        }
    }
}
