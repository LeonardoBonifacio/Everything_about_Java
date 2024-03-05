package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }

    public void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5]; // Default values // index 0 1 2 3 4 
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = {5, 1, 8, 10};
        printArray(arr);
    }

}
