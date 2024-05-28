package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class SlidesOfTriangule{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int slide1;
        int slide2;
        int slide3;
        int bigSlide;
        System.out.print("Put slide 1: ");
        slide1 = input.nextInt();
        bigSlide = slide1;
        System.out.print("Put slide 2: ");
        slide2 = input.nextInt();
        if (slide2 > bigSlide) {
            bigSlide = slide2;
        }
        System.out.print("Put slide 3: ");
        slide3 = input.nextInt();
        if (slide3 > bigSlide) {
            bigSlide = slide3;
        }
        
        if ((slide1 < slide2 + slide3) && (slide2 < slide1 + slide3) && (slide3 < slide1 + slide2)) {
            System.out.println("This values can represent the slides of a triangule");
        }

        if (bigSlide == slide1) {
            int sum = slide2 + slide3;
            if (sum > bigSlide) {
                if (slide2 + bigSlide == sum && slide3 + bigSlide == sum) {
                    System.out.println("This values can represente the slides of a triangule rectangule");
                }
            }
        }
        else if (bigSlide == slide2) {
            int sum = slide1 + slide3;
            if (sum > bigSlide) {
                if (slide1 + bigSlide == sum && slide3 + bigSlide == sum) {
                    System.out.println("This values can represente the slides of a triangule rectangule");
                }
            }
        }
        else if (bigSlide == slide3) {
            int sum = slide2 + slide1;
            if (sum > bigSlide) {
                if (slide2 + bigSlide == sum && slide1 + bigSlide == sum) {
                    System.out.println("This values can represente the slides of a triangule rectangule");
                }
            }
        }
        else{
            System.out.println("This values can't represent the slides of a triangule rectangule");
        }


    }
}
