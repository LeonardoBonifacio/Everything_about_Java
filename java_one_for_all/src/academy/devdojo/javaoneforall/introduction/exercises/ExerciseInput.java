package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

/**
 * The military needs a system to classify people joining the force
 * We need the system to accept the following data
 * Gender (the system should somehow store M or F only) and age.
 * If the gender is M and age is >= 18, the system should print "Mandatory Service"
 * If the gender is M and the age is < 18, the system should print "Service not allowed for people under 18"
 * If the gender is F and age is >= 18, the system should ask "would you like to enlist?"
 * If the gender is F and age is < 18 the sustem should print  "Service not allowed for people under 18"
 */
public class ExerciseInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put M for Male and F for Female: ");
        char gender = input.next().toUpperCase().charAt(0);
        int age;
        if (gender == 'M' || gender == 'F') {
            System.out.print("Put your age: ");
            age = input.nextInt();
            if (age < 18) {
                System.out.println("Service not allowed for people under 18");
                System.exit(0);
            }
            else if (gender == 'M') {
                System.out.println("Mandatory service");
            }
            else if (gender == 'F') {
                System.out.println("Would you like to enlist?");
            }
        }
        else{
            System.out.println("Put one gender valid");
            System.exit(0);
        }
    }
}
