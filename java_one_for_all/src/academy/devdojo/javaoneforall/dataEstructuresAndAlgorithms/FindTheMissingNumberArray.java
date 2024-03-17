package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class FindTheMissingNumberArray {
    public static void main(String[] args) {
        FindTheMissingNumberArray fMNA = new FindTheMissingNumberArray();
        fMNA.arrayDemo();
    }

    public void arrayDemo() {
        int[] array = { 1, 3, 6, 8, 2, 4, 7 };
        System.out.println(findMissingNumber(array));
    }

    public static int findMissingNumber(int[] array){
        int n = array.length + 1;
        int sum = (n *(n + 1)) / 2;
        for (int num : array) {
            sum -= num;
        }

        return sum;
    }
}
