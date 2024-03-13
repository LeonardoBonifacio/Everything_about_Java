package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

// This class is only use one time in the program and can be created as one anonymous class 
class CarTitleComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getName().compareTo(car2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("Audi")));
        cars.sort(new Comparator<Car>() {// this is the one way that you can use the keyword new with interfaces, only
                                         // for creating anonymous classes
            // here one usefull way to use anonymous class
            // in this case she is only create for us provide one Comparator for this sort
            // but i'll never be able to use this comparator in somewhere else, its only for
            // this sort
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.err.println(cars);
    }
}
