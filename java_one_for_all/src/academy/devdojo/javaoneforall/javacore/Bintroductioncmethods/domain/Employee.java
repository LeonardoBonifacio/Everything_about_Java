package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salarys;

    public void print(){
        System.out.println("---------------------------------------");
        System.out.println("Name is:" + this.name);
        System.out.println("Age is: " + this.age);
        System.out.println("Salary are :" );
        if (salarys == null) return;
        for (double salary : this.salarys) {
            System.out.print(" " + salary +", ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        calculateAndPrintAverageSalaries(salarys);
    }

    public void calculateAndPrintAverageSalaries(double[] salarys){
        if (salarys == null) return;
        double sum = 0;
        for (double salary : salarys) {
            sum += salary;
        }
        sum = sum/salarys.length;
        System.out.println("The average of the salary is: " + sum);
        System.out.println("---------------------------------------");

    }
}
