package Exercises.Math;

import java.util.Scanner;

public class WorldPopulationGrwthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put the number of world Population: ");
        long worldPopulation = input.nextLong();
        double annualWorldPopulationGrowthRate = 0.10;
        

        System.out.println("In one year the world population will be: " + (worldPopulation + (worldPopulation * annualWorldPopulationGrowthRate)));
        System.out.println("In two year the world population will be: " + (worldPopulation + (worldPopulation * annualWorldPopulationGrowthRate * 2)));
        System.out.println("In three year the world population will be: " + (worldPopulation + (worldPopulation * annualWorldPopulationGrowthRate * 3)));
        System.out.println("In four year the world population will be: " + (worldPopulation + (worldPopulation * annualWorldPopulationGrowthRate * 4)));
        System.out.println("In five year the world population will be: " + (worldPopulation + (worldPopulation * (annualWorldPopulationGrowthRate * 5))));
    }
}
