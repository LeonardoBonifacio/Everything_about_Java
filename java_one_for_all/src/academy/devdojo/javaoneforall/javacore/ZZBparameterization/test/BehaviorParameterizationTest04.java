package academy.devdojo.javaoneforall.javacore.ZZBparameterization.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;
import academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces.CarPredicate;

public class BehaviorParameterizationTest04 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        // When you are working with BahaviorParametariozation always read the
        // functional interface -> Predicate
        List<Car> green = filter(cars, car -> car.getColor().equals("green"));
        List<Car> red = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2020);
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(red);
        System.out.println(green);
        System.out.println(yearBefore);
        System.out.println(filter(numbers, number -> number % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();

        for (T element : list) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }

        return filtered;
    }
}
