package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 250;
    // static is a keyword in java that you can add after the acces modifier or
    // before, you cannot add after the type
    // this keyword set that the atribute, method or whatever you put, now not
    // belongs to the object of the class
    // now this belong to the class itself
    // and doing this speedLimit belongs to the car class not to the object itself
    // and whatever you do and whatever you change it's going to
    // apply to all instaces of this class

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    // you can nerver acces any instance attributes from a static context, for
    // example if i put the keyword 'static' in the method print bellow
    // i would have that change the 'this' keyword before the atributes and put the
    // name Of the Class instead(but the attributes must be static also because you
    // cannot access a method or attribute non-static in a static way)
    public void print() {
        // since this method is not static i know and java know for sure that at the
        // time you have this print being executed you'll have an object
        System.out.println("---------------------------------------------");
        System.out.println("The name of Car is: " + this.name);
        System.out.println("The max Speed of Car is: " + this.maxSpeed);
        System.out.println("The limit Speed of Car is: " + Car.speedLimit);// atributte beind called by the Class and
                                                                           // not the object
                                                                           // because the keyword static

    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getName() {
        return this.name;
    }

    public static double getSpeedLimit() {
        // when we call static methods there is a change that there will be no objects at all
        // then we must call this atribute by the class level with the your name and not
        // with the keyword 'this'
        return Car.speedLimit;// this is call by the Classe because the keyword static that set which this
                              // atribute belongs at a class itself
        // the keyword this is connected with instances of the class and not the class
        // itself
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
        // static keyword was used in this atribute
    }
}
