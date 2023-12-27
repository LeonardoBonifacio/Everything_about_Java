package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class Person {
    private String name;
    private int age;
    // keyword private means nobody besides this class and this object will have
    // access to these atributtes
    // and for allow the object to access this atribbutes we have to create
    // methods(set and get)

    public void print() {
        System.out.println("The name is: " + this.name);
        System.out.println("The age is: " + this.age);
    }

    public void setName(String name) {// set is a convention to put values
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public String getName() {// get is a convention to return values
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
