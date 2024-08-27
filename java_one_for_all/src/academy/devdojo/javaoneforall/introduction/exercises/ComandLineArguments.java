package exercises;

import java.security.SecureRandom;

public class ComandLineArguments {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("The sum of the numbers pass are: " + sum);

        // int sizeOfArray = Integer.parseInt(args[0]);
        // Integer[] arrayInteger = new Integer[sizeOfArray];

        // for (int i = 0; i < arrayInteger.length; i++) {
        // SecureRandom randomNumber = new SecureRandom();
        // arrayInteger[i] = (1 * sizeOfArray) + 12 * randomNumber.nextInt(0, 900);
        // System.out.println("Array integer in position -> [" + i + "] -> kept the
        // number -> " + arrayInteger[i]);
        // }

        // Run by cmd and pass 30 as argument
        // Array integer in position -> [0] -> kept the number -> 6750
        // Array integer in position -> [1] -> kept the number -> 3522
        // Array integer in position -> [2] -> kept the number -> 9402
        // Array integer in position -> [3] -> kept the number -> 7026
        // Array integer in position -> [4] -> kept the number -> 3714
        // Array integer in position -> [5] -> kept the number -> 3246
        // Array integer in position -> [6] -> kept the number -> 870
        // Array integer in position -> [7] -> kept the number -> 4746
        // Array integer in position -> [8] -> kept the number -> 546
        // Array integer in position -> [9] -> kept the number -> 5310
        // Array integer in position -> [10] -> kept the number -> 8418
        // Array integer in position -> [11] -> kept the number -> 4134
        // Array integer in position -> [12] -> kept the number -> 10770
        // Array integer in position -> [13] -> kept the number -> 7218
        // Array integer in position -> [14] -> kept the number -> 1146
        // Array integer in position -> [15] -> kept the number -> 8550
        // Array integer in position -> [16] -> kept the number -> 6822
        // Array integer in position -> [17] -> kept the number -> 3810
        // Array integer in position -> [18] -> kept the number -> 4002
        // Array integer in position -> [19] -> kept the number -> 10506
        // Array integer in position -> [20] -> kept the number -> 8766
        // Array integer in position -> [21] -> kept the number -> 1014
        // Array integer in position -> [22] -> kept the number -> 8862
        // Array integer in position -> [23] -> kept the number -> 4758
        // Array integer in position -> [24] -> kept the number -> 10446
        // Array integer in position -> [25] -> kept the number -> 2442
        // Array integer in position -> [26] -> kept the number -> 426
        // Array integer in position -> [27] -> kept the number -> 6966
        // Array integer in position -> [28] -> kept the number -> 10098
        // Array integer in position -> [29] -> kept the number -> 7146

    }
}
