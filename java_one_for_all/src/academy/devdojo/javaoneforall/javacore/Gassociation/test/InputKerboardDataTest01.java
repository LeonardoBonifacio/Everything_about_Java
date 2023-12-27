package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKerboardDataTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type your full name: ");
        String name = input.nextLine();

        System.out.print("Please type your age: ");
        int age = input.nextInt();

        System.out.print("Please type M or F for your gender: ");
        char gender = input.next().charAt(0);

        System.out.println("-----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

    }
}
