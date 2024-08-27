package exercises;

import java.util.Scanner;

public class ParkingCharges {
    private static double totalEarned = 0;
    public static void main(String[] args) {
        // $2 fee for to 3 hours
        // $0.49  per hour of each hour that excess 3 hours
        // maximum charge for 24 hours is $10.00
        Scanner input = new Scanner(System.in);
        char yesOrNo;

        while (true) {
            System.out.print("Input the total of hour that this cliente spent in our parking services: ");
            int hoursSpent = input.nextInt();
            if (hoursSpent < 0 || hoursSpent > 24) {
                System.out.println("Numbers of hours invalid, please put one number between 0 and 24");
                System.out.print("-> ");
                hoursSpent = input.nextInt();
            }
            else{
                calculateCharges(hoursSpent);
                while (true) {
                    System.out.print("Please put yes or No, if you want to add more clientes in our earns: ");
                    yesOrNo = input.next().toUpperCase().charAt(0);
                    if (yesOrNo == 'Y' || yesOrNo == 'N') {
                        break;
                    }
                    System.out.println("Please put only Yes or No");                    
                }
                if (yesOrNo == 'N') {
                    break;
                }
            }
        }
        System.out.println("The total earned by the Own of the parking services is $" + totalEarned);
        
    }

    public static void calculateCharges(int hours){
        double totalPaid = 0;
        int hourRoot = hours;
        if (hours >= 3) {
            hours -= 3;
            totalPaid = 2 + (hours * 0.49);
        }else{
            totalPaid = hours * 0.49;
        }
        totalEarned += totalPaid;
        System.out.println("For " + hourRoot + " hour that you use our parking services, you must pay $" + totalPaid);
    }

}
