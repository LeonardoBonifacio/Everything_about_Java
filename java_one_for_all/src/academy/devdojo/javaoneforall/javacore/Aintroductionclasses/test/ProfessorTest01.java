package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.age = 149;
        professor.name = "Kami";
        professor.gender = 'M';

        System.out.println("Professsor:" + professor.name + 
                           " Age:" + professor.age + 
                           " Gender:" + professor.gender);
    }
}
