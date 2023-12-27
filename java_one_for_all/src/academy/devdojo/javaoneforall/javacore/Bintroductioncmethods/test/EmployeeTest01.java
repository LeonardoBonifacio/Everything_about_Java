package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Leonardo Bonifácio");
        employee.setAge(20);
        employee.setSalarys(new double[] { 3000.0, 4000.0, 7000.0 });

        employee.print();
        // employee.setAverage(102019231);
        // always wondering if you want really give access for modifing one instance
        // variable inside the your object
        // employee.calculateAndPrintAverageSalaries(employee.salarys);
    }
}
