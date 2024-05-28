package academy.devdojo.javaoneforall.introduction.content;

public class Class06LoopStatements05 {
        /*
     * Given a car's total price, for example 20.000, i want to find how much and far how long i'll have to pay monthly.
     * Condition: the monthly payment cannot be lower than 1000
     */
    public static void main(String[] args) {
        int totalCarPrice = 20000;
        for (int mounthCount =  totalCarPrice; mounthCount >= 1; mounthCount--) {
            double monthlyPrice = totalCarPrice / mounthCount;
            if (monthlyPrice < 1000) {
                continue;// can be used the same way that break is used therefore, that 'continue' statement instead of get out
                         // of the for loop, he came back from the init the for loop
                         // in this case this loop will be ignored 19980 times until this code 'print' above be executed
            }
            System.out.println("Months: " + mounthCount + " Price: " + monthlyPrice);
        }
    }
}


