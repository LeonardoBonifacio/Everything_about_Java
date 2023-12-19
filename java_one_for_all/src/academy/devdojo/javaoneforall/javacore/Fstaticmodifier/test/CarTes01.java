package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.test;

import academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain.Car;

public class CarTes01 {
    public static void main(String[] args) {
        // after 62 videos i finally understand what means psvm(public static void main)
        // public is an access modifier
        // static is going to tell the this main method belongs to CarTest01
        // void is the return it means that there are no returns
        // main is the name of the method
        // and in parenthesis we are asking for one parameter that is an array of String or we can also ask varargs(...) of Strings
        //System.out.println(Car.speedLimit);
        // when you have something that  it's static you do not need to have  and object you don't need anything initialized at all
        // and everything you do is going to affect all objects created from that class

        System.out.println(Car.getSpeedLimit());
        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 285);
        Car car3 = new Car("BMW", 290);

        //car1.setSpeedLimit(180);// this will set the new speedLimit in the entire class and not only in this object
                                          // because this atribute is static
        car1.print();
        //Car.speedLimit = 123;// here i'm changing something that is static and all the objects will automatically get this new value
        Car.setSpeedLimit(200);
        car1.print();
        car2.print();
        car3.print();
    }
}
