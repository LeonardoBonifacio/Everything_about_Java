package exercises;

public class MultiplesOf2WithInfiniteLoop {
    public static void main(String[] args) {
        long multiplesTwo = 2;
        while (true) {
            System.out.print(" " + multiplesTwo);
            multiplesTwo *= 2;
        }
    }
}
