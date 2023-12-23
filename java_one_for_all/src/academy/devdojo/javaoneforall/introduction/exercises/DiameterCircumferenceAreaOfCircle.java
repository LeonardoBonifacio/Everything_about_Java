package academy.devdojo.javaoneforall.introduction.exercises;

import java.lang.Math;
import java.util.Scanner;
public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put a number for radius: ");
        int radius = input.nextInt();
        double pi = Math.PI;
        double diameter = 2 * radius;
        double circunference = 2 * pi * radius;
        double area = pi * (radius * radius);
        System.out.println("The area is : " + area);
        System.out.println("The diameter is : " + diameter);
        System.out.println("The circunference is : " + circunference);
        
    }
}
