package exercises;

public class TableOfSquaresAnCubes {
    public static void main(String[] args) {
        System.out.println("Number     Square     Cube");
        for (int i = 0; i <= 10; i++) {
                System.out.println(i+"            " + (i*i) + "         " + (i*i*i));
        }
    }
}
