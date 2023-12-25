package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Employee extends Object {// Class Object is the root of the class hierarchy.
                                      // Every class has Object as a superclass.
                                      // All objects, including arrays, implement
                                      // the methods of this class.
    protected String name;
    protected String socialSecurity;
    protected Address address;
    protected double salary;
    // this new acces modifier(proctected) has two rule which are:
    // first rule:
    // all subclasses it doesn't matter where they are(packages), they can access
    // the attributes
    // like they are public
    // second rule:
    // all the other classes in the same package can do the same even if they are
    // not subclasses

    static {
        System.out.println("Inside Employee Static init Block");
    }

    {
        System.out.println("Inside Employee init block one");
    }

    {
        System.out.println("Inside Employee init block two");
    }

    public Employee(String name) {
        super();// even though you don't write this super constructor it will be called
                // automaticaly in every class because all class are sub classe of Class object
        System.out.println("Inside Employee constructor");
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.socialSecurity);
        System.out.println(this.salary);
        System.out.println(this.address.getStreet() + " " + this.address.getZipcode());
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurity() {
        return this.socialSecurity;
    }

    public String getName() {
        return this.name;
    }
}
