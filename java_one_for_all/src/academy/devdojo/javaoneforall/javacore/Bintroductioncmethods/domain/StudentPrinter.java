package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class StudentPrinter {

    public void print(Student student){
        // student.name = "Boa Hancock";
        // passing a reference variable like a objetc inside in one method allow the method to acces the values inside the space in memory
        // and change them, beyond that allow see everything inside this object(reference variable)
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);
    }
}
