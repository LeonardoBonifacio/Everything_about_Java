package academy.devdojo.javaoneforall.introduction.exercises.POO.Class03;

public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        }
        if (lastName.length() > 0) {
            this.lastName = lastName;
        }
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        }
    }

    public void setLirstName(String lastName) {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        }
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void displayEmployeeYearSalary() {
        if (this.monthlySalary > 0) {
            System.out.println("The anual salary this employee(" + this.firstName + " " + lastName + ") is: "
                    + this.monthlySalary * 12);
        }
    }
}
