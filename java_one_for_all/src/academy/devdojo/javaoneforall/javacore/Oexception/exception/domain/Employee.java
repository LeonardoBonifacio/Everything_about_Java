package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Employee  extends Person{
    public void save() throws FileNotFoundException{
        // i cannot throw checked exceptions that are not in the same method of the superClass
        // i can just let the throws declaration blank, if i want
        // because isn't mandaroty to throw the same exceptions that are in the method that i am overriding

    }
}
