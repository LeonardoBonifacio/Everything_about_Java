package academy.devdojo.javaoneforall.projects.school.management.system.domain;

import java.util.List;

/**
 * School can have many teacher, students
 * Implement teachers and student
 * using ArrayList
 * Created by Leonardo on 01/01/2024
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * New School object is created
     * @param teachers list pt teachers in the school
     * @param students list of the students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }


    /**
     * Update the money that is spent by the school which
     * is the salary given by the school to its teachers
     * @param moneySpent the money by school
     */
    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }

    /**
     * Adds the total money earned bu the school
     * @param moneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }


    /**
     * Adds a student to the school
     * @param student student to be added
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }


    /**
     * 
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    /**
     * 
     * @return return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * 
     * @return return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return this.teachers;
    }


    /**
     * 
     * @return return the list of the students in the school
     */
    public List<Student> getStudents() {
        return this.students;
    }


}
