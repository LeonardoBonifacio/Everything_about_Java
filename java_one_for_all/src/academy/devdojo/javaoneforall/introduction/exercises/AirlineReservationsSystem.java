package academy.devdojo.javaoneforall.introduction.exercises;

import java.util.Scanner;

public class AirlineReservationsSystem {
    public static void main(String[] args) {
        boolean[] seatsOccupied = new boolean[10];
        Scanner input = new Scanner(System.in);

        while (countOccupiedSeats(seatsOccupied) < 10) {
            displayOptions();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    int seatNumber = assignSeat(seatsOccupied, choice);
                    displayBoardingPass(seatNumber);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 or 2.");
                    break;
            }
        }

        System.out.println("All seats are occupied. The next flight leaves in 3 hours.");
    }



    private static void displayOptions() {
        System.out.println("Please type 1 for First Class or 2 for Economy.");
    }



    private static int assignSeat(boolean[] seatsOccupied, int choice) {
        int startSeat = (choice == 1) ? 0 : 5;
        int endSeat = (choice == 1) ? 5 : 10;

        for (int i = startSeat; i < endSeat; i++) {
            if (!seatsOccupied[i]) {
                seatsOccupied[i] = true;
                return i + 1; // Seat numbers start from 1, not 0
            }
        }

        // If all seats in the chosen section are occupied
        System.out.println("The chosen section is full. Would you like a seat in the other section? (Y/N)");
        Scanner input = new Scanner(System.in);
        char response = input.next().toUpperCase().charAt(0);

        if (response == 'Y') {
            return assignSeat(seatsOccupied, (choice == 1) ? 2 : 1);
        } else {
            System.out.println("Next flight leaves in 3 hours.");
            System.exit(0);
            return -1; // This line will never be reached, but needed for compilation
        }
    }




    private static void displayBoardingPass(int seatNumber) {
        System.out.println("Boarding pass for seat number " + seatNumber + ".");
    }




    private static int countOccupiedSeats(boolean[] seatsOccupied) {
        int count = 0;
        for (boolean seat : seatsOccupied) {
            if (seat) {
                count++;
            }
        }
        return count;
    }
}
