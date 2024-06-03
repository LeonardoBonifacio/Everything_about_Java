package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

// since we put the keyword abstract in one class, we cannot creating anymore instances(objects) of this class
// but it can be extended(inheritance)
// one class can be either abstract or final
// not both(because one final class cannot be extended and one abstract class must be extended)

public abstract class Employee extends Person {
    // since we extended one abstract class(Employee) with another abstract
    // class(Person)
    // the methods abstracts which the subclass(Employee) inheritance don't must be
    // overriden
    // but if the abstract class(Employee) has subclasses that are own heir, the
    // first concrete class must implement the method abstract which are be
    // inheritance by the class(grandfather(Person)), but we can also give a
    // implementation overriding by the Employee class, where the all subclasses of
    // Employee will going to inheritance
    // in this scenario Class Person is GrandFather
    // Class Employee is Father
    // and Class Manager and Developer are sons

    // what's the purpose of abstract classe?
    // basically abstract classes they were created to improve the desigh of your
    // software and for by inherited or extendeded
    // Abstract basically blocks anyone to create a object from one class abstract,
    // but allow other classes to extend(inheritance), Employee in this case is like
    // a template, it's an abstract thing that we won't want objects being created
    // from it
    // Classes which are not abstracts are know by Concrete classes
    protected String name;
    protected double salary;

    // even though we cannot create anymore instance of this class, we must have a
    // constructor for this class
    // because the rules of inheritance
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    // when we would like to enforce everybody else that is extending this Employee
    // class to provide their own implementation of one method
    // you just to have to make the method abstract like this above
    public abstract void calculateBonusSalary();
    // abstract methods means that whoever is extending the class(which has this
    // abstract methods) will be forced by the jvm to provide implementation for
    // this method, you just can create the body of this method empty and override
    // it and let this incomplete, but you must at least create the body of the
    // method so that in future you may put your own implementation for this specific
    // class or object

    // just to remember you can have inside one classe both types of
    // methods(abstract(like calculateBonusSalary) and concrete(like toString))
    // but if you have at least one abstract method inside your class you need to
    // make sure that your entire class is also abstract(The type Employee must be
    // an abstract class to define abstract methods)

    // Why is java making an abstract class that useful?
    // there some designs where the method itself can be aplied for all the
    // extending classes(like an deletion method which is useful for all subclasses
    // with the same implementation)
    // and if in  only one class this deletion method should be diferent well there you
    // can go and provide your own implementation of the delete method, but the rest
    // of the subclass is going to use the default method which is coming from the
    // super Class abstract(or concrete)
    @Override
    public String toString() {
        return "Employee{Name: " + this.name + ", Salary: " + this.salary + "}";
    }

    // overriding the print method came from the SuperClass abstract Person
    // and providing this implementation from the subClasses of Employee
    @Override
    public void print() {
        System.out.println("Printing");
    }
    
}
