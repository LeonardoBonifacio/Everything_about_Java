package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salarys;
    private double average;

    public void print() {
        System.out.println("-------------------------------------------------");
        System.out.println("Name is:" + this.name);
        System.out.println("Age is: " + this.age);
        System.out.print("Salary are :");
        if (salarys == null)
            return;
        for (double salary : this.salarys) {
            System.out.print(" " + salary + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        calculateAndPrintAverageSalaries(salarys);
    }

    public void calculateAndPrintAverageSalaries(double[] salarys) {
        if (salarys == null)
            return;

        for (double salary : salarys) {
            average += salary;
        }
        average /= salarys.length;
        System.out.println("The average of the salary is: " + average);
        System.out.println("-------------------------------------------------");

    }

    // getter and setter can actually be done automaticaly by ide, pressing in a
    // blank field crtl + espace and search for the set and get method which you
    // want
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalarys() {
        return this.salarys;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public double getAverage() {
        return this.average;
    }
}
