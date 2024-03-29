package academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain;

public class Car {
    private String name = "Audi";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{Name = " + this.name + ", Color = " + this.color + ", year = " + this.year;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}
