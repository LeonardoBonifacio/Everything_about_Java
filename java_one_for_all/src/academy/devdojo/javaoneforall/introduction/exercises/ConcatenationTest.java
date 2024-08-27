package exercises;
public class ConcatenationTest{
    public static void main(String[] args) {
    // Only testing concatenations between strings and numbers
        String concatenation = "?";
        System.out.println();
        System.out.println(concatenation);

        concatenation = 1 + 1 + 1 + " 1 ";
        System.out.println(concatenation);

        concatenation = 1 + " 1 " + 1 + 1;
        System.out.println(concatenation);

        concatenation = 1 + " 1 " + 1 + " 1 ";
        System.out.println(concatenation);

        concatenation = " 1 " + 1 + 1 + 1;
        System.out.println(concatenation);

        concatenation = " 1 " + (1 + 1 + 1);
        System.out.println(concatenation);
        
    }
}