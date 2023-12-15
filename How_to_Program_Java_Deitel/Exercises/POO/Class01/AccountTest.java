package Exercises.POO.Class01;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.println("Initial name is " + myAccount.getName());

        System.out.print("Please enter the name: ");
        String theName = input.nextLine();

        myAccount.setName(theName);
        System.out.println();

        System.out.println("Name in object myAccount is:" + myAccount.getName());

    }
}
