package exercises;

import java.util.Scanner;


public class WorldPopulationGrwth {
    public static void main(String[] args) {
        long populationWorld = 100000;
        long newPopulationWorld = populationWorld;
        long oldPopulationWorld = populationWorld; 
        double increasePopulation = 0;
        double rateGrowthpopulationWorld = 1.10;
        int yearThatDouble = 0;
        System.out.println("YEAR-----POPULATION-----INCREASE_IN_WORLD_POPULATION");
        for (int i = 1; i <= 75 ; i++) {
            newPopulationWorld *= rateGrowthpopulationWorld;
            increasePopulation = newPopulationWorld - oldPopulationWorld;
            oldPopulationWorld = newPopulationWorld;
            System.out.println(i + "  -----   " + newPopulationWorld + "  -----             " + increasePopulation);
            if (newPopulationWorld == populationWorld * 2) {
                yearThatDouble = i;
            }
        }
        if (yearThatDouble != 0) {
            System.out.println("Year that double the population is: " + yearThatDouble);
        }

    }
}
