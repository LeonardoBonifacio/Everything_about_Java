package academy.devdojo.javaoneforall.introduction.exercises.POO.Class03;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Leonardo", "Bonifácio", 4000);
        Employee employee2 = new Employee("Keven", "Christian", 4000);

        employee1.displayEmployeeYearSalary();
        employee2.displayEmployeeYearSalary();


        System.out.println("After a 10% raise ");
        employee1.setMonthlySalary(employee1.getMonthlySalary() + employee1.getMonthlySalary() * 0.10);
        employee1.displayEmployeeYearSalary();
        
        employee2.setMonthlySalary(employee2.getMonthlySalary() + employee2.getMonthlySalary() * 0.10);
        employee2.displayEmployeeYearSalary();
    }
}
