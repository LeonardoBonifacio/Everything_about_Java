package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Seminars {
    private String title;
    private Place place;
    private Student[] students;

    public Seminars(String title, Place place){
        this.title = title;
        this.place = place;
    }

    public Seminars(String title, Place place, Student[] students){
        this(title, place);
        if (students != null && students.length > 0) {
            this.students = students;
        }
    }

    public void print(){
        System.out.println("This seminar title is: " + this.title);
        System.out.println("The place where this seminar will occur is: " + this.place.getAddress());
        if (this.students != null && this.students.length > 0) {
            for (Student student : students) {
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Age: " + student.getAge());
            }
        }
    }

    public Place getPlace() {
        return this.place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return this.title;
    }

    public Student[] getStudents() {
        return this.students;
    }
}
