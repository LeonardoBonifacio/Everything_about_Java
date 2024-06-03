package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

public class Manager extends Employee {
    // the Manager class is a concrete subclass of a abstract class Employee
    // all the classes that are subclasses basically will be the ones responsible
    // for giving the abstract the template itself life
    public Manager(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public void calculateBonusSalary(){
        this.salary = this.salary + this.salary * 0.4;
    }

    @Override
    public String toString() {
        return "Manager{Name: " + this.name + ", Salary: " + this.salary + "}";
    }
}


