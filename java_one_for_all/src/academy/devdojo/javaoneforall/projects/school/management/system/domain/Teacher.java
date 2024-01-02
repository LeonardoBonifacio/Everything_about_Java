package academy.devdojo.javaoneforall.projects.school.management.system.domain;

/**
 * Created by Leonardo on 01/01/2024
 * this class is responsible for keeping the track
 * of teacher's id, name and salary
 */
public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;


    /**
     * Creates a new Teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return return the name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return return the salary of the teacher
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * @return returne the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * Adds to the salaryEarned
     * Removes from the total money earned by the School
     * @param salary
     */
    public void receiveSalary(double salary){
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + this.name +
        " Total salary earned so far $" + this.salaryEarned;
    }
}
