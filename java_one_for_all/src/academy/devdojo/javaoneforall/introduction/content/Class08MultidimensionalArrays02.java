package academy.devdojo.javaoneforall.introduction.content;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[] numbers = {1, 2, 3};
        
        // diferent ways the initialize an array and set your size
        array[0] = new int[]{-1, 0};
        array[1] = numbers;
        array[2] = new int[]{4, 5, 6, 7, 8, 9};
        
        int[] numbers2 = {12, 13, 14};
        int[][] array2 = {{10, 11}, numbers2, {15, 16, 17, 18, 19}};// this way only writing int[][] i only define that my array will be multidimensional
                                                      // inside the {} i define how much things i will storaged
        for (int[] baseArray : array) {
            for (int num : baseArray) {
                if (num == -1) {
                    System.out.println(num);
                }
                else{
                    System.out.println(" "+num);
                }
            }
            System.out.println("--------------------------");
        }
        
        for (int[] baseArray : array2) {
            for (int num : baseArray) {
                if (num == -1) {
                    System.out.println(num);
                }
                else{
                    System.out.println(" "+num);
                }
            }
            System.out.println("--------------------------");
        }
    }
}
