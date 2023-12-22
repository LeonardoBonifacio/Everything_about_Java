package academy.devdojo.javaoneforall.introduction.content;

public class Class06LoopStatements04 {
    /*
     * Given a car's total price, for example 20.000, i want to find how much and far how long i'll have to pay monthly.
     * Condition: the monthly payment cannot be lower than 1000
     */
    public static void main(String[] args) {
        /* 
        double priceCar = 20000;
        double payMonthly = 4000;
        double totalPayment = 0;
        double rest;
        int quantidyMonths = 0;
        while (totalPayment < priceCar) {
            if (payMonthly < 1000) {
                System.out.println("The value of the pay monthly cannot be lower than $1000");
                break;
            }
            totalPayment += payMonthly;
            quantidyMonths++;
        }
        rest = totalPayment - priceCar;
        System.out.println("Your rest is : " + rest);
        System.out.println("Lasted " + quantidyMonths + " Months to you pay your car with $" + payMonthly + " per month");
        */
        double totalCarPrice = 20000;
        for (int mounthCount = 1; mounthCount <= 20000; mounthCount++) {
            double monthlyPrice = totalCarPrice / mounthCount;
            // way more smarter
            /*
             * if(mounthlyPrice < 1000){
             *     break;
             * }
             * System.out.println("Months: " + mounthCount + " Price: " + monthlyPrice);
             */
            if (monthlyPrice >= 1000) {
                System.out.println("Months: " + mounthCount + " Price: " + monthlyPrice);
            }
            else{
                break;//much important so that managed the processing power beein used or not
                      // because implicity this for will execute 20.000 times if we no put the break statement
            }
            System.out.println("Inside for Outside If");
        }
    }
}
