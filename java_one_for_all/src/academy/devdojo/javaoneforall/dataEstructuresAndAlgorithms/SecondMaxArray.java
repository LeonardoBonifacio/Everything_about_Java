package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class SecondMaxArray {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 29, 33, 90, 90, 200};
        System.out.println(findSecondMaxInArray(numbers));
    }

    public static int findSecondMaxInArray(int [] array){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
            else if (array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}
