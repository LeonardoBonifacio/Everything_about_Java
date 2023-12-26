package academy.devdojo.javaoneforall.introduction.exercises;

public class CalculatingTheProdutctOfOddInteger {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 15; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of odd numbers between 1 and 15 is: " + sum);
    }
}
