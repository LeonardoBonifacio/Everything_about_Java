package academy.devdojo.javaoneforall.introduction.exercises.POO.Class06;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private char gender;
    private int dayBorn;
    private int monthBorn;
    private int yearBorn;
    private String dateOfBirth;
    private double height;
    private double weight;
    private int age;
    private double imc;

    public HealthProfile(String firstName, String lastName, char gender, int dayBorn, int monthBorn, int yearBorn, double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayBorn = dayBorn;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
        this.dateOfBirth = this.dayBorn + "/" + this.monthBorn + "/" + this.yearBorn;
        this.height = height;
        this.weight = weight;
        this.age  = calculatesAges();
        this.imc = calculatesI_M_C();
    }


    public double calculatesI_M_C(){
        this.imc = weight/(height * height);
        return this.imc;
    }

    public int calculatesMaximumHeartRate(){
        return 220 - calculatesAges();
    }

    public double calculatesTargetHeartRate(){
        int maximumHeartRate = calculatesMaximumHeartRate();
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

    public int calculatesAges(){
        int presentYear = 2023;
        this.age = presentYear - this.yearBorn;
        return this.age;
    }


    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getDayBorn() {
        return this.dayBorn;
    }

    public double getImc() {
        return this.imc;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public char getGender() {
        return this.gender;
    }

    public double getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getMonthBorn() {
        return this.monthBorn;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getYearBorn() {
        return this.yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

   public void setWeight(double weight) {
       this.weight = weight;
   } 

   public void setAge(int age) {
       this.age = age;
   }

   public void setImc(double imc) {
       this.imc = imc;
   }

   public void setMonthBorn(int monthBorn) {
       this.monthBorn = monthBorn;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public void setHeight(double height) {
       this.height = height;
   }

   public void setGender(char gender) {
       this.gender = gender;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public void setDayBorn(int dayBorn) {
       this.dayBorn = dayBorn;
   }

   public void setDateOfBirth(int dayBorn, int monthBorn, int yearBorn) {
       this.dateOfBirth = dayBorn + "/" + monthBorn + "/" + yearBorn;;
   }
}
