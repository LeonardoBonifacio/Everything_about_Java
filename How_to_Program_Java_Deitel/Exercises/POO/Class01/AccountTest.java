package Exercises.POO.Class01;


public class AccountTest {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        Account account1 = new Account("Jane green", 70.00);
        Account account2 = new Account("John Blue", -7.49);
        double depositAmount = 0.0;
        
        account1.displayNameAndAccount(account1, 1);
        account2.displayNameAndAccount(account2, 1);
        

        System.out.println("Enter the deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to account1");
        account1.deposit(depositAmount);

        
        System.out.println("Enter the deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to account2");
        account2.deposit(depositAmount);

        account1.displayNameAndAccount(account1, 2);
        account2.displayNameAndAccount(account2, 2);
        

    }
}
