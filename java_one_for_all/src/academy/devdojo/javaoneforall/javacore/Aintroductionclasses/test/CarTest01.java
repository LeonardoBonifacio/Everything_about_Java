package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Uno";
        car01.model = "Fiat";
        car01.year = 2010;

        car02.name = "Touro";
        car02.model = "Fiat";
        car02.year = 2018;

        car01 = car02;// this line means my reference variable car01 is going to have the same
                      // reference(the same values storaged) which car02 is having
                      // and the object car01 is lost in memory, there's no way to get back at this
                      // object
                      // this can only be done in objects created by the same class or objects which
                      // are the same thing
                      // thus this line will raise an compilation error car02 = professor;

        System.out.println("\nCar 1: " + car01.name + " Model: " + car01.model + " Year: " + car01.year + "\n");
        System.out.println("Car 2: " + car02.name + " Model: " + car02.model + " Year: " + car02.year + "\n");

    }
}
