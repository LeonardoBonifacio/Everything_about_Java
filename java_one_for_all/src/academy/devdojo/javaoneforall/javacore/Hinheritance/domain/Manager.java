package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

// in java  there are  no multiples inheritance with class, this means that only super class
// can be inherited by one sub-class
public class Manager extends Employee {
    // when we do this(extends) we are saying that manager has everything
    // that the employee have because it is a employee
    // so all the attributes and all the methods are being
    // inherited, manager is everything that employee is and somthing more
    private String department;



    static {
        System.out.println("Inside Manager Static init Block");
    }

    {
        System.out.println("Inside Manager init block one");
    }

    {
        System.out.println("Inside Manager init block two");
    }

    public Manager(String name) {
        super(name);// this supper is calling exatcly the same constructor which already
                    // exist in our super class(Emplyess)
                    // and as all constructor this statement must be the first statement in a
                    // constructor
        System.out.println("Inside Manager constructor");
    }
    // if you have a class being subclassed a super class and you add a constructor
    // you have to make sure that if all the subclasses they have a way to call this
    // constructor
    // in this case i have to make sure that the manager has a constructor that's
    // going to match
    // with the constructor in Employee

    // here the inheritance come in act
    // when should you use inheritance basically when you want extend the
    // functionality or
    // when you want use polimorphism

    // if you have method with the same name in both of the class related
    // super class and sub-class, when you call one method though one object
    // the method which belong a super class will be call
    // but if you have one method with the same name in your sub-class
    // he is going to be call
    @Override // this method is overring the same method from the super class(Employee)
    public void print() {
        super.print();// this super is call the method from the super class but with the values
                      // of the sub class(Manager)
        System.out.println(this.department);
        paymentReport();
    }
    // rule for inheritance
    // all the attributes and methods on the superclass will be inherited by the
    // most specialized
    // class(the subclass)

    public void paymentReport() {
        System.out.println("The employee " + this.name + " from the department " + this.department
                + " received a salary of " + this.salary);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}
