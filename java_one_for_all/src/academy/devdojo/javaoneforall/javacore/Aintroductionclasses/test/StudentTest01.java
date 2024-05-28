package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import java.util.Arrays;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Student;// telling where the class(Student) is

public class StudentTest01 {
    public static void main(String[] args) {
        // Creating an object with our class Student
        // Syntax how to create an object
    //NameClass  nameVariable   CreatingWithOurClassStudent new Student()
        Student student = new Student(); // all objects can be initializing with null
        // set the values of the atributes that my own object has
        student.age = 21;
        student.gender = 'M';
        student.name = "Luffy";
        // acessing this atributes of my object(created by my class Student)
        System.out.println("The name this is student is: [" + student.name + "]");       
        System.out.println("The age of this student is: " + student.age);        
        System.out.println("The gender of this student is: " + student.gender);     
        

    }
}
