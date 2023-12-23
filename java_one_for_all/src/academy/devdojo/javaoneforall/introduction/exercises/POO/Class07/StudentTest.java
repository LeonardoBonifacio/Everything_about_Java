package academy.devdojo.javaoneforall.introduction.exercises.POO.Class07;

public class StudentTest {
   public static void main(String[] args) {
      Student account1 = new Student("Jane Green", 93.5);
      Student account2 = new Student("John Blue", 72.75); 

      System.out.println(account1.getName() + "'s letter grade is " + account1.getLetterGrade());      
      System.out.println(account2.getName() + "'s letter grade is " + account2.getLetterGrade()); 
   } 
} 
