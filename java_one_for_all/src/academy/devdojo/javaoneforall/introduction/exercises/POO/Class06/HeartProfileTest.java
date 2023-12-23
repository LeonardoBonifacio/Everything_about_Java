package Exercises.POO.Class06;

public class HeartProfileTest {
    public static void main(String[] args) {
        HealthProfile person = new HealthProfile("Leonardo", "Bonifácio",'M', 16, 11, 2003, 1.74, 70);

        System.out.println("First Name is: " + person.getFirstName());
        System.out.println("Last Name is: " + person.getLastName());
        System.out.println("Gender is: " + person.getGender());
        System.out.println("Date of birth is: " + person.getDateOfBirth());
        System.out.println("Height is: " + person.getHeight());
        System.out.println("Weight is: " + person.getWeight());
        System.out.println("Person's age is: " + person.calculatesAges());
        System.out.println("Person's IMC is: " + person.calculatesI_M_C());
        System.out.println("Person's maximum heart care rate is: " + person.calculatesMaximumHeartRate());
        System.out.println("Person's target-heart-rate-range is: " + person.calculatesTargetHeartRate());
    }
}
