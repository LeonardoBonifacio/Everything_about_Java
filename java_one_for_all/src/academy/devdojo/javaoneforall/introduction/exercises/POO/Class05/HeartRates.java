package academy.devdojo.javaoneforall.introduction.exercises.POO.Class05;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String dateOfBirth;
    private int age;

    public HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        setDateOfBirth(this.dayOfBirth, this.monthOfBirth, this.yearOfBirth);
    }

    public void print(){
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Day of birth: " + this.dayOfBirth);
        System.out.println("Month of birth: " + this.monthOfBirth);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println("Date of birth: " + this.dateOfBirth);
        System.out.println("Person's age is: " + calculatesPersonAges());
        System.out.println("Maximum heart rate is: " + calculatesPersonMaximumHeartRate());
        System.out.println("Target-Heart-Rate-Range is: "+ calculatesPersonTargetHeartRate());
    }

    public int calculatesPersonAges(){
        int presentYear = 2023;
        this.age = presentYear - this.yearOfBirth;
        return this.age;
    }

    public int calculatesPersonMaximumHeartRate(){
        return 220 - calculatesPersonAges();
    }

    public double calculatesPersonTargetHeartRate(){
        int maximumHeartRate = calculatesPersonMaximumHeartRate();
        if (this.age > 80) {
            return maximumHeartRate * 0.4;
        }
        else if (this.age > 70) {
            return maximumHeartRate * 0.5;
        }
        else if (this.age > 50) {
            return maximumHeartRate * 0.6;
        }
        else if (this.age > 40) {
            return maximumHeartRate * 0.7;
        }
        else{
            return maximumHeartRate * 0.8;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(int dayOfBirth, int monthOfBirth, int yearOfbirth) {
        this.dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfbirth;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getDayOfBirth() {
        return this.dayOfBirth;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
}
