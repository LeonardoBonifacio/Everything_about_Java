package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class ResizeArray {
    public static void main(String[] args) {
        ResizeArray arrUtil = new ResizeArray();
        int[] original = new int[] { 5, 1, 9, 10 };
        System.out.println("The size of the original array is - " + original.length);
        arrUtil.printArray(original);
        original = arrUtil.resizeArray(original, 10);
        System.out.println("The size of the new original array after resizing it is  - " + original.length);
        arrUtil.printArray(original);
    }

    public void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int[] resizeArray(int[] array, int newCapacity) {
        int[] temp = new int[newCapacity];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
}
