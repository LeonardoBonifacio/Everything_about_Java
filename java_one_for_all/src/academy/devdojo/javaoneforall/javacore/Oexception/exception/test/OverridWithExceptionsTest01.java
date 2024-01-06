package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.io.FileNotFoundException;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Person;

public class OverridWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.save();
        } catch (FileNotFoundException | LoginInvalidException e) {
            e.printStackTrace();
        }

        try {
            employee.save();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
