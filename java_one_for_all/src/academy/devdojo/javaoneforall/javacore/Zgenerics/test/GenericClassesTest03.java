package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.RentalService;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Boat> boatAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));
        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatAvailable);

        List<Car> carAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));
        RentalService<Car> rentalServiceCar = new RentalService<>(carAvailable);

        Car car =  rentalServiceCar.retrieveAvailableObject();
        System.out.println("Using car for a month");
        rentalServiceCar.returnRentObject(car);

        System.out.println("-------------------");
        
        Boat boat = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("Using boat for a month");
        rentalServiceBoat.returnRentObject(boat);
    }
}
