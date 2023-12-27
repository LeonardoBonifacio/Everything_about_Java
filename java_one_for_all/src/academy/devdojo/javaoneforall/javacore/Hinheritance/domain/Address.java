package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Address {
    private String street;
    private String zipcode;

    public void print() {
        // i can do this because this whole class Employee has attributes protected
        // and he stood in the same package which this class(Address) even though this
        // class isn't a sub class of Employee
        Employee employee = new Employee(" ");
        System.out.println(employee.name);
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public String getStreet() {
        return this.street;
    }
}
