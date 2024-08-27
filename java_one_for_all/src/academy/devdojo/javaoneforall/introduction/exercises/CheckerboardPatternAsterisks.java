package exercises;

public class CheckerboardPatternAsterisks {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            System.out.println("* * * * * * * *");
        }
    }
}
