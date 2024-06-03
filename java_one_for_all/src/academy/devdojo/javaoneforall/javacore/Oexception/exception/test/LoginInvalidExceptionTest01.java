package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.util.Scanner;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException{
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.print("Username: ");
        String typedUsername = input.nextLine();
        System.out.print("Password: ");
        String typedPassword = input.nextLine();

        if (!passwordDB.equals(typedPassword) | !usernameDB.equals(typedUsername)) {
            throw new LoginInvalidException("Username or password is incorrect! ");
        }
        System.out.println("Login Completed");
    }
}
