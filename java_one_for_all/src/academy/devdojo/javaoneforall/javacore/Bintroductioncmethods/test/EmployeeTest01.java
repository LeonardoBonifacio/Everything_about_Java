package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Leonardo Bonifácio";
        employee.age = 20;
        //employee.salarys = new double[] {3000.0, 4000.0, 7000.0};

        employee.print();
        //employee.calculateAndPrintAverageSalaries(employee.salarys);
    }
}
