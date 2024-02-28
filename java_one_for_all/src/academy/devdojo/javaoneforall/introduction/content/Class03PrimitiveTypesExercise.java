package academy.devdojo.javaoneforall.introduction.content;

/*
Create variables for the fields described bellow between <> and print the following message: 

I <name> , living at <address> , confirm that i received the salary of <salary> on <date>
 */
public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Leonardo";
        String address = "Urbis path 23";
        float salary = 7234.34F;
        String receivedSalaryDate = "10/10/2010"; // dd/MM/yyyy
        String report = "I " + name + ", living at " + address + ", confirm that i received the salary of R$" + salary
                + " on date " + receivedSalaryDate;
        System.out.println(report);

    }
}
