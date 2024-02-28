package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        ArrayList<Integer> fiveNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int numberRead;
        while (fiveNumbers.size() != 5) {
            System.out.print("Please insert five numbers between 10 and 100 and not duplicate -> ");
            numberRead = input.nextInt();
            if (numberRead < 10 || numberRead > 100 || fiveNumbers.contains(numberRead)) {
                System.out.println("Please put one number that follow the rules");
            }
            else{
                fiveNumbers.add(numberRead);
            }
        }
        for (Integer integer : fiveNumbers) {
            System.out.println(integer);
        }
    }
}
