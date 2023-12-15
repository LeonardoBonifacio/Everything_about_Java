package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class StudentPrinter {

    public void print(Student student){
        // student.name = "Boa Hancock";
        // passing a reference variable like a objetc inside in one method allow the method to acces the values inside the space in memory
        // and change them, beyond that allow see everything inside this object(reference variable)

        System.out.println("-------------------------");
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);

        //Your methods they should not change the  state of the objects you are asking as parameters, so in case that you need to change
        //something you just return your change in one new object completely new and you return that new object
        student.name = "Gohan";// never change the atributes inside the methods which asking for them
        // you can create imutable objects, which not allow to changes anything inside them
    }
}
