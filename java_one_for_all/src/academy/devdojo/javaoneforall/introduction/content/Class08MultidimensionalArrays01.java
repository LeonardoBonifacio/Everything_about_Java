package academy.devdojo.javaoneforall.introduction.content;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        // Syntax of array of arrays
        int[][] days = new int[3][3];// the base array you need to write the size inside the first []
        // this array abover can be draw like this days = [ [ 0, 0, 0 ], [ 0, 0, 0 ], [ 0, 0, 0 ] ]
        // behaves the same way which list of lists in python
        days[0][0] = 31;
        days[0][1] = 29;
        days[0][2] = 30;
        days[1][0] = 31;
        days[1][1] = 30;
        days[1][2] = 30;
        days[2][0] = 31;
        days[2][1] = 31;
        days[2][2] = 31;
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        System.out.println("------------------------------------------------");
        // For each in array of arrays
        // the local variable inside the for must be match with the type than array hold, in this case another array
        for (int[] baseArray : days) {// for each baseArray(first level of the arrays)
            for(int day: baseArray){// for each day in each baseArray(second level of the arrays)
                System.out.println(day);
            }
        }

        /*
        int[][][] arrayOfAges = new int[3][3][3];
        // drawing this  [[[0,0,0], [0,0,0], [0,0,0]]], [[0,0,0], [0,0,0], [0,0,0]], [[[0,0,0],[0,0,0],[0,0,0]]]
        for (int j = 0; j < arrayOfAges.length; j++) {
            for (int j2 = 0; j2 < arrayOfAges[j].length; j2++) {
                for (int k = 0; k < arrayOfAges[j][j2].length; k++) {
                    arrayOfAges[j][j2][k] = 20;                     
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arrayOfAges.length; i++) {
            for (int j = 0; j < arrayOfAges.length; j++) {
                for (int j2 = 0; j2 < arrayOfAges.length; j2++) {
                    System.out.println(arrayOfAges[i][j][j2]);
                    count++;
                }
            }
        }
        System.out.println(count);
        */
    }
}
