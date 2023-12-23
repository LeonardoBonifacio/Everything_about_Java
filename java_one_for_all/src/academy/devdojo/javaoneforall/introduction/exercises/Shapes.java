package Exercises.Strings;

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

        System.out.printf("*%n**%n***%n****%n*****%n");

        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");
 
        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.println("**");
        
        String pattern = "********";
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + pattern);
            }
            else{
                System.out.println(pattern);
            }
        }
    }
}
