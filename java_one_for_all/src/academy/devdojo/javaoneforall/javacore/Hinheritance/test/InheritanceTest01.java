package academy.devdojo.javaoneforall.javacore.Hinheritance.test;

import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th Ave");
        address.setZipcode("12349");

        Employee employee = new Employee("Toyohisa");
        employee.setSocialSecurity("121212");
        employee.setSalary(12000);
        employee.setAddress(address);
        employee.print();
        // i cannot access more even the attributes in a public way of this object(employee)
        // like this employee.name
        // because the attributes are proctected
        // which means that only sub class and class in the same package can do this
        // for access the attributes now it's necesary use the getter and setter methods
        
        System.out.println("-------------------------------");

        Manager manager = new Manager("Naruto");
        manager.setSocialSecurity("131313");
        manager.setSalary(130000);
        manager.setAddress(address);
        manager.setDepartment("IT");
        manager.print();

        // as every class has Class object as Super class, in each object already exists methods
        // which implement the methods of this class. Like equals(), wait() and getClass()



        
    }
}
