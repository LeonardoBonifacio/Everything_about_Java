package academy.devdojo.javaoneforall.javacore.Bintroductioncmethods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print(){
        System.out.println("--------------------");
        System.out.println(this.gender);// 'this' keyword do reference for the atributtes of the object which is being used
        System.out.println(this.name);
        System.out.println(this.age);// if you don't have any local variable with the same name, you can also write without the
                                     // keyword 'this', it's still works acessing the atributes of the object that is being used
                                     // but the best practice is to add 'this' keyword because you are telling for everybody that
                                     // reads this code the line 10,11 and 12 they are getting data directly from the class attributes
    }
}
