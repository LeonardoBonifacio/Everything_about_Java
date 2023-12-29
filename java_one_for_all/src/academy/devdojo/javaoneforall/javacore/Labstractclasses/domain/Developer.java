package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    // once you have a abstract method in one class which you are inheritance, you
    // must override this method and provide your own implementation for this method in all your subclasses
    @Override
    public String toString() {
        return "Developer{Name: " + this.name + ", Salary: " + this.salary + "}";
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.11;
    }
}
