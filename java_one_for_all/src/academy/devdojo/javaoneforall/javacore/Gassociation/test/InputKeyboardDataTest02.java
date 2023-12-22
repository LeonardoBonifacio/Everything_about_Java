package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the most advanced AI system MIA");
        while (true) {
            System.out.println("Ask any question and i shall reply yes or no");
            String question = input.nextLine();
            if (question.charAt(0) == ' ') {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            System.out.println("Do you want asking to me more questions? ");
            char skipOrNo = input.next().toUpperCase().charAt(0);
            if (skipOrNo == 'N') {
                break;
            }
            
        }
    }
}
