package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain;

public class Student {// Create our class Student
    // Set the atributes(characteristics) of this class
    public String name;
    public int age;
    public char gender;
    // isn't a good pratice already define the values inside the atributes this
    // class
    // because each object that we created, will have diferents values for each

    // cohesion is the most import concept of class
    // because how much more cohesion you class have(what's means that your class do
    // little things, most recomended is that the class only do
    // one thing), highly maintainable code it's bring to you

    // never do things like this, chose in other hands create a new Class for the
    // Professor objects
    // public String nameProfessor = "Zoro";
    // public int ageProfessor;
    // public char genderProfessor;
    // this is a bad cohesion

    // Another practice of bad cohesion is put the method main inside our
    // class(which have the only purpose that create objects in other files)
    // public static void main(String[] args) {
    //
    // }

    // always alocate your class in files separeted the file which going execute the
    // whole thing(that has the psvm)
}
