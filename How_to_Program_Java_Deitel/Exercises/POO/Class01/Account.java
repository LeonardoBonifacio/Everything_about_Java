package Exercises.POO.Class01;

public class Account {
    private String name;
    private double balance;


    public Account(String name, double balance){// like __init__ of python, constructor of java
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void displayNameAndAccount(Account account, int initialOrFinal){
        if (initialOrFinal == 1) {// display the initial values
            System.out.println("Initial name is " + account.getName());
            System.out.println("Initial balance is " + account.getBalance());
        }
        else if (initialOrFinal == 2) {// display the final values
            System.out.println(account.getName() + " Balance: " + account.getBalance());
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0) {
            this.balance += depositAmount;
        }
    }

    public double getBalance(){
        return this.balance;
    }


    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }
}