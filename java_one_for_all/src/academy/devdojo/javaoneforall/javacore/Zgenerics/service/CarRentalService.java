package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

public class CarRentalService {
    private List<Car> carAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));

    public Car retrieveAvailableCar(){
        System.out.println("Searching for any car available");
        Car car = carAvailable.remove(0);
        System.out.println("Renting the car: " + car);
        System.out.println("Available Cars to rent: " + carAvailable);
        return car;
    }

    public void returnRentCar(Car car){
        System.out.println("Returning car: " + car);
        carAvailable.add(car);
        System.out.println("Available Cars to rent: " + carAvailable);
    }
}
