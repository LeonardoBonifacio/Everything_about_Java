package academy.devdojo.javaoneforall.projects.school.management.system.domain;

/**
 * Created by Leonardo in 01/01/2024
 * This class is responsible for keeping the track
 * of students fees, name, grade e fees paid
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student by initializing
     * Fees for every student is $30,000 Per year
     * Fees paid initially is 0.
     * @param id    id for the student: unique.
     * @param name  name of the student.
     * @param grade grade fo the student
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }


    // Not going to alter student's name and student's id

    /**
     * 
     * @return returne the name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return return the if of the student
     */
    public int getId() {
        return this.id;
    }


    /**
     * 
     * @return return the grade of the student
     */
    public int getGrade() {
        return this.grade;
    }


    /**
     * 
     * @return return the total fees of the student
     */
    public int getFeesTotal() {
        return this.feesTotal;
    }


    /**
     * 
     * @return return the fees paid of the student
     */
    public int getFeesPaid() {
        return this.feesPaid;
    }


    /**
     * Used to update the student's grade.
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }


    /**
     * Keep add the fees to feesPaid field
     * Add the fees to the fess paid.
     * The school is going to receive the funde.
     * @param feee the fees that the student pays
     */
    public void payFees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(this.feesPaid);
    }


    /**
     * 
     * @return the remaining fees.
     */
    public int getRemainFees(){
        return this.feesTotal - this.feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + this.name +
               " Total fees paid so far $" + this.feesPaid;
    }

}
