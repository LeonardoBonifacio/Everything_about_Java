package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Midorya";
        student01.gender = 'M';
        student01.age = 14;

        
        student02.name = "Sakura";
        student02.gender = 'F';
        student02.age = 17;


        student01.print();

        student02.print();


    }
}
