package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put your height: ");
        double height = input.nextDouble();

        System.out.print("Put your weight: ");
        double weight = input.nextDouble();

        double imc = weight / (height * height);

        if (imc >= 0 && imc < 18.5) {
            System.out.println("You are less weight");
            System.out.println("Imc: " + imc);
        }
        else if (imc < 24.9){
            System.out.println("You are normal weight");
            System.out.println("Imc: " + imc);
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("You are above weight");
            System.out.println("Imc: " + imc);
        }
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("You are obesity 1");
            System.out.println("Imc: " + imc);
        }
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("You are obesity 2");
            System.out.println("Imc: " + imc); 
        }
        else if (imc >= 40) {
            System.out.println("Be careful with your life");
            System.out.println("Imc: " + imc);        
        }
        else{
            System.out.println("Value invalid of weight or height");
        }
    }
}
