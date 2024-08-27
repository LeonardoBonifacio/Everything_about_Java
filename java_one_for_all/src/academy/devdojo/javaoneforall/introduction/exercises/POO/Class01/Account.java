package exercises.POO.Class01;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {// like __init__ of python, constructor of java
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            this.balance += depositAmount;
        }
    }

    public void withdraw(double withdrawMoney) {
        if (withdrawMoney > this.balance) {
            System.out.println("Withdrawal amount exceeded account balance ");
        } else {
            System.out.println("The balance account before the withdraw is: " + this.balance);
            this.balance -= withdrawMoney;
            System.out.println("The new balance account after the withdraw is: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}