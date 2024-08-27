package exercises.POO.Class01;

public class AccountTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        Account account1 = new Account("Jane green", 70.00);
        Account account2 = new Account("John Blue", -7.49);
        double depositAmount = 0.0;
        double withdrawAmmount = 0.0;
        
        displayNameAndAccount(account1, 1);
        displayNameAndAccount(account2, 1);
        

        System.out.println("Enter the deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to account1");
        account1.deposit(depositAmount);

        
        System.out.println("Enter the deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to account2");
        account2.deposit(depositAmount);

        System.out.println("Enter the withdraw ammount for account1: ");
        withdrawAmmount = input.nextDouble();
        account1.withdraw(withdrawAmmount);

        
        System.out.println("Enter the withdraw ammount for account2: ");
        withdrawAmmount = input.nextDouble();
        account2.withdraw(withdrawAmmount);

        displayNameAndAccount(account1, 2);
        displayNameAndAccount(account2, 2);
        

    }
    public  static void displayNameAndAccount(Account account, int initialOrFinal){
        if (initialOrFinal == 1) {// display the initial values
            System.out.println("Initial name is " + account.getName());
            System.out.println("Initial balance is " + account.getBalance());
        }
        else if (initialOrFinal == 2) {// display the final values
            System.out.println(account.getName() + " Balance: " + account.getBalance());
        }
    }
}
