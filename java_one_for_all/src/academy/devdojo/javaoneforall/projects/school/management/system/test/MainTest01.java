package academy.devdojo.javaoneforall.projects.school.management.system.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javaoneforall.projects.school.management.system.domain.School;
import academy.devdojo.javaoneforall.projects.school.management.system.domain.Student;
import academy.devdojo.javaoneforall.projects.school.management.system.domain.Teacher;

public class MainTest01 {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 700);
        Teacher melissa = new Teacher(2, "Melissa", 900);
        Teacher vanderhorn = new Teacher(3,"VanderHorn",499);
        
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);
        
        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshit = new Student(2, "Rakshith Vsudev", 12);
        Student rabbi = new Student(3, "Rabbi", 7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshit);
        studentList.add(rabbi);


        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(4, "Megan", 900);
        ghs.addTeacher(megan);
        
        
        tamasha.payFees(5000);
        rakshit.payFees(4000);
        System.out.println("GHS has earned: $" + ghs.getTotalMoneyEarned());

        System.out.println("----------Making School PAY SALARY----------");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to" + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to" + vanderhorn.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println();

        System.out.println(rakshit);
        
        melissa.receiveSalary(melissa.getSalary());

        System.out.println(melissa);

    }
}
