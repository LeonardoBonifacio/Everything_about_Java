package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Ferrari ferrari = new Ferrari();

        // since the final SPEED_LIMIT is static we must access this by the class and
        // not by
        // the object, and since it's public we can access this every time and anywhere we want
        System.out.println(Car.SPEED_LIMIT);

        // we cannot do things like this in this final reference variable under because
        // this is final and we only can change the attributes and methods inside
        // car.BUYER = new Buyer();

        car.BUYER.setName("Kuririn");// here we access the reference variable(BUYER) inside the object car, which
        // hold another object with another methods(like toString and getter and
        // setters)
        System.out.println(car.BUYER);
        // when you add final modifier to a reference variable what we cannot change is
        // the reference, only the reference

        ferrari.setName("Enzo");
        ferrari.print();

    }
}
