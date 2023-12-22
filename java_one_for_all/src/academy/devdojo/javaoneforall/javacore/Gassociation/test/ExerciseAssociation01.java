package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Place;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Professor02;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Seminars;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Student;

public class ExerciseAssociation01 {
    public static void main(String[] args) {
        Place place1 = new Place("Egg Head");
        Place place2 = new Place("Grand line");

        Student student1 = new Student("Luffy", 17);
        Student student2 = new Student("Ace", 20);
        Student student3 = new Student("Jinbe", 40);
        Student student4 = new Student("Nami", 20);

        Student[] seminarStudent1 = {student1, student2};
        Student[] seminarStudent2 = {student3, student4};

        Seminars seminar1 = new Seminars("Finding One Piece", place1, seminarStudent1);
        Seminars seminar2 = new Seminars("Finding lost secule", place2, seminarStudent2);

        student1.setSeminar(seminar1);
        student2.setSeminar(seminar1);
        student3.setSeminar(seminar2);
        student4.setSeminar(seminar2);

        Seminars[] availablSeminars = {seminar1, seminar2};

        Professor02 professor = new Professor02("White Beard", "Pirates", availablSeminars);

        professor.print();
    }
}
