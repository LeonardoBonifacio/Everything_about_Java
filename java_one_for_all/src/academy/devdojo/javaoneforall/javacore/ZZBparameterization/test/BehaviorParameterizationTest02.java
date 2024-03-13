package academy.devdojo.javaoneforall.javacore.ZZBparameterization.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;
import academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces.CarPredicate;

public class BehaviorParameterizationTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        // Behavior parameterization is basically pass the behavior of one method test though the parameter of the methods
        // Basically what the interface Predicate do with your one method abstract test()
        // When you are working with BahaviorParametariozation always read the functional interface -> Predicate
        // you can do this way, without lambda expressions, for better visualization
        List<Car> green = filter(cars, new CarPredicate() {

            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }

        });

        // or you can do this way, for fewer space used
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2020);
        System.out.println(red);
        System.out.println(green);
        System.out.println(yearBefore);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }
}
