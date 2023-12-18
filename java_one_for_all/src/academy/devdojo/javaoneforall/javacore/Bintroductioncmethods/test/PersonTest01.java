package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        // we can do this anymore, because the atributtes of this object are privates and it's means which only the methods this class of the object can access them
        //person.name = "Jiraya";
        //person.age = 70;

        person.setName("Madara");
        person.setAge(-1);
        //person.print();
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
