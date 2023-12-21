package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        // usualy when you are creating objects that has like associations you start with the object that has fewer associations, because it means that you don't have many dependencies
        // in this case the object with fewer associations is Professor
        // Professor  M -- 1 School | one professor belongs only a one School but one School can have many Professors
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = new Professor[]{professor1, professor2};
        School school = new School("Konoha", professors);

        school.print();
    }
}
