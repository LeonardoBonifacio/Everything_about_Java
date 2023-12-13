package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        // new Student(); it's possible only create one new object like this, but we cannot do anything with he, because
                     // not exist one space in memory which reference for this new object
        Student student = new Student();
        Student student2 = new Student();
        
        student.name = "Sanji";

        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);

        System.out.println("----------------------");

        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.age);
        
    }
}
