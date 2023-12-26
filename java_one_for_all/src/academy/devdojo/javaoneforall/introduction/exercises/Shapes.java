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

        String patternAsteristhics = "*";
        for (int i = 1; i <= 10; i++) {
            System.out.println(patternAsteristhics);
            patternAsteristhics += "*";
        }

    }
}
