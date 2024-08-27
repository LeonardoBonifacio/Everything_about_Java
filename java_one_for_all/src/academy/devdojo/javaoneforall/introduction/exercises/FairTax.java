package exercises;

import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much per year do you spend with housing? ");
        System.out.print("->  ");
        double housingSpends = input.nextDouble();

        System.out.println("How much per year do you spend with food? ");
        System.out.print("->  ");
        double foodSpends = input.nextDouble();

        System.out.println("How much per year do you spend with clothing? ");
        System.out.print("->  ");
        double clothingSpends = input.nextDouble();

        System.out.println("How much per year do you spend with trasnportation? ");
        System.out.print("->  ");
        double transportationSpends = input.nextDouble();

        System.out.println("How much per year do you spend with education? ");
        System.out.print("->  ");
        double educationSpends = input.nextDouble();

        System.out.println("How much per year do you spend with health care? ");
        System.out.print("->  ");
        double healthCareSpends = input.nextDouble();

        System.out.println("How much per year do you spend with vacations? ");
        System.out.print("->  ");
        double vacationsSpends = input.nextDouble();

        double totalFairTax = thirtyPercent(housingSpends) +
                thirtyPercent(foodSpends) + thirtyPercent(clothingSpends) + 
                thirtyPercent(transportationSpends)
                + thirtyPercent(educationSpends) + thirtyPercent(healthCareSpends) + 
                thirtyPercent(vacationsSpends);

        System.out.println("The total you would spend per year only with fairTax is " + totalFairTax);
    }

    public static double thirtyPercent(double spends) {
        return spends * 0.3;
    }
}
