package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import java.util.List;

// Class generic are useful when the only thing that we change inside them is the type of the object
public class RentalService<T> {// this T represent the Type of the object that this Class is going to work
    private List<T> objectsAvailable;

    public RentalService(List<T> objectsAvailable){
        this.objectsAvailable = objectsAvailable;
    }


    public T retrieveAvailableObject(){
        System.out.println("Searching for any Object available");
        T t = objectsAvailable.remove(0);
        System.out.println("Renting the object: " + t);
        System.out.println("Available Objects to rent: " + objectsAvailable);
        return t;
    }

    public void returnRentObject(T t){
        System.out.println("Returning object: " + t);
        objectsAvailable.add(t);
        System.out.println("Available objects to rent: " + objectsAvailable);
    }
}
