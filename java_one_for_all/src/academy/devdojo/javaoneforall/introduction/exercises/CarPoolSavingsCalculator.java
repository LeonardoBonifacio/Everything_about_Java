package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Total miles driven per day: ");
        double totalMilesDrivenPerDay = input.nextDouble();

        System.out.print("Cost per gallon of gasoline: ");
        double costPerGallonOfGasoline = input.nextDouble();

        System.out.print("Average miles per gallon: ");
        double averageMilesPerGallon = input.nextDouble();

        System.out.print("Parking fees per day: ");
        double parkingFeesPerDay = input.nextDouble();

        System.out.println("Tolls per day: ");
        double tollsPerDay = input.nextDouble();
        
        double averageCostOfDrivingToWork = (totalMilesDrivenPerDay / averageMilesPerGallon) * costPerGallonOfGasoline + (tollsPerDay * 7.0D) + parkingFeesPerDay * 20.0D; 
        double averageCostOfCarPooling = 20.0D;

        System.out.println("Using carpool services you would save per day: " + (averageCostOfDrivingToWork - averageCostOfCarPooling));
    }
}
