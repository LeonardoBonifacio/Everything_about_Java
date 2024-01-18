package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        // Tokens and delimiters
        String text = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(text);// delimiter default is a blank Space
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {// while there something in the next value after the delimiter
            // basically here i'm separating this values in each tipe 
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Int " + number);
            }
            else if(scanner.hasNextBoolean()){
                boolean isTrueOrFalse = scanner.nextBoolean();
                System.out.println("Boolean: " + isTrueOrFalse);
            }
            else{
                System.out.println(scanner.next());// print this value

            }
        }
    }
}
