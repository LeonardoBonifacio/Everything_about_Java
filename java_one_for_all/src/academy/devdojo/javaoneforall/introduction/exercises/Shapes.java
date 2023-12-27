package academy.devdojo.javaoneforall.introduction.exercises;

public class Shapes {
    public static void main(String[] args) {
        System.out.println("*********     ***       *        **");
        System.out.println("*       *    *   *     ***      *  *");
        System.out.println("*       *   *     *   *****    *    *");
        System.out.println("*       *   *     *     *     *      *");
        System.out.println("*       *   *     *     *    *        *");
        System.out.println("*       *   *     *     *   *          *");
        System.out.println("*       *   *     *     *    *        *");
        System.out.println("*       *   *     *     *     *      *");
        System.out.println("*       *    *   *      *       *   *");
        System.out.println("*********      *        *         *");

        System.out.println();

        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");
 
        System.out.println();

        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");
        
        System.out.println();
        String pattern = "********";
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + pattern);
                continue;
            }
            System.out.println(pattern);
        }

        System.out.println();


        String[] patters = {"*", "*", "*", "*", "*", "*", "*", "*","*"};

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(patters[j]);
            }
            System.out.println();
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(patters[j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
