package academy.devdojo.javaoneforall.javacore.ZZBparameterization.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;

public class BehaviorParameterizationTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByYearBefore(cars, 2020));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }
}
