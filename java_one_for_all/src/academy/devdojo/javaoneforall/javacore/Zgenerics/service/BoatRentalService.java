package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

public class BoatRentalService {
    private List<Boat> boatAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

    public Boat retrieveAvailableBoat(){
        System.out.println("Searching for any boat available");
        Boat boat = boatAvailable.remove(0);
        System.out.println("Renting the boat: " + boat);
        System.out.println("Available Boats to rent: " + boatAvailable);
        return boat;
    }

    public void returnRentBoat(Boat boat){
        System.out.println("Returning boat: " + boat);
        boatAvailable.add(boat);
        System.out.println("Available Boats to rent: " + boatAvailable);
    }
}
