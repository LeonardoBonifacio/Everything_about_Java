package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Student {
    private String name;
    private int age;
    private Seminars seminar;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminars seminar){
        this(name, age);
        this.seminar = seminar;
    }

    public void print(){
        System.out.println("Name of this student is:" + this.name);
        System.out.println("Age of this student is: " + this.age);
        if (this.seminar != null) {
            System.out.println("The seminar which this student's watching is: " + this.seminar.getTitle()) ;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSeminar(Seminars seminar) {
        this.seminar = seminar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seminars getSeminar() {
        return this.seminar;
    }

    public String getName() {
        return this.name;
    }
}
